package br.com.devinhouse.keycloak.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KeycloakController {
    
    @GetMapping(path = "/users")
    public ResponseEntity<String> getUser(){
        return ResponseEntity.ok("Hello World!");
    }

}
