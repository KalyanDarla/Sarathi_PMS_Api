package com.sarathi.support.service;

import com.sarathi.support.dto.ChangesetsIssueDTO;
import com.sarathi.support.entity.ChangesetsIssue;
import com.sarathi.support.repository.ChangesetsIssueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ChangesetsIssueService {

    private final ChangesetsIssueRepository repository;

     
    public ChangesetsIssueService(ChangesetsIssueRepository repository) {
        this.repository = repository;
    }

    public List<ChangesetsIssueDTO> getAllChangesetsIssues() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<ChangesetsIssueDTO> getChangesetsIssueById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public ChangesetsIssueDTO saveChangesetsIssue(ChangesetsIssueDTO dto) {
        ChangesetsIssue changesetsIssue = convertToEntity(dto);
        ChangesetsIssue savedChangesetsIssue = repository.save(changesetsIssue);
        return convertToDTO(savedChangesetsIssue);
    }

    public void deleteChangesetsIssue(Integer id) {
        repository.deleteById(id);
    }

    private ChangesetsIssueDTO convertToDTO(ChangesetsIssue changesetsIssue) {
        return new ChangesetsIssueDTO(
                changesetsIssue.getChangesetId(),
                changesetsIssue.getIssueId()
        );
    }

    private ChangesetsIssue convertToEntity(ChangesetsIssueDTO dto) {
        ChangesetsIssue changesetsIssue = new ChangesetsIssue();
        changesetsIssue.setChangesetId(dto.getChangesetId());
        changesetsIssue.setIssueId(dto.getIssueId());
        return changesetsIssue;
    }
}
