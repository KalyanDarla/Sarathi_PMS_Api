package com.sarathi.support.controller;

import com.sarathi.support.dto.OpenIdAuthenticationNonceDTO;
import com.sarathi.support.service.OpenIdAuthenticationNonceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/open-id-authentication-nonces")
public class OpenIdAuthenticationNonceController {

    private final OpenIdAuthenticationNonceService service;

     
    public OpenIdAuthenticationNonceController(OpenIdAuthenticationNonceService service) {
        this.service = service;
    }

    @GetMapping
    public List<OpenIdAuthenticationNonceDTO> getAllNonces() {
        return service.getAllNonces();
    }

    @GetMapping("/{id}")
    public Optional<OpenIdAuthenticationNonceDTO> getNonceById(@PathVariable Integer id) {
        return service.getNonceById(id);
    }

    @PostMapping
    public OpenIdAuthenticationNonceDTO saveNonce(@RequestBody OpenIdAuthenticationNonceDTO dto) {
        return service.saveNonce(dto);
    }

    @PutMapping("/{id}")
    public OpenIdAuthenticationNonceDTO updateNonce(@PathVariable Integer id, @RequestBody OpenIdAuthenticationNonceDTO dto) {
        return service.updateNonce(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteNonce(@PathVariable Integer id) {
        service.deleteNonce(id);
    }
}
