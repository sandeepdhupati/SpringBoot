package com.boot.springboot_demo_2;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// DEVELOPMENT(LAPTOP) -->INTEGRATION(SERVER)-->UAT(USER ACCEPTANCE TESTING ENVIRONMENT)--> PRODUCTION(SERVER)
@Component
public class GetFromProperties {

    @Value("${database.url}")
    private String dbURL;

    @PostConstruct
    public void postConstruct(){
        System.out.println("DB URL ---> "+dbURL);
    }
}
