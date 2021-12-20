package io.github.manuelernesto.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 11/12/21 13:00
 */

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = "io.github.manuelernesto.clients")
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
