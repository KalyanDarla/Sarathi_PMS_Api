package com.sarathi.support.controller;

import com.sarathi.support.dto.UsersTmpDTO;
import com.sarathi.support.service.UsersTmpService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users-tmp")
public class UsersTmpController {

    private final UsersTmpService service;

     
    public UsersTmpController(UsersTmpService service) {
        this.service = service;
    }

    @GetMapping
    public List<UsersTmpDTO> getAllUsersTmp() {
        return service.getAllUsersTmp();
    }

    @GetMapping("/{id}")
    public Optional<UsersTmpDTO> getUsersTmpById(@PathVariable Integer id) {
        return service.getUsersTmpById(id);
    }

    @PostMapping
    public UsersTmpDTO saveUsersTmp(@RequestBody UsersTmpDTO dto) {
        return service.saveUsersTmp(dto);
    }

    @PutMapping("/{id}")
    public UsersTmpDTO updateUsersTmp(@PathVariable Integer id, @RequestBody UsersTmpDTO dto) {
        return service.updateUsersTmp(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteUsersTmp(@PathVariable Integer id) {
        service.deleteUsersTmp(id);
    }
}
