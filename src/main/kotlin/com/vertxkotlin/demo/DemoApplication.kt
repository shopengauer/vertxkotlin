package com.vertxkotlin.demo

import com.pdf.textparser.platform.RestVerticle
import io.vertx.core.AbstractVerticle
import io.vertx.core.Future
import io.vertx.core.Vertx
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class DemoApplication{



}

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}

@Configuration
open class VerticleConfiguration{

    @Bean
    fun restVerticle() = RestVerticle()

    @Bean
    open fun init() = CommandLineRunner{
        val vertx: Vertx = Vertx.vertx()
        vertx.deployVerticle(restVerticle())

    }

}

