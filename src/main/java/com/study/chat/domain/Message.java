package com.study.chat.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "messages")
public class Message {
    @Id
    private String id;

    private String roomId;
    private String senderId;
    private String content;
    private LocalDateTime timestamp;

    public Message() {}

    public Message(String roomId, String senderId, String content){
        this.roomId = roomId;
        this.senderId = senderId;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public String getId() { return id; }
    public String getRoomId() { return roomId; }
    public String getSenderId() { return senderId; }
    public String getContent() { return content; }
    public LocalDateTime getTimestamp() { return timestamp; }

    public void setRoomId(String roomId) { this.roomId = roomId; }
    public void setSenderId(String senderId) { this.senderId = senderId; }
    public void setContent(String content) { this.content = content; }
}
