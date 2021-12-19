package io.github.manuelernesto.fraud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

/**
 * @author  Manuel Ernesto (manuelernest0)
 * @date  19/12/21 10:42
 * @version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
open class FraudApplication

fun main(args: Array<String>) {
    runApplication<FraudApplication>(*args)
}