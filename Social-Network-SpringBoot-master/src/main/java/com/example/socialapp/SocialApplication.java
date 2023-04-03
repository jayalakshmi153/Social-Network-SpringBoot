package com.example.socialapp;

import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableTransactionManagement
@EnableSwagger2
public class SocialApplication {

    public static void main(String[] args) {

        SpringApplication.run(SocialApplication.class, args);

    }



    // TODO * Configuring this bean should not be needed once Spring Boot's Thymeleaf starter includes configuration
    // TODO   for thymeleaf-extras-springsecurity5 (instead of thymeleaf-extras-springsecurity4)
    @Bean
    public SpringSecurityDialect securityDialect() {
        return new SpringSecurityDialect();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("SocialNetwork API")
                .description("SocialNetwork API for developers").version("2.0").build();
    }

}