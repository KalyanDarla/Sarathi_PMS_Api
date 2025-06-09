package com.sarathi.support.controller;

import com.sarathi.support.dto.CustomFieldEnumerationDTO;
import com.sarathi.support.service.CustomFieldEnumerationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/custom-field-enumerations")
public class CustomFieldEnumerationController {

    private final CustomFieldEnumerationService service;

     
    public CustomFieldEnumerationController(CustomFieldEnumerationService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomFieldEnumerationDTO> getAllCustomFieldEnumerations() {
        return service.getAllCustomFieldEnumerations();
    }

    @GetMapping("/{id}")
    public Optional<CustomFieldEnumerationDTO> getCustomFieldEnumerationById(@PathVariable Integer id) {
        return service.getCustomFieldEnumerationById(id);
    }

    @PostMapping
    public CustomFieldEnumerationDTO saveCustomFieldEnumeration(@RequestBody CustomFieldEnumerationDTO dto) {
        return service.saveCustomFieldEnumeration(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomFieldEnumeration(@PathVariable Integer id) {
        service.deleteCustomFieldEnumeration(id);
    }
}
