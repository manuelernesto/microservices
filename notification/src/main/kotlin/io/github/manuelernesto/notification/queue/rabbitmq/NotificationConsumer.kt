package io.github.manuelernesto.notification.queue.rabbitmq

import io.github.manuelernesto.clients.notification.NotificationRequest
import io.github.manuelernesto.notification.domain.service.NotificationService
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

/**
 * @author  Manuel Ernesto (manuelernest0)
 * @date  24/12/21 12:03
 * @version 1.0
 */

@Component
class NotificationConsumer(private val notificationService: NotificationService) {

    @RabbitListener(queues = ["\${rabbitmq.queue.notification}"])
    fun consumer(request: NotificationRequest) {
        //log consumed {} from queue
        notificationService.send(request)
    }
}