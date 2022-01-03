package com.wwang.mybackendkickstarter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class MyBackendKickstarterApplication

fun main(args: Array<String>) {
    runApplication<MyBackendKickstarterApplication>(*args)
}
