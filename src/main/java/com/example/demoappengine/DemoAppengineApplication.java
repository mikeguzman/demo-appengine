package com.example.demoappengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.example.demoappengine")
@EnableJpaRepositories("com.example.demoappengine.persistence.repo")
@EntityScan("com.example.demoappengine.persistence.model")
public class DemoAppengineApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAppengineApplication.class, args);
    }

}
