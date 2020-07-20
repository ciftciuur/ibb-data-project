package com.resttemplate.ibbdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class IbbDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(IbbDataApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /*
    TODO : first step created all rest template functions
    TODO : second step all result data , save mongodb database

     */
}
