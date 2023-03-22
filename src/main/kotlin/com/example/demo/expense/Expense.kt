package com.example.demo.expense
import java.time.LocalDate

data class Expense(
        val id: Long? = null,
        val amount: Double,
        val description: String,
        val category: String,
        val image: String? = null,
        val date: LocalDate
)