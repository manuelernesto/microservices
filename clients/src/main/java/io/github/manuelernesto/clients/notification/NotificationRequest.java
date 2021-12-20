package io.github.manuelernesto.clients.notification;

/**
 * @author Manuel Ernesto (manuelernest0)
 * @version 1.0
 * @date 20/12/21 22:25
 */
public record NotificationRequest(Integer customerId, String customerEmail, String message) {
}
