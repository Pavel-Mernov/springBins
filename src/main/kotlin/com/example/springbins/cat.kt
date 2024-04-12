package com.example.springbins

import com.example.springbins.Animal
import org.springframework.stereotype.Component

@Component
class Cat() : Animal {
    override val name: String
        get() = "Paul"
    override val sound: String
        get() = "Meow-meow!"
}