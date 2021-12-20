package io.github.manuelernesto.notification.domain.repository

import io.github.manuelernesto.notification.model.Notification
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * @author  Manuel Ernesto (manuelernest0)
 * @date  20/12/21 22:22
 * @version 1.0
 */
@Repository
interface NotificationRepository : JpaRepository<Notification, Int>