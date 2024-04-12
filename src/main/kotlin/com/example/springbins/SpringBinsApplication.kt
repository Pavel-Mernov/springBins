package com.example.springbins

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBinsApplication

fun main(args: Array<String>) {


    val context = runApplication<SpringBinsApplication>(*args)

    val catComponent: Animal = context.getBean(Cat::class.java)
    val lionConfig : Animal = context.getBean(Lion::class.java)
    val doggy : Animal = context.getBean(Dog::class.java)

    println("Cat. Name = ${catComponent}. Say something: ${catComponent.sound}")
    println("Lion. Name = ${lionConfig.name}. Say something: ${lionConfig.sound}")
    println("Dog. Name = ${doggy.name}. Say something: ${doggy.sound}")
}
