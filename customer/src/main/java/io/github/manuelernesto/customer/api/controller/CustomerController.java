package io.github.manuelernesto.customer.api.controller;

import io.github.manuelernesto.customer.domain.service.CustomerService;
import io.github.manuelernesto.customer.model.request.CustomerRegistrationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 11/12/21 13:09
 */

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record CustomerController(CustomerService customerService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
        log.info("new customer registration {}", customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }
}
