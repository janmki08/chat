package com.study.chat.repository;

import com.study.chat.domain.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MessageRepository extends MongoRepository<Message, String> {
    List<Message> findByRoomIdOrderByTimestampAsc(String roomId);
}
