package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HelloWorldApplication {
    
    @GetMapping("/")
    public String hello() {
        return "Parte 1 guia: Hola Mundo 🌎 desde Cloud Run ☁️🏃🏻‍➡️ \nParte 2 guia: Cloud Build ☁️🏗️ a sido activado satisfactoriamente";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
