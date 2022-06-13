package com.tmax.websocket.dto;

public class JoinResponse {

    private String userName;

    public JoinResponse() {
    }

    public static JoinResponse of(final JoinRequest joinRequest) {
        return new JoinResponse(joinRequest.getUserName());
    }

    public JoinResponse(final String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
