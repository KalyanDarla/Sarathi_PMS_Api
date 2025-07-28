package com.sarathi.support.service;

import com.sarathi.support.dto.SchemaMigrationDTO;
import com.sarathi.support.entity.SchemaMigration;
import com.sarathi.support.repository.SchemaMigrationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SchemaMigrationService {

    private final SchemaMigrationRepository repository;

     
    public SchemaMigrationService(SchemaMigrationRepository repository) {
        this.repository = repository;
    }

    public List<SchemaMigrationDTO> getAllSchemaMigrations() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<SchemaMigrationDTO> getSchemaMigrationByVersion(String version) {
        return repository.findById(version).map(this::convertToDTO);
    }

    public SchemaMigrationDTO saveSchemaMigration(SchemaMigrationDTO dto) {
        SchemaMigration schemaMigration = convertToEntity(dto);
        SchemaMigration savedSchemaMigration = repository.save(schemaMigration);
        return convertToDTO(savedSchemaMigration);
    }

    public SchemaMigrationDTO updateSchemaMigration(String version, SchemaMigrationDTO dto) {
        Optional<SchemaMigration> existingMigrationOpt = repository.findById(version);
        if (existingMigrationOpt.isPresent()) {
            SchemaMigration existingMigration = existingMigrationOpt.get();
            existingMigration.setVersion(dto.getVersion());

            SchemaMigration updatedMigration = repository.save(existingMigration);
            return convertToDTO(updatedMigration);
        } else {
            throw new RuntimeException("SchemaMigration with version " + version + " not found.");
        }
    }

    public void deleteSchemaMigration(String version) {
        repository.deleteById(version);
    }

    private SchemaMigrationDTO convertToDTO(SchemaMigration schemaMigration) {
        return new SchemaMigrationDTO(schemaMigration.getVersion());
    }

    private SchemaMigration convertToEntity(SchemaMigrationDTO dto) {
        SchemaMigration schemaMigration = new SchemaMigration();
        schemaMigration.setVersion(dto.getVersion());
        return schemaMigration;
    }
}

