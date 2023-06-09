package dev.bortone.request.credit.system.service

import dev.bortone.request.credit.system.entidade.Credit
import java.util.*

interface ICreditService {
    fun save(credit: Credit): Credit
    fun findAllByCustomer(customerId: Long): List <Credit>
    fun findByCreditCode (creditCode: UUID): Credit

}