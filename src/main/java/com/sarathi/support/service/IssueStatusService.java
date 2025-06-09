package com.sarathi.support.service;

import com.sarathi.support.dto.IssueStatusDTO;
import com.sarathi.support.entity.IssueStatus;
import com.sarathi.support.repository.IssueStatusRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class IssueStatusService {

    private final IssueStatusRepository repository;

     
    public IssueStatusService(IssueStatusRepository repository) {
        this.repository = repository;
    }

    public List<IssueStatusDTO> getAllIssueStatuses() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<IssueStatusDTO> getIssueStatusById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public IssueStatusDTO saveIssueStatus(IssueStatusDTO dto) {
        IssueStatus issueStatus = convertToEntity(dto);
        IssueStatus savedIssueStatus = repository.save(issueStatus);
        return convertToDTO(savedIssueStatus);
    }

    public IssueStatusDTO updateIssueStatus(Integer id, IssueStatusDTO dto) {
        Optional<IssueStatus> existingStatusOpt = repository.findById(id);
        if (existingStatusOpt.isPresent()) {
            IssueStatus existingStatus = existingStatusOpt.get();
            existingStatus.setName(dto.getName());
            existingStatus.setIsClosed(dto.getIsClosed());
            existingStatus.setPosition(dto.getPosition());
            existingStatus.setDefaultDoneRatio(dto.getDefaultDoneRatio());

            IssueStatus updatedStatus = repository.save(existingStatus);
            return convertToDTO(updatedStatus);
        } else {
            throw new RuntimeException("IssueStatus with ID " + id + " not found.");
        }
    }

    public void deleteIssueStatus(Integer id) {
        repository.deleteById(id);
    }

    private IssueStatusDTO convertToDTO(IssueStatus issueStatus) {
        return new IssueStatusDTO(
                issueStatus.getId(),
                issueStatus.getName(),
                issueStatus.getIsClosed(),
                issueStatus.getPosition(),
                issueStatus.getDefaultDoneRatio()
        );
    }

    private IssueStatus convertToEntity(IssueStatusDTO dto) {
        IssueStatus issueStatus = new IssueStatus();
        issueStatus.setId(dto.getId());
        issueStatus.setName(dto.getName());
        issueStatus.setIsClosed(dto.getIsClosed());
        issueStatus.setPosition(dto.getPosition());
        issueStatus.setDefaultDoneRatio(dto.getDefaultDoneRatio());
        return issueStatus;
    }
}

