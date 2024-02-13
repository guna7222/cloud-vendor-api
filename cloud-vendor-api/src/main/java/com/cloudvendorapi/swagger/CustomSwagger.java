package com.cloudvendorapi.swagger;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomSwagger {

    @Bean
   public OpenAPI customOpenApi(){
        return new OpenAPI().info(new Info().title("Cloud Vendor Details")
                .version("v1").description("provides cloud vendor details")
                .contact(new Contact().email("rrgunasekhar@gmail.com").name("R GunaSekhar")));
    }
}
