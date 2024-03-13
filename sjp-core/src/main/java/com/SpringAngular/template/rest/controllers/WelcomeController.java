package com.SpringAngular.template.rest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping(value = "/welcome")
    public ResponseEntity<String> welcome() {
        String str = "Welcome to Spring Boot and Angular Template!";
        return ResponseEntity.ok(str);
    }
}
