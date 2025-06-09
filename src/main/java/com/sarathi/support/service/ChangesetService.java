package com.sarathi.support.service;

import com.sarathi.support.dto.ChangesetDTO;
import com.sarathi.support.entity.Changeset;
import com.sarathi.support.repository.ChangesetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ChangesetService {

    private final ChangesetRepository repository;

     
    public ChangesetService(ChangesetRepository repository) {
        this.repository = repository;
    }

    public List<ChangesetDTO> getAllChangesets() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<ChangesetDTO> getChangesetById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public ChangesetDTO saveChangeset(ChangesetDTO dto) {
        Changeset changeset = convertToEntity(dto);
        Changeset savedChangeset = repository.save(changeset);
        return convertToDTO(savedChangeset);
    }

    public void deleteChangeset(Integer id) {
        repository.deleteById(id);
    }

    private ChangesetDTO convertToDTO(Changeset changeset) {
        return new ChangesetDTO(
                changeset.getId(),
                changeset.getRepositoryId(),
                changeset.getRevision(),
                changeset.getCommitter(),
                changeset.getCommittedOn(),
                changeset.getComments(),
                changeset.getCommitDate(),
                changeset.getScmid(),
                changeset.getUserId()
        );
    }

    private Changeset convertToEntity(ChangesetDTO dto) {
        Changeset changeset = new Changeset();
        changeset.setId(dto.getId());
        changeset.setRepositoryId(dto.getRepositoryId());
        changeset.setRevision(dto.getRevision());
        changeset.setCommitter(dto.getCommitter());
        changeset.setCommittedOn(dto.getCommittedOn());
        changeset.setComments(dto.getComments());
        changeset.setCommitDate(dto.getCommitDate());
        changeset.setScmid(dto.getScmid());
        changeset.setUserId(dto.getUserId());
        return changeset;
    }
}
