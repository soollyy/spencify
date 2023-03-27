package com.example.demo.expense

import java.time.LocalDate
import javax.persistence.*

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