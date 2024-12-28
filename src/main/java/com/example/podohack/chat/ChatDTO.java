package com.example.podohack.chat;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
public class ChatDTO<T> {
    private T message;
    private final Long chatRoomId;
    private final String username;

    @JsonCreator
    public ChatDTO(
            @JsonProperty("message") T message,
            @JsonProperty("chatRoomId") Long chatRoomId,
            @JsonProperty("username") String username) {
        this.message = message;
        this.chatRoomId = chatRoomId;
        this.username = username;
    }
}
