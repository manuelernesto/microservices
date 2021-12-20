package io.github.manuelernesto.notification.api.controller

import io.github.manuelernesto.clients.notification.NotificationRequest
import io.github.manuelernesto.notification.domain.service.NotificationService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author  Manuel Ernesto (manuelernest0)
 * @date  20/12/21 22:34
 * @version 1.0
 */
@RestController
@RequestMapping("api/v1/send-notification")
class NotificationController(private val service: NotificationService) {

    @PostMapping
    fun sendNotification(@RequestBody notificationRequest: NotificationRequest) {
        service.send(notificationRequest)
    }
}