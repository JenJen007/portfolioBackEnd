package com.jcl.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**").allowedOrigins("https://portfoliojcl.web.app").allowedMethods("GET", "POST", "PUT",
                        "DELETE").allowedHeaders("*");
                registry.addMapping("/auth/**").allowedOrigins("https://portfoliojcl.web.app").allowedMethods("GET", "POST", "PUT",
                        "DELETE").allowedHeaders("*");
            }
        };
    }
}
