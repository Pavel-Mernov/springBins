package com.example.springbins

class Lion(override val name: String) : Animal {
    override val sound: String
        get() = "R-r-r-r-r-r-r!"
}