package io.github.manuelernesto.customer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 19/12/21 11:59
 */
@Configuration
public class CustomerConfig {


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
