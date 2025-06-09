package com.sarathi.support.controller;

import com.sarathi.support.dto.OpenIdAuthenticationAssociationDTO;
import com.sarathi.support.service.OpenIdAuthenticationAssociationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/open-id-authentication-associations")
public class OpenIdAuthenticationAssociationController {

    private final OpenIdAuthenticationAssociationService service;

     
    public OpenIdAuthenticationAssociationController(OpenIdAuthenticationAssociationService service) {
        this.service = service;
    }

    @GetMapping
    public List<OpenIdAuthenticationAssociationDTO> getAllAssociations() {
        return service.getAllAssociations();
    }

    @GetMapping("/{id}")
    public Optional<OpenIdAuthenticationAssociationDTO> getAssociationById(@PathVariable Integer id) {
        return service.getAssociationById(id);
    }

    @PostMapping
    public OpenIdAuthenticationAssociationDTO saveAssociation(@RequestBody OpenIdAuthenticationAssociationDTO dto) {
        return service.saveAssociation(dto);
    }

    @PutMapping("/{id}")
    public OpenIdAuthenticationAssociationDTO updateAssociation(@PathVariable Integer id, @RequestBody OpenIdAuthenticationAssociationDTO dto) {
        return service.updateAssociation(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteAssociation(@PathVariable Integer id) {
        service.deleteAssociation(id);
    }
}

