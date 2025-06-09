package com.sarathi.support.controller;

import com.sarathi.support.dto.AuthSourceDTO;

import com.sarathi.support.dto.LoginRequestDTO;
import com.sarathi.support.dto.UserResponseDto;
import com.sarathi.support.service.AuthSourceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auth-sources")
public class AuthSourceController {

    private final AuthSourceService service;

     
    public AuthSourceController(AuthSourceService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public ResponseEntity<UserResponseDto> login(@RequestBody LoginRequestDTO loginDTO) {
        UserResponseDto userResponseDto = service.authenticateUser(loginDTO);
        return ResponseEntity.ok(userResponseDto);
    }

    @GetMapping
    public List<AuthSourceDTO> getAllAuthSources() {
        return service.getAllAuthSources();
    }

    @GetMapping("/{id}")
    public Optional<AuthSourceDTO> getAuthSourceById(@PathVariable Integer id) {
        return service.getAuthSourceById(id);
    }

    @PostMapping
    public AuthSourceDTO saveAuthSource(@RequestBody AuthSourceDTO dto) {
        return service.saveAuthSource(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthSource(@PathVariable Integer id) {
        service.deleteAuthSource(id);
    }
}
