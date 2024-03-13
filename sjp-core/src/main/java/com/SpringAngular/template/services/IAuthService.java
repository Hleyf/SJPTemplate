package com.SpringAngular.template.services;

import com.SpringAngular.template.entities.dtos.LoginDTO;

public interface IAuthService {
    String login(LoginDTO loginDTO);
}
