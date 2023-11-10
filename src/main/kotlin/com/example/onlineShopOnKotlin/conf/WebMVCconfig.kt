package com.example.onlineShopOnKotlin.conf

import ch.qos.logback.core.joran.util.StringToObjectConverter
import org.springframework.context.annotation.Configuration
import org.springframework.format.FormatterRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebMVCconfig: WebMvcConfigurer {

    override fun addFormatters(registry: FormatterRegistry) {
        registry.addConverter(StringToObjectConverter())
    }
}