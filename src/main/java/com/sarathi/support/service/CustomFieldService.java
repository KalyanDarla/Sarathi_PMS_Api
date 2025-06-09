package com.sarathi.support.service;

import com.sarathi.support.dto.CustomFieldDTO;
import com.sarathi.support.entity.CustomField;
import com.sarathi.support.repository.CustomFieldRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomFieldService {

    private final CustomFieldRepository repository;

     
    public CustomFieldService(CustomFieldRepository repository) {
        this.repository = repository;
    }

    public List<CustomFieldDTO> getAllCustomFields() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<CustomFieldDTO> getCustomFieldById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public CustomFieldDTO saveCustomField(CustomFieldDTO dto) {
        CustomField customField = convertToEntity(dto);
        CustomField savedCustomField = repository.save(customField);
        return convertToDTO(savedCustomField);
    }

    public void deleteCustomField(Integer id) {
        repository.deleteById(id);
    }

    private CustomFieldDTO convertToDTO(CustomField customField) {
        return new CustomFieldDTO(
                customField.getId(),
                customField.getType(),
                customField.getName(),
                customField.getFieldFormat(),
                customField.getPossibleValues(),
                customField.getRegexp(),
                customField.getMinLength(),
                customField.getMaxLength(),
                customField.getIsRequired(),
                customField.getIsForAll(),
                customField.getIsFilter(),
                customField.getPosition(),
                customField.getSearchable(),
                customField.getDefaultValue(),
                customField.getEditable(),
                customField.getVisible(),
                customField.getMultiple(),
                customField.getFormatStore(),
                customField.getDescription()
        );
    }

    private CustomField convertToEntity(CustomFieldDTO dto) {
        CustomField customField = new CustomField();
        customField.setId(dto.getId());
        customField.setType(dto.getType());
        customField.setName(dto.getName());
        customField.setFieldFormat(dto.getFieldFormat());
        customField.setPossibleValues(dto.getPossibleValues());
        customField.setRegexp(dto.getRegexp());
        customField.setMinLength(dto.getMinLength());
        customField.setMaxLength(dto.getMaxLength());
        customField.setIsRequired(dto.getIsRequired());
        customField.setIsForAll(dto.getIsForAll());
        customField.setIsFilter(dto.getIsFilter());
        customField.setPosition(dto.getPosition());
        customField.setSearchable(dto.getSearchable());
        customField.setDefaultValue(dto.getDefaultValue());
        customField.setEditable(dto.getEditable());
        customField.setVisible(dto.getVisible());
        customField.setMultiple(dto.getMultiple());
        customField.setFormatStore(dto.getFormatStore());
        customField.setDescription(dto.getDescription());
        return customField;
    }
}
