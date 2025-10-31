package main.java.com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HelloWorldApplication {
    
    @GetMapping("/")
    public String hello() {
        return "Hola Mundo 🌎 desde Cloud Run ☁️🏃🏻‍➡️";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
