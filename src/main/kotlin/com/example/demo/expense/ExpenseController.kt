package com.example.demo.expense

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/expenses")
class ExpenseController(@Autowired private val expenseRepository: ExpenseRepository) {

    @GetMapping("/")
    fun getAllExpenses(): ResponseEntity<List<ExpenseEntity>> {
        val expenses = expenseRepository.findAll()
        return ResponseEntity(expenses, HttpStatus.OK)
    }

//    @GetMapping("/{category}")
//    fun getExpensesByCategory(@PathVariable category: String): ResponseEntity<List<ExpenseEntity>> {
//        val expenses = expenseRepository.findByCategory(category)
//        return ResponseEntity(expenses, HttpStatus.OK)
//    }


}
