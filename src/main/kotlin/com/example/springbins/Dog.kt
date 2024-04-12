package com.example.springbins

import org.springframework.context.annotation.Conditional
import org.springframework.stereotype.Component


open class Dog(override val name : String) : Animal {
    override val sound: String
        get() = "Woof!"
}