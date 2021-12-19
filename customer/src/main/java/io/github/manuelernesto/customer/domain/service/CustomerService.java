package io.github.manuelernesto.customer.domain.service;

import io.github.manuelernesto.customer.domain.repository.CustomerRepository;
import io.github.manuelernesto.customer.model.Customer;
import io.github.manuelernesto.customer.model.request.CustomerRegistrationRequest;
import io.github.manuelernesto.customer.model.response.FraudCheckResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 11/12/21 13:19
 */
@Service
public record CustomerService(CustomerRepository customerRepository, RestTemplate restTemplate) {

    private static final String CHECK_FRAUD_URL = "http://localhost:8082/api/v1/fraud-check/{customerId}";

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
        var fraudCheckResponse = restTemplate.getForObject(CHECK_FRAUD_URL, FraudCheckResponse.class, customer.getId());


        if (fraudCheckResponse.fraudster())
            throw new IllegalStateException("Fraudster");


        // todo: send notification
    }
}
