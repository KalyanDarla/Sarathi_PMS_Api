package com.sarathi.support.service;

import com.sarathi.support.dto.EnabledModuleDTO;
import com.sarathi.support.entity.EnabledModule;
import com.sarathi.support.repository.EnabledModuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EnabledModuleService {

    private final EnabledModuleRepository repository;

     
    public EnabledModuleService(EnabledModuleRepository repository) {
        this.repository = repository;
    }

    public List<EnabledModuleDTO> getAllEnabledModules() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<EnabledModuleDTO> getEnabledModuleById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public EnabledModuleDTO saveEnabledModule(EnabledModuleDTO dto) {
        EnabledModule enabledModule = convertToEntity(dto);
        EnabledModule savedEnabledModule = repository.save(enabledModule);
        return convertToDTO(savedEnabledModule);
    }

    public EnabledModuleDTO updateEnabledModule(Integer id, EnabledModuleDTO dto) {
        Optional<EnabledModule> existingModuleOpt = repository.findById(id);
        if (existingModuleOpt.isPresent()) {
            EnabledModule existingModule = existingModuleOpt.get();
            existingModule.setProjectId(dto.getProjectId());
            existingModule.setName(dto.getName());
            EnabledModule updatedModule = repository.save(existingModule);
            return convertToDTO(updatedModule);
        } else {
            throw new RuntimeException("Enabled Module with ID " + id + " not found.");
        }
    }

    public void deleteEnabledModule(Integer id) {
        repository.deleteById(id);
    }

    private EnabledModuleDTO convertToDTO(EnabledModule enabledModule) {
        return new EnabledModuleDTO(
                enabledModule.getId(),
                enabledModule.getProjectId(),
                enabledModule.getName()
        );
    }

    private EnabledModule convertToEntity(EnabledModuleDTO dto) {
        EnabledModule enabledModule = new EnabledModule();
        enabledModule.setId(dto.getId());
        enabledModule.setProjectId(dto.getProjectId());
        enabledModule.setName(dto.getName());
        return enabledModule;
    }
}
