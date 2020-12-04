package com.example.backendapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {

    AppProperties appProperties;

    public BackendController(AppProperties appProperties) {
        this.appProperties = appProperties;

    }

    @GetMapping("/")
    public BackendMessage index() {
        BackendMessage message = new BackendMessage(appProperties.getVersion(), "Hello, from Backend");
        return message;
    }
}
