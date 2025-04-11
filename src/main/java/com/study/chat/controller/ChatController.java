package com.study.chat.controller;

import com.study.chat.domain.ChatRoom;
import com.study.chat.domain.Message;
import com.study.chat.service.ChatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatController {
    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/room")
    public ChatRoom createRoom(@RequestBody List<String> participants) {
        return chatService.createRoom(participants);
    }

    @PostMapping("/room/{roomId}/message")
    public Message sendMessage(@PathVariable String roomId,
                               @RequestParam String senderId,
                               @RequestParam String content) {
        return chatService.sendMessage(roomId, senderId, content);
    }

    @GetMapping("/room/{roomId}/messages")
    public List<Message> getMessages(@PathVariable String roomId) {
        return chatService.getMessages(roomId);
    }
}
