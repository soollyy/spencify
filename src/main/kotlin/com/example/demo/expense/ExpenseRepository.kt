package com.example.demo.expense

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ExpenseRepository : JpaRepository<ExpenseEntity, Long> {
//    fun findByCategory(category: String): List<ExpenseEntity>
}
