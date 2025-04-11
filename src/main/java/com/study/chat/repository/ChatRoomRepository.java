package com.study.chat.repository;

import com.study.chat.domain.ChatRoom;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatRoomRepository extends MongoRepository<ChatRoom, String> {

}
