package com.sarathi.support.service;

import com.sarathi.support.dto.CustomFieldsProjectDTO;
import com.sarathi.support.entity.CustomFieldsProject;
import com.sarathi.support.repository.CustomFieldsProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomFieldsProjectService {

    private final CustomFieldsProjectRepository repository;

     public CustomFieldsProjectService(CustomFieldsProjectRepository repository) {
        this.repository = repository;
    }

    public List<CustomFieldsProjectDTO> getAllCustomFieldsProjects() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<CustomFieldsProjectDTO> getCustomFieldsProjectById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public CustomFieldsProjectDTO saveCustomFieldsProject(CustomFieldsProjectDTO dto) {
        CustomFieldsProject customFieldsProject = convertToEntity(dto);
        CustomFieldsProject savedProject = repository.save(customFieldsProject);
        return convertToDTO(savedProject);
    }

    public void deleteCustomFieldsProject(Integer id) {
        repository.deleteById(id);
    }

    private CustomFieldsProjectDTO convertToDTO(CustomFieldsProject entity) {
        return new CustomFieldsProjectDTO(
                entity.getCustomFieldId(),
                entity.getProjectId()
        );
    }

    private CustomFieldsProject convertToEntity(CustomFieldsProjectDTO dto) {
        CustomFieldsProject entity = new CustomFieldsProject();
        entity.setCustomFieldId(dto.getCustomFieldId());
        entity.setProjectId(dto.getProjectId());
        return entity;
    }
}
