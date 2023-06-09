package dev.bortone.request.credit.system.service

import dev.bortone.request.credit.system.entidade.Customer

interface ICustomerService {
    fun save(customer: Customer): Customer
    fun findById(id: Long): Customer
    fun delete(id: Long):Customer

}