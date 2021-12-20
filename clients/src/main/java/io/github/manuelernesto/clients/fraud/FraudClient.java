package io.github.manuelernesto.clients.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 20/12/21 21:03
 */

@FeignClient("fraud")
public interface FraudClient {
    @GetMapping(path = "api/v1/fraud-check/{customerId}")
    FraudCheckResponse isFraudster(@PathVariable("customerId") int customerId);
}
