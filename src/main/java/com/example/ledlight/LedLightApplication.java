package com.example.ledlight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LedLightApplication {

    public static void main(String[] args) {
        SpringApplication.run(LedLightApplication.class, args);
    }

}
