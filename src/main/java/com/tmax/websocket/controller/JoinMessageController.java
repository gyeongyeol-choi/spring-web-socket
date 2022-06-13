package com.tmax.websocket.controller;

import com.tmax.websocket.dto.JoinRequest;
import com.tmax.websocket.dto.JoinResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class JoinMessageController {

    @MessageMapping("/join")
    @SendTo("/subscribe/join")
    public JoinResponse joinMessage(final JoinRequest joinRequest) {
        return JoinResponse.of(joinRequest);
    }
}
