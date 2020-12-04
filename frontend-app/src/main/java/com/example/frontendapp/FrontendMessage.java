package com.example.frontendapp;

public class FrontendMessage {
    String version;
    String message;
    BackendMessage backendMessage;

    public FrontendMessage(String version, String message, BackendMessage backendMessage) {
        this.version = version;
        this.message = message;
        this.backendMessage = backendMessage;
    }

    public String getVersion() {
        return version;
    }

    public String getMessage() {
        return message;
    }

    public BackendMessage getBackendMessage() {
        return backendMessage;
    }
}
