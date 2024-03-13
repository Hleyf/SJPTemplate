package com.SpringAngular.template.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtAuthResponse {

    private String token;

    private final String tokenType = "Bearer";
}
