package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    private static int count;
    private int onlineUser;
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;

    public static int increaseCount(){
        return ++count;
    }

    public static int decreaseCount(){
        return --count;
    }

    public int setOnlineUser(int count){
        onlineUser = count;
        return onlineUser;
    }
}
