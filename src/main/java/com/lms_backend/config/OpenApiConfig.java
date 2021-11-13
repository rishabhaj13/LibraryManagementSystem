package com.lms_backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI lmsOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Library Management System (Backend)")
                        .description("This is a Library Management System Backend built using Java, Spring Boot, and MySQL. The project provides RESTful APIs to manage core library operations such as handling books, authors, users, publishers, and borrowing records.")
                        );
    }
}