package com.sarathi.support.service;

import com.sarathi.support.dto.CustomValueDTO;
import com.sarathi.support.entity.CustomValue;
import com.sarathi.support.repository.CustomValueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomValueService {

    private final CustomValueRepository repository;

     
    public CustomValueService(CustomValueRepository repository) {
        this.repository = repository;
    }

    public List<CustomValueDTO> getAllCustomValues() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<CustomValueDTO> getCustomValueById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public CustomValueDTO saveCustomValue(CustomValueDTO dto) {
        CustomValue customValue = convertToEntity(dto);
        CustomValue savedCustomValue = repository.save(customValue);
        return convertToDTO(savedCustomValue);
    }

    public void deleteCustomValue(Integer id) {
        repository.deleteById(id);
    }

    private CustomValueDTO convertToDTO(CustomValue customValue) {
        return new CustomValueDTO(
                customValue.getId(),
                customValue.getCustomizedType(),
                customValue.getCustomizedId(),
                customValue.getCustomFieldId(),
                customValue.getValue()
        );
    }

    private CustomValue convertToEntity(CustomValueDTO dto) {
        CustomValue customValue = new CustomValue();
        customValue.setId(dto.getId());
        customValue.setCustomizedType(dto.getCustomizedType());
        customValue.setCustomizedId(dto.getCustomizedId());
        customValue.setCustomFieldId(dto.getCustomFieldId());
        customValue.setValue(dto.getValue());
        return customValue;
    }
}
