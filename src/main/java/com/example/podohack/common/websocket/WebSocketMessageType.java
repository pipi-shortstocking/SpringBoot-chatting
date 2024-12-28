package com.example.podohack.common.websocket;

public enum WebSocketMessageType {
    // WebSocket 메세지 타입

    ENTER("ENTER"),
    TALK("TALK"),
    EXIT("EXIT");

    private final String type;

    WebSocketMessageType(String type) {
        this.type = type;
    }

    public String getValue() {
        return this.type;
    }
}