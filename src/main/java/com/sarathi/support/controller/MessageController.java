package com.sarathi.support.controller;

import com.sarathi.support.dto.MessageDTO;
import com.sarathi.support.service.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageService service;

     
    public MessageController(MessageService service) {
        this.service = service;
    }

    @GetMapping
    public List<MessageDTO> getAllMessages() {
        return service.getAllMessages();
    }

    @GetMapping("/{id}")
    public Optional<MessageDTO> getMessageById(@PathVariable Integer id) {
        return service.getMessageById(id);
    }

    @PostMapping
    public MessageDTO saveMessage(@RequestBody MessageDTO dto) {
        return service.saveMessage(dto);
    }

    @PutMapping("/{id}")
    public MessageDTO updateMessage(@PathVariable Integer id, @RequestBody MessageDTO dto) {
        return service.updateMessage(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Integer id) {
        service.deleteMessage(id);
    }
}

