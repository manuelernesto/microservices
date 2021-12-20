package io.github.manuelernesto.fraud.model


import java.time.LocalDateTime
import javax.persistence.*

/**
 * @author  Manuel Ernesto (manuelernest0)
 * @date  19/12/21 11:04
 * @version 1.0
 */
@Entity
data class FraudCheckHistory(
    @Id
    @SequenceGenerator(name = "fraud_id_sequence", sequenceName = "fraud_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fraud_id_sequence")
    val id: Int,
    var customerId: Int,
    var isFraudster: Boolean,
    var createdAt: LocalDateTime
) {
    constructor() : this(0, 0, false, LocalDateTime.now())
}
