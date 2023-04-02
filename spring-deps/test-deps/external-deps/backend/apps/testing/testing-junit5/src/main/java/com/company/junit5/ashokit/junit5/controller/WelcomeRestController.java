package com.company.junit5.ashokit.junit5.controller;

import com.company.junit5.ashokit.junit5.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    @Autowired
    private WelcomeService welcomeService;

    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcomeMessage() {
        String welcomeMessage = welcomeService.getWelcomeMessage();
        return new ResponseEntity<String>(welcomeMessage, HttpStatus.OK);
    }
}
