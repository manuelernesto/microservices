package io.github.manuelernesto.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 21/12/21 13:12
 */
@EnableEurekaClient
@SpringBootApplication
public class ApiGWApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGWApplication.class, args);
    }
}
