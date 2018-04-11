package com.openclose.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig
{

	@Bean
	public Docket api()
	{
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.openclose.controller")).paths(regex("/.*")).build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo()
	{
		return new ApiInfo("Open Close Mobile App REST API",
				"The api's expose the endpoint of the services required for Stores creation,updation,retrival and also status of the stores whether opened or closed",
				"API TOS", "Terms of service", new Contact("", "", ""), "License of API", "API license URL",
				Collections.EMPTY_LIST);
	}
}
