package com.example.backendapp;

public class BackendMessage {
    String version;
    String message;

    public BackendMessage(String version, String message) {
        this.version = version;
        this.message = message;
    }

    public String getVersion() {
        return version;
    }

    public String getMessage() {
        return message;
    }
}
