package com.study.chat.service;

import com.study.chat.domain.ChatRoom;
import com.study.chat.domain.Message;
import com.study.chat.repository.ChatRoomRepository;
import com.study.chat.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {
    private final ChatRoomRepository chatRoomRepository;
    private final MessageRepository messageRepository;

    public ChatService(ChatRoomRepository chatRoomRepository, MessageRepository messageRepository) {
        this.chatRoomRepository = chatRoomRepository;
        this.messageRepository = messageRepository;
    }

    public ChatRoom createRoom(List<String> participants) {
        ChatRoom room = new ChatRoom(participants);
        return chatRoomRepository.save(room);
    }

    public Message sendMessage(String roomId, String senderId, String content) {
        Message message = new Message(roomId, senderId, content);
        return messageRepository.save(message);
    }

    public List<Message> getMessages(String roomId) {
        return messageRepository.findByRoomIdOrderByTimestampAsc(roomId);
    }
}
