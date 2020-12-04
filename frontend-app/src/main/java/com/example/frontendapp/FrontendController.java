package com.example.frontendapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class FrontendController {

    WebClient webClient;
    AppProperties appProperties;

    public FrontendController(WebClient.Builder builder, AppProperties appProperties) {
        this.webClient = builder.build();
        this.appProperties = appProperties;
    }

    @GetMapping("/")
    public FrontendMessage index() {
        BackendMessage backendMessage = webClient.get()
                .uri(appProperties.getUrl())
                .retrieve()
                .bodyToMono(BackendMessage.class)
                .block();

        FrontendMessage message = new FrontendMessage(appProperties.getVersion(), "Hello, from Frontend", backendMessage);
        return message;
    }
}
