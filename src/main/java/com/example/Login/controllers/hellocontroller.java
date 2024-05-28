package com.example.Login.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @GetMapping("/HelloWorld")
    public String HelloWorld(){
        System.out.println("HelloWorld");
        return"Hello World";
    }
}
