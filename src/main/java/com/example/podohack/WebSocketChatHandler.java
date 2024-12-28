package com.example.podohack;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Slf4j
@Component
@RequiredArgsConstructor
public class WebSocketChatHandler extends TextWebSocketHandler {
    // WebSocket 연결에서 발생하는 다양한 이벤트(연결, 메시지 수신, 종료 등)를 처리하는 클래스

    // WebSocket 연결 성공 시
    // @param session
    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        try {
            session.sendMessage(new TextMessage("WebSocket 연결 성공"));
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
