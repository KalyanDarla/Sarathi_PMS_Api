package com.sarathi.support.service;

import com.sarathi.support.dto.IssueRelationDTO;
import com.sarathi.support.entity.IssueRelation;
import com.sarathi.support.repository.IssueRelationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class IssueRelationService {

    private final IssueRelationRepository repository;

     
    public IssueRelationService(IssueRelationRepository repository) {
        this.repository = repository;
    }

    public List<IssueRelationDTO> getAllIssueRelations() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<IssueRelationDTO> getIssueRelationById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public IssueRelationDTO saveIssueRelation(IssueRelationDTO dto) {
        IssueRelation issueRelation = convertToEntity(dto);
        IssueRelation savedIssueRelation = repository.save(issueRelation);
        return convertToDTO(savedIssueRelation);
    }

    public IssueRelationDTO updateIssueRelation(Integer id, IssueRelationDTO dto) {
        Optional<IssueRelation> existingRelationOpt = repository.findById(id);
        if (existingRelationOpt.isPresent()) {
            IssueRelation existingRelation = existingRelationOpt.get();
            existingRelation.setIssueFromId(dto.getIssueFromId());
            existingRelation.setIssueToId(dto.getIssueToId());
            existingRelation.setRelationType(dto.getRelationType());
            existingRelation.setDelay(dto.getDelay());

            IssueRelation updatedRelation = repository.save(existingRelation);
            return convertToDTO(updatedRelation);
        } else {
            throw new RuntimeException("IssueRelation with ID " + id + " not found.");
        }
    }

    public void deleteIssueRelation(Integer id) {
        repository.deleteById(id);
    }

    private IssueRelationDTO convertToDTO(IssueRelation issueRelation) {
        return new IssueRelationDTO(
                issueRelation.getId(),
                issueRelation.getIssueFromId(),
                issueRelation.getIssueToId(),
                issueRelation.getRelationType(),
                issueRelation.getDelay()
        );
    }

    private IssueRelation convertToEntity(IssueRelationDTO dto) {
        IssueRelation issueRelation = new IssueRelation();
        issueRelation.setId(dto.getId());
        issueRelation.setIssueFromId(dto.getIssueFromId());
        issueRelation.setIssueToId(dto.getIssueToId());
        issueRelation.setRelationType(dto.getRelationType());
        issueRelation.setDelay(dto.getDelay());
        return issueRelation;
    }
}

