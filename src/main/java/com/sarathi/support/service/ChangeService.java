package com.sarathi.support.service;

import com.sarathi.support.dto.ChangeDTO;
import com.sarathi.support.entity.Change;
import com.sarathi.support.repository.ChangeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ChangeService {

    private final ChangeRepository repository;

     
    public ChangeService(ChangeRepository repository) {
        this.repository = repository;
    }

    public List<ChangeDTO> getAllChanges() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<ChangeDTO> getChangeById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public ChangeDTO saveChange(ChangeDTO dto) {
        Change change = convertToEntity(dto);
        Change savedChange = repository.save(change);
        return convertToDTO(savedChange);
    }

    public void deleteChange(Integer id) {
        repository.deleteById(id);
    }

    private ChangeDTO convertToDTO(Change change) {
        return new ChangeDTO(
                change.getId(),
                change.getChangesetId(),
                change.getAction(),
                change.getPath(),
                change.getFromPath(),
                change.getFromRevision(),
                change.getRevision(),
                change.getBranch()
        );
    }

    private Change convertToEntity(ChangeDTO dto) {
        Change change = new Change();
        change.setId(dto.getId());
        change.setChangesetId(dto.getChangesetId());
        change.setAction(dto.getAction());
        change.setPath(dto.getPath());
        change.setFromPath(dto.getFromPath());
        change.setFromRevision(dto.getFromRevision());
        change.setRevision(dto.getRevision());
        change.setBranch(dto.getBranch());
        return change;
    }
}
