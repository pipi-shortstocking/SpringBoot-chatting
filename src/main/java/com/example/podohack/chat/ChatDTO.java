package com.example.podohack.chat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ChatDTO<T> {
    private T message;
    private final Long chatRoomId;
    private final String username;
}
