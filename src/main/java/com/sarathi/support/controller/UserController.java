package com.sarathi.support.controller;

import com.sarathi.support.dto.UserDTO;
import com.sarathi.support.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

     
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/getUserName")
    public ResponseEntity<List<String>> getAllUserNames() {
        List<String> userNames = service.getAllUserNames();
        return ResponseEntity.ok(userNames);
    }

    @GetMapping("/{id}")
    public Optional<UserDTO> getUserById(@PathVariable Integer id) {
        return service.getUserById(id);
    }

    @PostMapping
    public UserDTO saveUser(@RequestBody UserDTO dto) {
        return service.saveUser(dto);
    }

    @PutMapping("/{id}")
    public UserDTO updateUser(@PathVariable Integer id, @RequestBody UserDTO dto) {
        return service.updateUser(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        service.deleteUser(id);
    }
}
