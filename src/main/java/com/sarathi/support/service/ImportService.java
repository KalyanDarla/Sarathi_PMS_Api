 package com.sarathi.support.service;

import com.sarathi.support.dto.ImportDTO;
import com.sarathi.support.entity.Import;
import com.sarathi.support.repository.ImportRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ImportService {

    private final ImportRepository repository;

     public ImportService(ImportRepository repository) {
        this.repository = repository;
    }

    public List<ImportDTO> getAllImports() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<ImportDTO> getImportById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public ImportDTO saveImport(ImportDTO dto) {
        Import importEntity = convertToEntity(dto);
        importEntity.setCreatedAt(Instant.now());
        importEntity.setUpdatedAt(Instant.now());
        Import savedImport = repository.save(importEntity);
        return convertToDTO(savedImport);
    }

    public ImportDTO updateImport(Integer id, ImportDTO dto) {
        Optional<Import> existingImportOpt = repository.findById(id);
        if (existingImportOpt.isPresent()) {
            Import existingImport = existingImportOpt.get();
            existingImport.setType(dto.getType());
            existingImport.setUserId(dto.getUserId());
            existingImport.setFilename(dto.getFilename());
            existingImport.setSettings(dto.getSettings());
            existingImport.setTotalItems(dto.getTotalItems());
            existingImport.setFinished(dto.getFinished());
            existingImport.setUpdatedAt(Instant.now());

            Import updatedImport = repository.save(existingImport);
            return convertToDTO(updatedImport);
        } else {
            throw new RuntimeException("Import with ID " + id + " not found.");
        }
    }

    public void deleteImport(Integer id) {
        repository.deleteById(id);
    }

    private ImportDTO convertToDTO(Import importEntity) {
        return new ImportDTO(
                importEntity.getId(),
                importEntity.getType(),
                importEntity.getUserId(),
                importEntity.getFilename(),
                importEntity.getSettings(),
                importEntity.getTotalItems(),
                importEntity.getFinished(),
                importEntity.getCreatedAt(),
                importEntity.getUpdatedAt()
        );
    }

    private Import convertToEntity(ImportDTO dto) {
        Import importEntity = new Import();
        importEntity.setId(dto.getId());
        importEntity.setType(dto.getType());
        importEntity.setUserId(dto.getUserId());
        importEntity.setFilename(dto.getFilename());
        importEntity.setSettings(dto.getSettings());
        importEntity.setTotalItems(dto.getTotalItems());
        importEntity.setFinished(dto.getFinished());
        importEntity.setCreatedAt(dto.getCreatedAt());
        importEntity.setUpdatedAt(dto.getUpdatedAt());
        return importEntity;
    }
}
