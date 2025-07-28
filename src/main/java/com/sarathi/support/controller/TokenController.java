package com.sarathi.support.controller;

import com.sarathi.support.dto.TokenDTO;
import com.sarathi.support.service.TokenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tokens")
public class TokenController {

    private final TokenService service;

     public TokenController(TokenService service) {
        this.service = service;
    }

    @GetMapping
    public List<TokenDTO> getAllTokens() {
        return service.getAllTokens();
    }

    @GetMapping("/{id}")
    public Optional<TokenDTO> getTokenById(@PathVariable Integer id) {
        return service.getTokenById(id);
    }

    @PostMapping
    public TokenDTO saveToken(@RequestBody TokenDTO dto) {
        return service.saveToken(dto);
    }

    @PutMapping("/{id}")
    public TokenDTO updateToken(@PathVariable Integer id, @RequestBody TokenDTO dto) {
        return service.updateToken(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteToken(@PathVariable Integer id) {
        service.deleteToken(id);
    }
}

