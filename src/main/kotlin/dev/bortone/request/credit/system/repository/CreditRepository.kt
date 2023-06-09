package dev.bortone.request.credit.system.repository

import dev.bortone.request.credit.system.entidade.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CreditRepository: JpaRepository<Credit, Long>