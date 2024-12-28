package com.example.podohack;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Slf4j
@Configuration
@RequiredArgsConstructor
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    // WebSocket을 Spring 애플리케이션에 등록하고, 특정 경로에서 WebSocket 요청을 처리하도록 설정하는 클래스

    private final WebSocketChatHandler webSocketHandler;

    //  WebSocket 연결을 위한 설정
    // WebSocket 연결 End-Point: ws://localhost:8080/chats에 연결 시, 동작할 핸들러는 WebSocketChatHandler
    // @param registry
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(webSocketHandler, "/chats")
                .setAllowedOrigins("*"); // 모든 도메인 허용 (CORS)
    }
}
