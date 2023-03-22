package com.example.demo.expense

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import java.time.LocalDate

@Entity
@Table(name = "expenses")
data class ExpenseEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,
        val amount: Double,
        val description: String,
        val category: String,
        val image: String? = null,
        val date: LocalDate = LocalDate.now()
)