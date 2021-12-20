package io.github.manuelernesto.fraud.domain.repository

import io.github.manuelernesto.fraud.model.FraudCheckHistory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * @author  Manuel Ernesto (manuelernest0)
 * @date  19/12/21 11:16
 * @version 1.0
 */
@Repository
interface FraudCheckHistoryRepository : JpaRepository<FraudCheckHistory, Int>