package com.sarathi.support.service;

import com.sarathi.support.dto.CustomFieldEnumerationDTO;
import com.sarathi.support.entity.CustomFieldEnumeration;
import com.sarathi.support.repository.CustomFieldEnumerationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomFieldEnumerationService {

    private final CustomFieldEnumerationRepository repository;

     
    public CustomFieldEnumerationService(CustomFieldEnumerationRepository repository) {
        this.repository = repository;
    }

    public List<CustomFieldEnumerationDTO> getAllCustomFieldEnumerations() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<CustomFieldEnumerationDTO> getCustomFieldEnumerationById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public CustomFieldEnumerationDTO saveCustomFieldEnumeration(CustomFieldEnumerationDTO dto) {
        CustomFieldEnumeration customFieldEnumeration = convertToEntity(dto);
        CustomFieldEnumeration savedEnumeration = repository.save(customFieldEnumeration);
        return convertToDTO(savedEnumeration);
    }

    public void deleteCustomFieldEnumeration(Integer id) {
        repository.deleteById(id);
    }

    private CustomFieldEnumerationDTO convertToDTO(CustomFieldEnumeration entity) {
        return new CustomFieldEnumerationDTO(
                entity.getId(),
                entity.getCustomFieldId(),
                entity.getName(),
                entity.getActive(),
                entity.getPosition()
        );
    }

    private CustomFieldEnumeration convertToEntity(CustomFieldEnumerationDTO dto) {
        CustomFieldEnumeration entity = new CustomFieldEnumeration();
        entity.setId(dto.getId());
        entity.setCustomFieldId(dto.getCustomFieldId());
        entity.setName(dto.getName());
        entity.setActive(dto.getActive());
        entity.setPosition(dto.getPosition());
        return entity;
    }
}
