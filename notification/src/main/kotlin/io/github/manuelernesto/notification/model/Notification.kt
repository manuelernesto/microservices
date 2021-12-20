package io.github.manuelernesto.notification.model

import java.time.LocalDateTime
import javax.persistence.*

/**
 * @author  Manuel Ernesto (manuelernest0)
 * @date  20/12/21 22:13
 * @version 1.0
 */

@Entity
data class Notification(
    @Id
    @SequenceGenerator(name = "notification_id_sequence", sequenceName = "notification_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notification_id_sequence")
    val notificationId: Int,
    var toCustomerId: Int,
    var toCustomerEmail: String,
    var sender: String,
    var message: String,
    var sentAt: LocalDateTime
) {
    constructor() : this(0, 0, "", "", "", LocalDateTime.now())
}