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
@SpringBootApplication(
    scanBasePackages = ["io.github.manuelernesto.notification", "io.github.manuelernesto.amqp"],
)
open class NotificationApplication

/*open class NotificationApplication(
    private val producer: RabbitMQMessageProducer,
    private val notificationConfig: NotificationConfig
) : CommandLineRunner {

    override fun run(vararg args: String?) {
        producer.publish("foo", notificationConfig.internalExchange, notificationConfig.internalNotificationRoutingKey)
    }

}*/

fun main(args: Array<String>) {
    runApplication<NotificationApplication>(*args)
}