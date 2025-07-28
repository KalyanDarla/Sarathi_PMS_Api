package com.sarathi.support.controller;

import com.sarathi.support.dto.EnumerationDTO;
import com.sarathi.support.service.EnumerationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enumerations")
public class EnumerationController {

    private final EnumerationService service;

     
    public EnumerationController(EnumerationService service) {
        this.service = service;
    }

    @GetMapping
    public List<EnumerationDTO> getAllEnumerations() {
        return service.getAllEnumerations();
    }

    @GetMapping("/{id}")
    public Optional<EnumerationDTO> getEnumerationById(@PathVariable Integer id) {
        return service.getEnumerationById(id);
    }

    @PostMapping
    public EnumerationDTO saveEnumeration(@RequestBody EnumerationDTO dto) {
        return service.saveEnumeration(dto);
    }

    @PutMapping("/{id}")
    public EnumerationDTO updateEnumeration(@PathVariable Integer id, @RequestBody EnumerationDTO dto) {
        return service.updateEnumeration(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteEnumeration(@PathVariable Integer id) {
        service.deleteEnumeration(id);
    }
}
