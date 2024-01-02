package com.murali.simplehelloapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleHelloApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleHelloApiApplication.class, args);
    }

    @GetMapping("/")
    public String hello(){
        return "FIRST CODE IN SPRINGBOOT !!!";
    }

}
