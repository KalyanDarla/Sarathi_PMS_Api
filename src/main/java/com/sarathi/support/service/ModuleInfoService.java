package com.sarathi.support.service;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sarathi.support.dto.ModuleInfoDTO;
import com.sarathi.support.entity.ModuleInfo;
import com.sarathi.support.repository.ModuleInfoRepository;

@Service
public class ModuleInfoService {

    private final ModuleInfoRepository repository;

    public ModuleInfoService(ModuleInfoRepository repository) {
        this.repository = repository;
    }

    public List<ModuleInfoDTO> getAllModules() {
        return repository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public ModuleInfoDTO toDTO(ModuleInfo entity) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        ModuleInfoDTO dto = new ModuleInfoDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setCreatedBy(entity.getCreatedBy());
        dto.setCreatedOn(entity.getCreatedOn() != null ? entity.getCreatedOn().format(formatter) : null);
        dto.setUpdatedBy(entity.getUpdatedBy());
        dto.setUpdatedOn(entity.getUpdatedOn() != null ? entity.getUpdatedOn().format(formatter) : null);
        return dto;
    }

    public Optional<ModuleInfo> getModuleById(Short id) {
        return repository.findById(id);
    }

    public ModuleInfo createModule(ModuleInfo module) {
        return repository.save(module);
    }

    public ModuleInfo updateModule(Short id, ModuleInfo module) {
        module.setId(id);
        return repository.save(module);
    }

    public void deleteModule(Short id) {
        repository.deleteById(id);
    }
}

