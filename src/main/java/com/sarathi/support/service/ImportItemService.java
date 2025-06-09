package com.sarathi.support.service;

import com.sarathi.support.dto.ImportItemDTO;
import com.sarathi.support.entity.ImportItem;
import com.sarathi.support.repository.ImportItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ImportItemService {

    private final ImportItemRepository repository;

     
    public ImportItemService(ImportItemRepository repository) {
        this.repository = repository;
    }

    public List<ImportItemDTO> getAllImportItems() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<ImportItemDTO> getImportItemById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public ImportItemDTO saveImportItem(ImportItemDTO dto) {
        ImportItem importItem = convertToEntity(dto);
        ImportItem savedImportItem = repository.save(importItem);
        return convertToDTO(savedImportItem);
    }

    public ImportItemDTO updateImportItem(Integer id, ImportItemDTO dto) {
        Optional<ImportItem> existingImportItemOpt = repository.findById(id);
        if (existingImportItemOpt.isPresent()) {
            ImportItem existingImportItem = existingImportItemOpt.get();
            existingImportItem.setImportId(dto.getImportId());
            existingImportItem.setPosition(dto.getPosition());
            existingImportItem.setObjId(dto.getObjId());
            existingImportItem.setMessage(dto.getMessage());

            ImportItem updatedImportItem = repository.save(existingImportItem);
            return convertToDTO(updatedImportItem);
        } else {
            throw new RuntimeException("ImportItem with ID " + id + " not found.");
        }
    }

    public void deleteImportItem(Integer id) {
        repository.deleteById(id);
    }

    private ImportItemDTO convertToDTO(ImportItem importItem) {
        return new ImportItemDTO(
                importItem.getId(),
                importItem.getImportId(),
                importItem.getPosition(),
                importItem.getObjId(),
                importItem.getMessage()
        );
    }

    private ImportItem convertToEntity(ImportItemDTO dto) {
        ImportItem importItem = new ImportItem();
        importItem.setId(dto.getId());
        importItem.setImportId(dto.getImportId());
        importItem.setPosition(dto.getPosition());
        importItem.setObjId(dto.getObjId());
        importItem.setMessage(dto.getMessage());
        return importItem;
    }
}
