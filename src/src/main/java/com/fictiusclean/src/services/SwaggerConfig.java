package com.fictiusclean.src.services;

import java.util.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .tags(new Tag("Car Repository", "Repositório dos carros"))
            .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Car Repository",
                null,
                "Version 1.0",
                null,
                new Contact("Thiago Aleixo de Toledo","https://github.com/thiago-aleixo-toledo/Ficticius-Clean", "thiago.aleixo.toledo@gmail.com"),
                null,
                null,
                Collections.emptyList()
            );
    }
}