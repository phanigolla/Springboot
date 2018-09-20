package com.springboot.projects.springbootswaggerexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class SwaggerConfig {
	
		
	
	@Bean
    public Docket apiDocket() {
         //@formatter:off
         return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.springboot.projects.springbootswaggerexample"))
                    .paths(PathSelectors.any())
                    .build()
                    .apiInfo(getApiInfo());
         //@formatter:on
     }

    private ApiInfo getApiInfo() {
    //@formatter:off
    	ApiInfo apiInfo = new ApiInfo(
                "Spring Boot Swagger Example API",
                "Spring Boot Swagger Example API for Youtube",
                "1.0",
                "Terms of Service",
                new Contact("TechPrimers", "https://www.youtube.com/TechPrimers",
                        "techprimerschannel@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", null
        );

        return apiInfo;
    }
     //@formatter:on
   }
