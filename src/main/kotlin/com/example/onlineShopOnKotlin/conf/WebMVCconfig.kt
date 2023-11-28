package com.example.onlineShopOnKotlin.conf

import com.cb.util.StringToCommentConverter
import org.springframework.context.annotation.Configuration
import org.springframework.format.FormatterRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebMvcConfig : org.springframework.web.servlet.config.annotation.WebMvcConfigurer {
    override fun addFormatters(registry: FormatterRegistry) {
        registry.addConverter
    }

}