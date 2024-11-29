package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class MySwaggerConfig {

	@Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info().title("Demo API").description("This is a demo API documentation").version("v1"));
    }
}
