 package com.sarathi.support.service;

import com.sarathi.support.dto.OpenIdAuthenticationAssociationDTO;
import com.sarathi.support.entity.OpenIdAuthenticationAssociation;
import com.sarathi.support.repository.OpenIdAuthenticationAssociationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OpenIdAuthenticationAssociationService {

    private final OpenIdAuthenticationAssociationRepository repository;

     
    public OpenIdAuthenticationAssociationService(OpenIdAuthenticationAssociationRepository repository) {
        this.repository = repository;
    }

    public List<OpenIdAuthenticationAssociationDTO> getAllAssociations() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<OpenIdAuthenticationAssociationDTO> getAssociationById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public OpenIdAuthenticationAssociationDTO saveAssociation(OpenIdAuthenticationAssociationDTO dto) {
        OpenIdAuthenticationAssociation association = convertToEntity(dto);
        OpenIdAuthenticationAssociation savedAssociation = repository.save(association);
        return convertToDTO(savedAssociation);
    }

    public OpenIdAuthenticationAssociationDTO updateAssociation(Integer id, OpenIdAuthenticationAssociationDTO dto) {
        Optional<OpenIdAuthenticationAssociation> existingAssociationOpt = repository.findById(id);
        if (existingAssociationOpt.isPresent()) {
            OpenIdAuthenticationAssociation existingAssociation = existingAssociationOpt.get();
            existingAssociation.setIssued(dto.getIssued());
            existingAssociation.setLifetime(dto.getLifetime());
            existingAssociation.setHandle(dto.getHandle());
            existingAssociation.setAssocType(dto.getAssocType());
            existingAssociation.setServerUrl(dto.getServerUrl());
            existingAssociation.setSecret(dto.getSecret());

            OpenIdAuthenticationAssociation updatedAssociation = repository.save(existingAssociation);
            return convertToDTO(updatedAssociation);
        } else {
            throw new RuntimeException("OpenIdAuthenticationAssociation with ID " + id + " not found.");
        }
    }

    public void deleteAssociation(Integer id) {
        repository.deleteById(id);
    }

    private OpenIdAuthenticationAssociationDTO convertToDTO(OpenIdAuthenticationAssociation association) {
        return new OpenIdAuthenticationAssociationDTO(
                association.getId(),
                association.getIssued(),
                association.getLifetime(),
                association.getHandle(),
                association.getAssocType(),
                association.getServerUrl(),
                association.getSecret()
        );
    }

    private OpenIdAuthenticationAssociation convertToEntity(OpenIdAuthenticationAssociationDTO dto) {
        OpenIdAuthenticationAssociation association = new OpenIdAuthenticationAssociation();
        association.setId(dto.getId());
        association.setIssued(dto.getIssued());
        association.setLifetime(dto.getLifetime());
        association.setHandle(dto.getHandle());
        association.setAssocType(dto.getAssocType());
        association.setServerUrl(dto.getServerUrl());
        association.setSecret(dto.getSecret());
        return association;
    }
}

