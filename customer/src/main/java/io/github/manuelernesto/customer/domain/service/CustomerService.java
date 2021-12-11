package io.github.manuelernesto.customer.domain.service;

import io.github.manuelernesto.customer.model.Customer;
import io.github.manuelernesto.customer.model.request.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 11/12/21 13:19
 */
@Service
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {

        var customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // todo: check if email valid
        // todo: check if email not taken
        // todo: store customer in db
    }
}
