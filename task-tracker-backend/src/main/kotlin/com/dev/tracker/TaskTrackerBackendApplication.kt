package com.dev.tracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskTrackerBackendApplication

fun main(args: Array<String>) {
    runApplication<TaskTrackerBackendApplication>(*args)
}
