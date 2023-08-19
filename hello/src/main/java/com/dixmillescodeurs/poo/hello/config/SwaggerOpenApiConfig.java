package com.dixmillescodeurs.poo.hello.config;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.security.OAuthFlows;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import java.lang.annotation.Annotation;

@Configuration
@SecurityScheme(
		  name = "Bearer Authentication",
		  type = SecuritySchemeType.HTTP,
		  bearerFormat = "JWT",
		  scheme = "bearer"
		)
public class SwaggerOpenApiConfig {

	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI().addSecurityItem(new SecurityRequirement().
						addList("Bearer Authentication"))
				.info(new Info().title("Voyage API")
						.description("Voyage of API.")
						.version("1.0")
						.version("1.0").contact(new Contact().name("Daniel Fouomene")
								.email( "www.fouomene.com").url("fouomenedaniel@gmail.com"))
						.license(new License().name("License of API")
								.url("API license URL")));
	}

 }
	