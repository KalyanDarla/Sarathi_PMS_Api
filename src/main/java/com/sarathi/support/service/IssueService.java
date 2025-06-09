package com.sarathi.support.service;

import com.sarathi.support.dto.IssueDTO;
import com.sarathi.support.entity.Issue;
import com.sarathi.support.repository.IssueRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class IssueService {

    private final IssueRepository repository;

     
    public IssueService(IssueRepository repository) {
        this.repository = repository;
    }

    public List<IssueDTO> getAllIssues() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<IssueDTO> getIssueById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public IssueDTO saveIssue(IssueDTO dto) {
        Issue issue = convertToEntity(dto);

        Issue savedIssue = repository.save(issue);
        return convertToDTO(savedIssue);
    }

    public IssueDTO updateIssue(Integer id, IssueDTO dto) {
        Optional<Issue> existingIssueOpt = repository.findById(id);
        if (existingIssueOpt.isPresent()) {
            Issue existingIssue = existingIssueOpt.get();
            existingIssue.setTrackerId(dto.getTrackerId());
            existingIssue.setProjectId(dto.getProjectId());
            existingIssue.setSubject(dto.getSubject());
            existingIssue.setDescription(dto.getDescription());
            existingIssue.setDueDate(dto.getDueDate());
            existingIssue.setCategoryId(dto.getCategoryId());
            existingIssue.setStatusId(dto.getStatusId());
            existingIssue.setAssignedToId(dto.getAssignedToId());
            existingIssue.setPriorityId(dto.getPriorityId());
            existingIssue.setFixedVersionId(dto.getFixedVersionId());
            existingIssue.setAuthorId(dto.getAuthorId());
            existingIssue.setLockVersion(dto.getLockVersion());
            existingIssue.setCreatedOn(Instant.now()); // Only if needed, or else skip
            existingIssue.setUpdatedOn(Instant.now()); // Usually auto-set on update
            existingIssue.setStartDate(dto.getStartDate());
            existingIssue.setDoneRatio(dto.getDoneRatio());
            existingIssue.setEstimatedHours(dto.getEstimatedHours());
            existingIssue.setParentId(dto.getParentId());
            existingIssue.setRootId(dto.getRootId());
            existingIssue.setLft(dto.getLft());
            existingIssue.setRgt(dto.getRgt());
            existingIssue.setIsPrivate(dto.getIsPrivate());
            existingIssue.setClosedOn(dto.getClosedOn());

            Issue updatedIssue = repository.save(existingIssue);
            return convertToDTO(updatedIssue);
        } else {
            throw new RuntimeException("Issue with ID " + id + " not found.");
        }
    }

    public void deleteIssue(Integer id) {
        repository.deleteById(id);
    }

    private IssueDTO convertToDTO(Issue issue) {
        return new IssueDTO(issue.getId(), issue.getTrackerId(), issue.getProjectId(), issue.getSubject(), issue.getDescription(),
                issue.getDueDate(), issue.getCategoryId(), issue.getStatusId(), issue.getAssignedToId(), issue.getPriorityId(),
                issue.getFixedVersionId(), issue.getAuthorId(), issue.getLockVersion(), issue.getCreatedOn(), issue.getUpdatedOn(),
                issue.getStartDate(), issue.getDoneRatio(), issue.getEstimatedHours(), issue.getParentId(), issue.getRootId(),
                issue.getLft(), issue.getRgt(), issue.getIsPrivate(), issue.getClosedOn());
    }

    private Issue convertToEntity(IssueDTO dto) {
        Issue issue = new Issue();
        issue.setId(dto.getId());
        issue.setTrackerId(dto.getTrackerId());
        issue.setProjectId(dto.getProjectId());
        issue.setSubject(dto.getSubject());
        issue.setDescription(dto.getDescription());
        issue.setDueDate(dto.getDueDate());
        issue.setCategoryId(dto.getCategoryId());
        issue.setStatusId(dto.getStatusId());
        issue.setAssignedToId(dto.getAssignedToId());
        issue.setPriorityId(dto.getPriorityId());
        issue.setFixedVersionId(dto.getFixedVersionId());
        issue.setAuthorId(dto.getAuthorId());
        issue.setLockVersion(dto.getLockVersion());
        issue.setCreatedOn(Instant.now());
        issue.setUpdatedOn(Instant.now());
        issue.setStartDate(dto.getStartDate());
        issue.setDoneRatio(dto.getDoneRatio());
        issue.setEstimatedHours(dto.getEstimatedHours());
        issue.setParentId(dto.getParentId());
        issue.setRootId(dto.getRootId());
        issue.setLft(dto.getLft());
        issue.setRgt(dto.getRgt());
        issue.setIsPrivate(dto.getIsPrivate());
        issue.setClosedOn(dto.getClosedOn());
        return issue;
    }
}

