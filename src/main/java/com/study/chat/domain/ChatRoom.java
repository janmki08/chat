package com.study.chat.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "chat_rooms")
public class ChatRoom {
    @Id
    private String id;

    // 참여자 리스트
    private List<String> participantIds;

    // 생성자
    public ChatRoom() {}
    public ChatRoom(List<String> participantIds) {
        this.participantIds = participantIds;
    }

    public String getId() { return id; }
    public List<String> getParticipantIds() { return participantIds; }
    public void setParticipantIds(List<String> participantIds) { this.participantIds = participantIds; }
}
