package io.github.manuelernesto.notification.domain.service

import io.github.manuelernesto.clients.notification.NotificationRequest
import io.github.manuelernesto.notification.domain.repository.NotificationRepository
import io.github.manuelernesto.notification.model.Notification
import org.springframework.stereotype.Service
import java.time.LocalDateTime

/**
 * @author  Manuel Ernesto (manuelernest0)
 * @date  20/12/21 22:23
 * @version 1.0
 */
@Service
class NotificationService(private val repository: NotificationRepository) {

    fun send(notificationRequest: NotificationRequest) = repository.save(Notification().apply {
        this.toCustomerId = notificationRequest.customerId
        this.toCustomerEmail = notificationRequest.customerEmail
        this.sender = "Manuel Ernesto"
        this.message = notificationRequest.message
        this.sentAt = LocalDateTime.now()
    })

}