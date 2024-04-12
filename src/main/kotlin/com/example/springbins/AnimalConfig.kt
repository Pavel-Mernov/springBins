package com.example.springbins

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Conditional
import org.springframework.context.annotation.Configuration

@Configuration
class AnimalConfig {

    @Bean
    fun exampleLion() : Animal {
        return Lion("Peter")
    }


    fun cat() : Animal {
        return Cat()
    }

    @Bean(name = ["shaggy dog"])
    @ConditionalOnProperty(prefix = "dog", name = ["name"], havingValue = "shaggy")
    fun shaggy() : Animal
    {
        return Dog("Shaggy")
    }

    @Bean(name = ["duce dog"])
    @ConditionalOnProperty(prefix = "dog", name = ["name"], havingValue = "duce")
    fun duce() : Animal
    {
        return Dog("Duce")
    }

    @Bean(name = ["pablo dog"])
    @ConditionalOnProperty(prefix = "dog", name = ["name"], havingValue = "pablo")
    fun pabloDog() : Animal
    {
        return PabloDog()
    }
}