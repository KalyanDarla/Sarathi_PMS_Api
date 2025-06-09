package com.sarathi.support.service;

import com.sarathi.support.dto.ChangesetParentDTO;
import com.sarathi.support.entity.ChangesetParent;
import com.sarathi.support.repository.ChangesetParentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ChangesetParentService {

    private final ChangesetParentRepository repository;

     
    public ChangesetParentService(ChangesetParentRepository repository) {
        this.repository = repository;
    }

    public List<ChangesetParentDTO> getAllChangesetParents() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<ChangesetParentDTO> getChangesetParentById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public ChangesetParentDTO saveChangesetParent(ChangesetParentDTO dto) {
        ChangesetParent changesetParent = convertToEntity(dto);
        ChangesetParent savedChangesetParent = repository.save(changesetParent);
        return convertToDTO(savedChangesetParent);
    }

    public void deleteChangesetParent(Integer id) {
        repository.deleteById(id);
    }

    private ChangesetParentDTO convertToDTO(ChangesetParent changesetParent) {
        return new ChangesetParentDTO(
                changesetParent.getChangesetId(),
                changesetParent.getParentId()
        );
    }

    private ChangesetParent convertToEntity(ChangesetParentDTO dto) {
        ChangesetParent changesetParent = new ChangesetParent();
        changesetParent.setChangesetId(dto.getChangesetId());
        changesetParent.setParentId(dto.getParentId());
        return changesetParent;
    }
}
