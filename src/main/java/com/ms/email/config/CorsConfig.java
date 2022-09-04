package com.ms.email.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") //registro adicionar mapeamento
                        .allowedMethods("GET", "POST") //métodos permitidos
                        .allowedHeaders("*") //cabeçalhos permitidos
                        .allowedOrigins("*"); //origens permitidas.
            }
        };
    }
}