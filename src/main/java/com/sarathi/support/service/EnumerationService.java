package com.sarathi.support.service;

import com.sarathi.support.dto.EnumerationDTO;
import com.sarathi.support.entity.Enumeration;
import com.sarathi.support.repository.EnumerationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EnumerationService {

    private final EnumerationRepository repository;

     
    public EnumerationService(EnumerationRepository repository) {
        this.repository = repository;
    }

    public List<EnumerationDTO> getAllEnumerations() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<EnumerationDTO> getEnumerationById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public EnumerationDTO saveEnumeration(EnumerationDTO dto) {
        Enumeration enumeration = convertToEntity(dto);
        Enumeration savedEnumeration = repository.save(enumeration);
        return convertToDTO(savedEnumeration);
    }

    public EnumerationDTO updateEnumeration(Integer id, EnumerationDTO dto) {
        Optional<Enumeration> existingEnumerationOpt = repository.findById(id);
        if (existingEnumerationOpt.isPresent()) {
            Enumeration existingEnumeration = existingEnumerationOpt.get();
            existingEnumeration.setName(dto.getName());
            existingEnumeration.setPosition(dto.getPosition());
            existingEnumeration.setIsDefault(dto.getIsDefault());
            existingEnumeration.setType(dto.getType());
            existingEnumeration.setActive(dto.getActive());
            existingEnumeration.setProjectId(dto.getProjectId());
            existingEnumeration.setParentId(dto.getParentId());
            existingEnumeration.setPositionName(dto.getPositionName());

            Enumeration updatedEnumeration = repository.save(existingEnumeration);
            return convertToDTO(updatedEnumeration);
        } else {
            throw new RuntimeException("Enumeration with ID " + id + " not found.");
        }
    }

    public void deleteEnumeration(Integer id) {
        repository.deleteById(id);
    }

    private EnumerationDTO convertToDTO(Enumeration enumeration) {
        return new EnumerationDTO(
                enumeration.getId(),
                enumeration.getName(),
                enumeration.getPosition(),
                enumeration.getIsDefault(),
                enumeration.getType(),
                enumeration.getActive(),
                enumeration.getProjectId(),
                enumeration.getParentId(),
                enumeration.getPositionName()
        );
    }

    private Enumeration convertToEntity(EnumerationDTO dto) {
        Enumeration enumeration = new Enumeration();
        enumeration.setId(dto.getId());
        enumeration.setName(dto.getName());
        enumeration.setPosition(dto.getPosition());
        enumeration.setIsDefault(dto.getIsDefault());
        enumeration.setType(dto.getType());
        enumeration.setActive(dto.getActive());
        enumeration.setProjectId(dto.getProjectId());
        enumeration.setParentId(dto.getParentId());
        enumeration.setPositionName(dto.getPositionName());
        return enumeration;
    }
}
