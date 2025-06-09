package com.sarathi.support.service;

import com.sarathi.support.dto.VersionDTO;
import com.sarathi.support.entity.Version;
import com.sarathi.support.repository.VersionRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VersionService {

    private final VersionRepository repository;

     
    public VersionService(VersionRepository repository) {
        this.repository = repository;
    }

    public List<VersionDTO> getAllVersions() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<VersionDTO> getVersionById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public VersionDTO saveVersion(VersionDTO dto) {
        Version version = convertToEntity(dto);
        version.setCreatedOn(Instant.now());
        version.setUpdatedOn(Instant.now());
        Version savedVersion = repository.save(version);
        return convertToDTO(savedVersion);
    }

    public VersionDTO updateVersion(Integer id, VersionDTO dto) {
        Optional<Version> existingVersionOpt = repository.findById(id);
        if (existingVersionOpt.isPresent()) {
            Version existingVersion = existingVersionOpt.get();
            existingVersion.setProjectId(dto.getProjectId());
            existingVersion.setName(dto.getName());
            existingVersion.setDescription(dto.getDescription());
            existingVersion.setEffectiveDate(dto.getEffectiveDate());
            existingVersion.setWikiPageTitle(dto.getWikiPageTitle());
            existingVersion.setStatus(dto.getStatus());
            existingVersion.setSharing(dto.getSharing());
            existingVersion.setUpdatedOn(Instant.now());

            Version updatedVersion = repository.save(existingVersion);
            return convertToDTO(updatedVersion);
        } else {
            throw new RuntimeException("Version with ID " + id + " not found.");
        }
    }

    public void deleteVersion(Integer id) {
        repository.deleteById(id);
    }

    private VersionDTO convertToDTO(Version version) {
        return new VersionDTO(
                version.getId(),
                version.getProjectId(),
                version.getName(),
                version.getDescription(),
                version.getEffectiveDate(),
                version.getCreatedOn(),
                version.getUpdatedOn(),
                version.getWikiPageTitle(),
                version.getStatus(),
                version.getSharing()
        );
    }

    private Version convertToEntity(VersionDTO dto) {
        Version version = new Version();
        version.setId(dto.getId());
        version.setProjectId(dto.getProjectId());
        version.setName(dto.getName());
        version.setDescription(dto.getDescription());
        version.setEffectiveDate(dto.getEffectiveDate());
        version.setWikiPageTitle(dto.getWikiPageTitle());
        version.setStatus(dto.getStatus());
        version.setSharing(dto.getSharing());
        return version;
    }
}
