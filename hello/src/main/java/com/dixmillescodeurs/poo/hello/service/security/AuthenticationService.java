package com.dixmillescodeurs.poo.hello.service.security;

import com.dixmillescodeurs.poo.hello.model.dto.request.SignUpRequest;
import com.dixmillescodeurs.poo.hello.model.dto.request.SigninRequest;
import com.dixmillescodeurs.poo.hello.model.dto.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}