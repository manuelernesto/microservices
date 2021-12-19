package io.github.manuelernesto.fraud.domain.service

import io.github.manuelernesto.fraud.domain.repository.FraudCheckHistoryRepository
import io.github.manuelernesto.fraud.model.FraudCheckHistory
import org.springframework.stereotype.Service
import java.time.LocalDateTime

/**
 * @author  Manuel Ernesto (manuelernest0)
 * @date  19/12/21 11:18
 * @version 1.0
 */
@Service
class FraudCheckHistoryService(private val repository: FraudCheckHistoryRepository) {

    fun isFraudulentCustomer(customerId: Int): Boolean {

        repository.save(FraudCheckHistory().apply {
            this.customerId = customerId
            this.isFraudster = false
            this.createdAt = LocalDateTime.now()
        })

        return false
    }
}