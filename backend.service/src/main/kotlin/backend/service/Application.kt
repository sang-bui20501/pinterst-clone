package backend.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["backend.service.controller"])
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
