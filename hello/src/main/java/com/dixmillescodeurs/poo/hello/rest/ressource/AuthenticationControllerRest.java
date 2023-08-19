package com.dixmillescodeurs.poo.hello.rest.ressource;

import com.dixmillescodeurs.poo.hello.model.dto.request.SignUpRequest;
import com.dixmillescodeurs.poo.hello.model.dto.request.SigninRequest;
import com.dixmillescodeurs.poo.hello.model.dto.response.JwtAuthenticationResponse;
import com.dixmillescodeurs.poo.hello.service.security.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationControllerRest {
    private final AuthenticationService authenticationService;
    @PostMapping("/signup")
    public ResponseEntity<JwtAuthenticationResponse> signup(@RequestBody SignUpRequest request) {
        return ResponseEntity.ok(authenticationService.signup(request));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SigninRequest request) {
        return ResponseEntity.ok(authenticationService.signin(request));
    }
}