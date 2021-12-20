package io.github.manuelernesto.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 20/12/21 22:38
 */
@FeignClient("notification")
public interface NotificationClient {

    @PostMapping("api/v1/send-notification")
    void sendNotification(@RequestBody NotificationRequest notificationRequest);
}
