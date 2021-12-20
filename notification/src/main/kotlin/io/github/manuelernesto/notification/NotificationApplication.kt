package io.github.manuelernesto.notification

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

/**
 * @author  Manuel Ernesto (manuelernest0)
 * @date  20/12/21 22:06
 * @version 1.0
 */

@EnableEurekaClient
@SpringBootApplication
open class NotificationApplication

fun main(args: Array<String>) {
    runApplication<NotificationApplication>(*args)
}