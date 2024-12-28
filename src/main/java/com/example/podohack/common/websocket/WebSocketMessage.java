package com.example.podohack.common.websocket;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

// WebSocket 메시지 프로토콜
@Getter
public class WebSocketMessage <T> {
    private final WebSocketMessageType type;
    private final T payload;

    @JsonCreator
    public WebSocketMessage(
            @JsonProperty("type") WebSocketMessageType type,
            @JsonProperty("payload") T payload) {
        this.type = type;
        this.payload = payload;
    }
}