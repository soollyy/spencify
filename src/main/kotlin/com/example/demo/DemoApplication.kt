package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
@ComponentScan("com.example.demo.expense")
class DemoApplication {
	@GetMapping("/")
	fun hello(): String {
		return "hello world"
	}
}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}


