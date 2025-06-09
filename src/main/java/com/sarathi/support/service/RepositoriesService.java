package com.sarathi.support.service;

import com.sarathi.support.dto.RepositoriesDTO;

import com.sarathi.support.entity.Repositories;
import com.sarathi.support.repository.RepositoriesRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RepositoriesService {

    private final RepositoriesRepository repository;

     
    public RepositoriesService(RepositoriesRepository repository) {
        this.repository = repository;
    }

    public List<RepositoriesDTO> getAllRepositories() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<RepositoriesDTO> getRepositoryById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public RepositoriesDTO saveRepository(RepositoriesDTO dto) {
        Repositories repositoryEntity = convertToEntity(dto);
        repositoryEntity.setCreatedOn(Instant.now());
        Repositories savedRepository = repository.save(repositoryEntity);
        return convertToDTO(savedRepository);
    }

    public RepositoriesDTO updateRepository(Integer id, RepositoriesDTO dto) {
        Optional<Repositories> existingRepositoryOpt = repository.findById(id);
        if (existingRepositoryOpt.isPresent()) {
            Repositories existingRepository = existingRepositoryOpt.get();
            existingRepository.setProjectId(dto.getProjectId());
            existingRepository.setUrl(dto.getUrl());
            existingRepository.setLogin(dto.getLogin());
            existingRepository.setPassword(dto.getPassword());
            existingRepository.setRootUrl(dto.getRootUrl());
            existingRepository.setType(dto.getType());
            existingRepository.setPathEncoding(dto.getPathEncoding());
            existingRepository.setLogEncoding(dto.getLogEncoding());
            existingRepository.setExtraInfo(dto.getExtraInfo());
            existingRepository.setIdentifier(dto.getIdentifier());
            existingRepository.setIsDefault(dto.getIsDefault());
            existingRepository.setCreatedOn(Instant.now());

            Repositories updatedRepository = repository.save(existingRepository);
            return convertToDTO(updatedRepository);
        } else {
            throw new RuntimeException("Repository with ID " + id + " not found.");
        }
    }

    public void deleteRepository(Integer id) {
        repository.deleteById(id);
    }

    private RepositoriesDTO convertToDTO(Repositories repository) {
        return new RepositoriesDTO(
                repository.getId(),
                repository.getProjectId(),
                repository.getUrl(),
                repository.getLogin(),
                repository.getPassword(),
                repository.getRootUrl(),
                repository.getType(),
                repository.getPathEncoding(),
                repository.getLogEncoding(),
                repository.getExtraInfo(),
                repository.getIdentifier(),
                repository.getIsDefault(),
                repository.getCreatedOn()
        );
    }

    private Repositories convertToEntity(RepositoriesDTO dto) {
        Repositories repository = new Repositories();
        repository.setId(dto.getId());
        repository.setProjectId(dto.getProjectId());
        repository.setUrl(dto.getUrl());
        repository.setLogin(dto.getLogin());
        repository.setPassword(dto.getPassword());
        repository.setRootUrl(dto.getRootUrl());
        repository.setType(dto.getType());
        repository.setPathEncoding(dto.getPathEncoding());
        repository.setLogEncoding(dto.getLogEncoding());
        repository.setExtraInfo(dto.getExtraInfo());
        repository.setIdentifier(dto.getIdentifier());
        repository.setIsDefault(dto.getIsDefault());
        repository.setCreatedOn(dto.getCreatedOn());
        return repository;
    }
}

