package com.anbesaflow.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AnbesaFlowAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnbesaFlowAuthApplication.class, args);
    }
}
