package com.company.junit5.ashokit.junit5.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String getWelcomeMessage(){
        String welcomeMessage = "Welcome to Ashok IT....";
        return welcomeMessage;
    }
}
