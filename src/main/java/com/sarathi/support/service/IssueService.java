package com.sarathi.support.service;

import com.sarathi.support.cache.SarathiTicketMasterCache;
import com.sarathi.support.dto.IssueDTO;
import com.sarathi.support.dto.IssueViewDto;
import com.sarathi.support.dto.UserDTO;
import com.sarathi.support.entity.Issue;
import com.sarathi.support.repository.IssueRepository;
import com.sarathi.support.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class IssueService {

	private final IssueRepository repository;

	private final UserRepository UserRepository;

	public IssueService(IssueRepository repository, UserRepository UserRepository) {
		this.repository = repository;
		this.UserRepository = UserRepository;
	}

	public List<IssueViewDto> getAllIssues() {
		return repository.findAll().stream().map(this::convertToIssueViewDTO).collect(Collectors.toList());
	}

	public Optional<IssueViewDto> getIssueById(Integer id) {
		return repository.findById(id).map(this::convertToIssueViewDTO);
	}

	public List<IssueViewDto> getIssueByAssignId(Integer assignId) {
		List<Issue> issueList = repository.findByassignedToId(assignId);
		List<IssueViewDto> issueViewList = new ArrayList<IssueViewDto>();
		for (Issue issue : issueList) {
			IssueViewDto issueViewDto = convertToIssueViewDTO(issue);
			issueViewList.add(issueViewDto);
		}
		return issueViewList;
	}

	public Integer getMaxIssueId() {
		Integer maxId = repository.findMaxId();
		return (maxId != null ? maxId + 1 : 1);
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
		return new IssueDTO(issue.getId(), issue.getTrackerId(), issue.getProjectId(), issue.getSubject(),
				issue.getDescription(), issue.getDueDate(), issue.getCategoryId(), issue.getStatusId(),
				issue.getAssignedToId(), issue.getPriorityId(), issue.getFixedVersionId(), issue.getAuthorId(),
				issue.getLockVersion(), issue.getCreatedOn(), issue.getUpdatedOn(), issue.getStartDate(),
				issue.getDoneRatio(), issue.getEstimatedHours(), issue.getParentId(), issue.getRootId(), issue.getLft(),
				issue.getRgt(), issue.getIsPrivate(), issue.getClosedOn(), issue.getNicTeamHead(), issue.getState(),
				issue.getModleName());
	}

	private IssueViewDto convertToIssueViewDTO(Issue issue) {
		UserService userService = new UserService(UserRepository);
		String trackerName = SarathiTicketMasterCache.getTrackerInfoByTrackerId(issue.getTrackerId());
		String projectName = SarathiTicketMasterCache.getProjectInfoByProjectId(issue.getProjectId());
		String statusId = SarathiTicketMasterCache.getIssueStatusInfoByStatusId(issue.getStatusId());
		String category = SarathiTicketMasterCache.getCategoryCache(issue.getCategoryId());
		Optional<UserDTO> assignedUserInfo = userService.getUserById(issue.getAssignedToId());
		String assignedName = assignedUserInfo.get().getFirstname() + assignedUserInfo.get().getLastname();
		Optional<UserDTO> reporterInfo = userService.getUserById(issue.getAuthorId());
		String reporterName = reporterInfo.get().getFirstname() + reporterInfo.get().getLastname();

		return new IssueViewDto(issue.getId(), trackerName, projectName, issue.getSubject(), issue.getDescription(),
				issue.getDueDate(), category, statusId, assignedName, issue.getPriorityId(), issue.getFixedVersionId(),
				reporterName, issue.getLockVersion(), issue.getCreatedOn(), issue.getUpdatedOn(), issue.getStartDate(),
				issue.getDoneRatio(), issue.getEstimatedHours(), issue.getParentId(), issue.getRootId(),
				issue.getNicTeamHead(), issue.getState(), issue.getModleName(), issue.getProjectId(),
				issue.getTrackerId(), issue.getStatusId(), issue.getAssignedToId(), issue.getStatusId());

	}

	private Issue convertToEntity(IssueDTO dto) {
		Issue issue = new Issue();

		issue.setId(this.getMaxIssueId());
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
		issue.setNicTeamHead(dto.getNicTeamHead());
		issue.setState(dto.getState());
		issue.setModleName(dto.getModleName());
		return issue;
	}

	public boolean updateStatus(Integer issueId, Integer statusId) {
		try {
			Optional<Issue> optionalIssue = repository.findById(issueId);
			System.err.println("optionalIssue: " + issueId);
			if (optionalIssue.isPresent()) {
				Issue issue = optionalIssue.get();
				issue.setStatusId(statusId);
				repository.save(issue);
				return true;
			} else {
				System.err.println("Issue not found with ID: " + issueId);
				return false;
			}

		} catch (Exception e) {
			System.err.println("Error occurred while updating status for issue ID " + issueId + ": " + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

}
