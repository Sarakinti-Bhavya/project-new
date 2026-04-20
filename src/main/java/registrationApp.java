package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class RegistrationApp {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationApp.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Registration App Running 🚀";
    }

    @PostMapping("/register")
    public String register(@RequestParam String name) {
        return "User " + name + " registered successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
