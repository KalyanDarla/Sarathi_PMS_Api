package com.sarathi.support.service;

import com.sarathi.support.dto.CustomFieldsRoleDTO;
import com.sarathi.support.entity.CustomFieldsRole;
import com.sarathi.support.repository.CustomFieldsRoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomFieldsRoleService {

    private final CustomFieldsRoleRepository repository;

     
    public CustomFieldsRoleService(CustomFieldsRoleRepository repository) {
        this.repository = repository;
    }

    public List<CustomFieldsRoleDTO> getAllCustomFieldsRoles() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<CustomFieldsRoleDTO> getCustomFieldsRoleById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public CustomFieldsRoleDTO saveCustomFieldsRole(CustomFieldsRoleDTO dto) {
        CustomFieldsRole customFieldsRole = convertToEntity(dto);
        CustomFieldsRole savedRole = repository.save(customFieldsRole);
        return convertToDTO(savedRole);
    }

    public void deleteCustomFieldsRole(Integer id) {
        repository.deleteById(id);
    }

    private CustomFieldsRoleDTO convertToDTO(CustomFieldsRole entity) {
        return new CustomFieldsRoleDTO(
                entity.getCustomFieldId(),
                entity.getRoleId()
        );
    }

    private CustomFieldsRole convertToEntity(CustomFieldsRoleDTO dto) {
        CustomFieldsRole entity = new CustomFieldsRole();
        entity.setCustomFieldId(dto.getCustomFieldId());
        entity.setRoleId(dto.getRoleId());
        return entity;
    }
}
