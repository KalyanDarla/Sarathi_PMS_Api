package com.sarathi.support.dto;

import java.time.Instant;
import java.time.LocalDate;

public class IssueViewDto {

	private Integer id;
	private String tracker;
	private String project;
	private String subject;
	private String description;
	private LocalDate dueDate;
	private String category;
	private String status;
	private String assigne;
	private Integer priorityId;
	private Integer fixedVersionId;
	private String author;
	private Integer lockVersion;
	private Instant createdOn;
	private Instant updatedOn;
	private LocalDate startDate;
	private Integer doneRatio;
	private Double estimatedHours;
	private Integer parentId;
	private Integer rootId;
	private String nicTeamHead;
	private String state;
	private String modleName;
	private Integer projectId;
	private Integer trackerId;
	private Integer oldStatusId;
	private Integer assigneId;
	private Integer statusId;

	public Integer getProjectId() {
		return projectId;
	}

	public Integer getTrackerId() {
		return trackerId;
	}

	public void setTrackerId(Integer trackerId) {
		this.trackerId = trackerId;
	}

	public Integer getOldStatusId() {
		return oldStatusId;
	}

	public void setOldStatusId(Integer oldStatusId) {
		this.oldStatusId = oldStatusId;
	}

	public Integer getAssigneId() {
		return assigneId;
	}

	public void setAssigneId(Integer assigneId) {
		this.assigneId = assigneId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getNicTeamHead() {
		return nicTeamHead;
	}

	public void setNicTeamHead(String nicTeamHead) {
		this.nicTeamHead = nicTeamHead;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getModleName() {
		return modleName;
	}

	public void setModleName(String modleName) {
		this.modleName = modleName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTracker() {
		return tracker;
	}

	public void setTracker(String tracker) {
		this.tracker = tracker;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAssigne() {
		return assigne;
	}

	public void setAssigne(String assigne) {
		this.assigne = assigne;
	}

	public Integer getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(Integer priorityId) {
		this.priorityId = priorityId;
	}

	public Integer getFixedVersionId() {
		return fixedVersionId;
	}

	public void setFixedVersionId(Integer fixedVersionId) {
		this.fixedVersionId = fixedVersionId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getLockVersion() {
		return lockVersion;
	}

	public void setLockVersion(Integer lockVersion) {
		this.lockVersion = lockVersion;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public Instant getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Instant updatedOn) {
		this.updatedOn = updatedOn;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public Integer getDoneRatio() {
		return doneRatio;
	}

	public void setDoneRatio(Integer doneRatio) {
		this.doneRatio = doneRatio;
	}

	public Double getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(Double estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getRootId() {
		return rootId;
	}

	public void setRootId(Integer rootId) {
		this.rootId = rootId;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public IssueViewDto() {
	}

	public IssueViewDto(Integer id, String tracker, String project, String subject, String description,
			LocalDate dueDate, String category, String status, String assigne, Integer priorityId,
			Integer fixedVersionId, String author, Integer lockVersion, Instant createdOn, Instant updatedOn,
			LocalDate startDate, Integer doneRatio, Double estimatedHours, Integer parentId, Integer rootId,
			String nicTeamHead, String state, String modleName, Integer projectId, Integer trackerId,
			Integer oldStatusId, Integer assigneId, Integer statusId) {
		super();
		this.id = id;
		this.tracker = tracker;
		this.project = project;
		this.subject = subject;
		this.description = description;
		this.dueDate = dueDate;
		this.category = category;
		this.status = status;
		this.assigne = assigne;
		this.priorityId = priorityId;
		this.fixedVersionId = fixedVersionId;
		this.author = author;
		this.lockVersion = lockVersion;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.startDate = startDate;
		this.doneRatio = doneRatio;
		this.estimatedHours = estimatedHours;
		this.parentId = parentId;
		this.rootId = rootId;
		this.nicTeamHead = nicTeamHead;
		this.state = state;
		this.modleName = modleName;
		this.projectId = projectId;
		this.trackerId = trackerId;
		this.oldStatusId = oldStatusId;
		this.assigneId = assigneId;
		this.statusId = statusId;
	}

}
