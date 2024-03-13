package com.SpringAngular.template.rest.controllers;

import com.SpringAngular.template.auth.JwtAuthResponse;
import com.SpringAngular.template.entities.dtos.LoginDTO;
import com.SpringAngular.template.services.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

        private final AuthService authService;

        @PostMapping("/login")
        public ResponseEntity<JwtAuthResponse> login(@RequestBody LoginDTO loginDTO) {

            return ResponseEntity.ok(new JwtAuthResponse(authService.login(loginDTO)));
        }


}
