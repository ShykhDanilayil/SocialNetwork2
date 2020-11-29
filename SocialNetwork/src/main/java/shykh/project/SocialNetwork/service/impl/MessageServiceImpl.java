package shykh.project.SocialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import shykh.project.SocialNetwork.model.Message;
import shykh.project.SocialNetwork.repository.MessageRepository;
import shykh.project.SocialNetwork.service.MessageService;

import java.util.List;

public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepository repository;

    @Override
    public Message create(Message message) {
        return repository.save(message);
    }

    @Override
    public Message getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Message> getAllMessages() {
        return repository.findAll();
    }
}
