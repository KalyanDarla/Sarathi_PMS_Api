package com.sarathi.support.service;

import com.sarathi.support.dto.MessageDTO;
import com.sarathi.support.entity.Message;
import com.sarathi.support.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MessageService {

    private final MessageRepository repository;

     
    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public List<MessageDTO> getAllMessages() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<MessageDTO> getMessageById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public MessageDTO saveMessage(MessageDTO dto) {
        Message message = convertToEntity(dto);
        message.setCreatedOn(Instant.now());
        message.setUpdatedOn(Instant.now());
        Message savedMessage = repository.save(message);
        return convertToDTO(savedMessage);
    }

    public MessageDTO updateMessage(Integer id, MessageDTO dto) {
        Optional<Message> existingMessageOpt = repository.findById(id);
        if (existingMessageOpt.isPresent()) {
            Message existingMessage = existingMessageOpt.get();
            existingMessage.setBoardId(dto.getBoardId());
            existingMessage.setParentId(dto.getParentId());
            existingMessage.setSubject(dto.getSubject());
            existingMessage.setContent(dto.getContent());
            existingMessage.setAuthorId(dto.getAuthorId());
            existingMessage.setRepliesCount(dto.getRepliesCount());
            existingMessage.setLastReplyId(dto.getLastReplyId());
            existingMessage.setLocked(dto.getLocked());
            existingMessage.setSticky(dto.getSticky());
            existingMessage.setUpdatedOn(Instant.now());

            Message updatedMessage = repository.save(existingMessage);
            return convertToDTO(updatedMessage);
        } else {
            throw new RuntimeException("Message with ID " + id + " not found.");
        }
    }

    public void deleteMessage(Integer id) {
        repository.deleteById(id);
    }

    private MessageDTO convertToDTO(Message message) {
        return new MessageDTO(
                message.getId(), message.getBoardId(), message.getParentId(), message.getSubject(), message.getContent(),
                message.getAuthorId(), message.getRepliesCount(), message.getLastReplyId(),
                message.getCreatedOn(), message.getUpdatedOn(), message.getLocked(), message.getSticky()
        );
    }

    private Message convertToEntity(MessageDTO dto) {
        Message message = new Message();
        message.setId(dto.getId());
        message.setBoardId(dto.getBoardId());
        message.setParentId(dto.getParentId());
        message.setSubject(dto.getSubject());
        message.setContent(dto.getContent());
        message.setAuthorId(dto.getAuthorId());
        message.setRepliesCount(dto.getRepliesCount());
        message.setLastReplyId(dto.getLastReplyId());
        message.setLocked(dto.getLocked());
        message.setSticky(dto.getSticky());
        return message;
    }
}

