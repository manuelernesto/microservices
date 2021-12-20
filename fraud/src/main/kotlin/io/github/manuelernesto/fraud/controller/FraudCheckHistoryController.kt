package fraud.api.controller

import io.github.manuelernesto.clients.fraud.FraudCheckResponse
import fraud.domain.service.FraudCheckHistoryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author  Manuel Ernesto (manuelernest0)
 * @date  19/12/21 11:18
 * @version 1.0
 */
@RestController
@RequestMapping("api/v1/fraud-check")
class FraudCheckHistoryController(private val service: FraudCheckHistoryService) {

    @GetMapping(path = ["{customerId}"])
    fun isFraudster(@PathVariable customerId: Int): FraudCheckResponse {
        val isFraudulentCustomer = service.isFraudulentCustomer(customerId)

        return FraudCheckResponse(isFraudulentCustomer)
    }

}