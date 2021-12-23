package io.github.manuelernesto.notification.queue

import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.BindingBuilder
import org.springframework.amqp.core.Queue
import org.springframework.amqp.core.TopicExchange
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author  Manuel Ernesto (manuelernest0)
 * @date  23/12/21 23:07
 * @version 1.0
 */

@Configuration
open class NotificationConfig {

    @Value("\${rabbitmq.exchanges.internal}")
    lateinit var internalExchange: String

    @Value("\${rabbitmq.queue.notification}")
    lateinit var notificationQueue: String

    @Value("\${rabbitmq.routing-keys.internal-notification}")
    lateinit var internalNotificationRoutingKey: String

    @Bean
    open fun internalTopicExchange(): TopicExchange = TopicExchange(this.internalExchange)

    @Bean
    open fun notificationQueue(): Queue = Queue(this.notificationQueue)

    @Bean
    open fun internalToNotificationBinding(): Binding =
        BindingBuilder.bind(notificationQueue()).to(internalTopicExchange()).with(this.internalNotificationRoutingKey)

}