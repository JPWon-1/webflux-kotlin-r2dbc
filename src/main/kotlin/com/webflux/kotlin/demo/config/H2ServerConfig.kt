package com.webflux.kotlin.demo.config

import org.h2.tools.Server
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.context.event.ContextClosedEvent
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.context.event.EventListener
import java.sql.SQLException

@Profile("local")
@Configuration
class H2ServerConfig {
    private lateinit var webServer: Server

    @Value("\${webclient.h2-console-port}")
    var h2ConsolePort: Int? = null

    // ApplicationContext : Bean 생성, Dependency Injection, ResourceLoader, ApplicationEventPublisher등 역할
    // ContextRefreshedEvent: ApplicationContext가 초기화 시에 발생하는 이벤트
    @EventListener(ContextRefreshedEvent::class)
    @Throws(SQLException::class)
    fun start() {
        println("starting at ${h2ConsolePort}")
        webServer = Server.createWebServer("-webPort", h2ConsolePort.toString())
        webServer.start()
    }

    // ContextClosedEvent: ApplicationContext가 종료시에 발생하는 이벤트
    @EventListener(ContextClosedEvent::class)
    fun stop() {
        webServer.stop()
    }
}