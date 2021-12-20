package io.github.manuelernesto.customer.domain.service;

import io.github.manuelernesto.clients.fraud.FraudCheckResponse;
import io.github.manuelernesto.clients.fraud.FraudClient;
import io.github.manuelernesto.clients.notification.NotificationClient;
import io.github.manuelernesto.clients.notification.NotificationRequest;
import io.github.manuelernesto.customer.domain.repository.CustomerRepository;
import io.github.manuelernesto.customer.model.Customer;
import io.github.manuelernesto.customer.model.request.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 11/12/21 13:19
 */
@Service
public record CustomerService(CustomerRepository customerRepository, RestTemplate restTemplate,
                              FraudClient fraudClient, NotificationClient notificationClient) {

    private static final String CHECK_FRAUD_URL = "http://FRAUD/api/v1/fraud-check/{customerId}";

    public void registerCustomer(CustomerRegistrationRequest request) {

        var customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();


        // todo: check if email valid
        // todo: check if email not taken


        //save customer
        customerRepository.saveAndFlush(customer);

        //check if fraudster

        //opt 1 - without using Feign
        //var fraudCheckResponse = restTemplate.getForObject(CHECK_FRAUD_URL, FraudCheckResponse.class, customer.getId());

        //opt 2 - using Feign
        FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());


        if (fraudCheckResponse.fraudster())
            throw new IllegalStateException("Fraudster");


        // todo: make it async. add to queue
        // send notification
        var notificationRequest = new NotificationRequest(customer.getId(), customer.getEmail(), "Sending new notifcation");
        notificationClient.sendNotification(notificationRequest);
    }
}
