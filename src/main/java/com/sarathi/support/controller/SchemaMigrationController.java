package com.sarathi.support.controller;

import com.sarathi.support.dto.SchemaMigrationDTO;
import com.sarathi.support.service.SchemaMigrationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/schema-migrations")
public class SchemaMigrationController {

    private final SchemaMigrationService service;

     
    public SchemaMigrationController(SchemaMigrationService service) {
        this.service = service;
    }

    @GetMapping
    public List<SchemaMigrationDTO> getAllSchemaMigrations() {
        return service.getAllSchemaMigrations();
    }

    @GetMapping("/{version}")
    public Optional<SchemaMigrationDTO> getSchemaMigrationByVersion(@PathVariable String version) {
        return service.getSchemaMigrationByVersion(version);
    }

    @PostMapping
    public SchemaMigrationDTO saveSchemaMigration(@RequestBody SchemaMigrationDTO dto) {
        return service.saveSchemaMigration(dto);
    }

    @PutMapping("/{version}")
    public SchemaMigrationDTO updateSchemaMigration(@PathVariable String version, @RequestBody SchemaMigrationDTO dto) {
        return service.updateSchemaMigration(version, dto);
    }

    @DeleteMapping("/{version}")
    public void deleteSchemaMigration(@PathVariable String version) {
        service.deleteSchemaMigration(version);
    }
}

