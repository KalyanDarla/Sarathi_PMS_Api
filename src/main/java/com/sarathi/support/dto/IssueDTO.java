package com.sarathi.support.dto;

import java.time.Instant;
import java.time.LocalDate;

import jakarta.persistence.Column;

public class IssueDTO {
    private Integer id;
    private Integer trackerId;
    private Integer projectId;
    private String subject;
    private String description;
    private LocalDate dueDate;
    private Integer categoryId;
    private Integer statusId;
    private Integer assignedToId;
    private Integer priorityId;
    private Integer fixedVersionId;
    private Integer authorId;
    private Integer lockVersion;
    private Instant createdOn;
    private Instant updatedOn;
    private LocalDate startDate;
    private Integer doneRatio;
    private Double estimatedHours;
    private Integer parentId;
    private Integer rootId;
    private Integer lft;
    private Integer rgt;
    private Boolean isPrivate;
    private Instant closedOn;
 
    private String nicTeamHead;
    private String state;
    private String modleName;

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

	public IssueDTO() {}

    
	public IssueDTO(Integer id, Integer trackerId, Integer projectId, String subject, String description,
			LocalDate dueDate, Integer categoryId, Integer statusId, Integer assignedToId, Integer priorityId,
			Integer fixedVersionId, Integer authorId, Integer lockVersion, Instant createdOn, Instant updatedOn,
			LocalDate startDate, Integer doneRatio, Double estimatedHours, Integer parentId, Integer rootId,
			Integer lft, Integer rgt, Boolean isPrivate, Instant closedOn, String nicTeamHead, String state,
			String modleName) {
		super();
		this.id = id;
		this.trackerId = trackerId;
		this.projectId = projectId;
		this.subject = subject;
		this.description = description;
		this.dueDate = dueDate;
		this.categoryId = categoryId;
		this.statusId = statusId;
		this.assignedToId = assignedToId;
		this.priorityId = priorityId;
		this.fixedVersionId = fixedVersionId;
		this.authorId = authorId;
		this.lockVersion = lockVersion;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.startDate = startDate;
		this.doneRatio = doneRatio;
		this.estimatedHours = estimatedHours;
		this.parentId = parentId;
		this.rootId = rootId;
		this.lft = lft;
		this.rgt = rgt;
		this.isPrivate = isPrivate;
		this.closedOn = closedOn;
		this.nicTeamHead = nicTeamHead;
		this.state = state;
		this.modleName = modleName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTrackerId() {
		return trackerId;
	}

	public void setTrackerId(Integer trackerId) {
		this.trackerId = trackerId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
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

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public Integer getAssignedToId() {
		return assignedToId;
	}

	public void setAssignedToId(Integer assignedToId) {
		this.assignedToId = assignedToId;
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

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
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

	public Integer getLft() {
		return lft;
	}

	public void setLft(Integer lft) {
		this.lft = lft;
	}

	public Integer getRgt() {
		return rgt;
	}

	public void setRgt(Integer rgt) {
		this.rgt = rgt;
	}

	public Boolean getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public Instant getClosedOn() {
		return closedOn;
	}

	public void setClosedOn(Instant closedOn) {
		this.closedOn = closedOn;
	}

 }
