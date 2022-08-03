package com.wwang.mybackendkickstarter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
@ConfigurationPropertiesScan
class MyBackendKickstarterApplication

fun main(args: Array<String>) {
    runApplication<MyBackendKickstarterApplication>(*args)
}
