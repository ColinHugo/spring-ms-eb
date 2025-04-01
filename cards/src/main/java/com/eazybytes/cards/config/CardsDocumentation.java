package com.eazybytes.cards.config;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Cards microservice REST API Documentation",
                description = "EazyBank Cards microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Madan Reddy",
                        email = "tutor@eazybytes.com",
                        url = "https://www.eazybytes.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.eazybytes.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "EazyBank Cards microservice REST API Documentation",
                url = "https://www.eazybytes.com/swagger-ui.html"
        ),
        servers = {
                @Server(
                        description = "Server for test cards dev",
                        url = "http://localhost"
                ),
                @Server(
                        description = "Server for test cards QA",
                        url = "http://localhost:9000/qa"
                )
        }
)
@Configuration
public class CardsDocumentation {
}