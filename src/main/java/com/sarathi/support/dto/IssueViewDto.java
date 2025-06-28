package com.sarathi.support.dto;

import java.time.Instant;
import java.time.LocalDate;

public class IssueViewDto {
	
	private Integer id;
    private String trackerId;
    private String projectId;
    private String subject;
    private String description;
    private LocalDate dueDate;
    private String categoryId;
    private String statusId;
    private String assignedToId;
    private Integer priorityId;
    private Integer fixedVersionId;
    private String authorId;
    private Integer lockVersion;
    private Instant createdOn;
    private Instant updatedOn;
    private LocalDate startDate;
    private Integer doneRatio;
    private Double estimatedHours;
    private Integer parentId;
    private Integer rootId;
    public IssueViewDto(Integer id, String trackerName, String projectName, String subject, String description,
			LocalDate dueDate, String string, String statusId, String assignedToId, Integer priorityId,
			Integer fixedVersionId, String authorId, Integer lockVersion, Instant createdOn, Instant updatedOn,
			LocalDate startDate, Integer doneRatio, Double estimatedHours, Integer parentId, Integer rootId
			) {
		// TODO Auto-generated constructor stub
    	
    	this.id = id;
        this.trackerId = trackerName;
        this.projectId = projectName;
        this.subject = subject;
        this.description = description;
        this.dueDate = dueDate;
        this.categoryId = string;
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
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the trackerId
	 */
	public String getTrackerId() {
		return trackerId;
	}
	/**
	 * @param trackerId the trackerId to set
	 */
	public void setTrackerId(String trackerId) {
		this.trackerId = trackerId;
	}
	/**
	 * @return the projectId
	 */
	public String getProjectId() {
		return projectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the dueDate
	 */
	public LocalDate getDueDate() {
		return dueDate;
	}
	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * @return the statusId
	 */
	public String getStatusId() {
		return statusId;
	}
	/**
	 * @param statusId the statusId to set
	 */
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	/**
	 * @return the assignedToId
	 */
	public String getAssignedToId() {
		return assignedToId;
	}
	/**
	 * @param assignedToId the assignedToId to set
	 */
	public void setAssignedToId(String assignedToId) {
		this.assignedToId = assignedToId;
	}
	/**
	 * @return the priorityId
	 */
	public Integer getPriorityId() {
		return priorityId;
	}
	/**
	 * @param priorityId the priorityId to set
	 */
	public void setPriorityId(Integer priorityId) {
		this.priorityId = priorityId;
	}
	/**
	 * @return the fixedVersionId
	 */
	public Integer getFixedVersionId() {
		return fixedVersionId;
	}
	/**
	 * @param fixedVersionId the fixedVersionId to set
	 */
	public void setFixedVersionId(Integer fixedVersionId) {
		this.fixedVersionId = fixedVersionId;
	}
	/**
	 * @return the authorId
	 */
	public String getAuthorId() {
		return authorId;
	}
	/**
	 * @param authorId the authorId to set
	 */
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	/**
	 * @return the lockVersion
	 */
	public Integer getLockVersion() {
		return lockVersion;
	}
	/**
	 * @param lockVersion the lockVersion to set
	 */
	public void setLockVersion(Integer lockVersion) {
		this.lockVersion = lockVersion;
	}
	/**
	 * @return the createdOn
	 */
	public Instant getCreatedOn() {
		return createdOn;
	}
	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}
	/**
	 * @return the updatedOn
	 */
	public Instant getUpdatedOn() {
		return updatedOn;
	}
	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(Instant updatedOn) {
		this.updatedOn = updatedOn;
	}
	/**
	 * @return the startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the doneRatio
	 */
	public Integer getDoneRatio() {
		return doneRatio;
	}
	/**
	 * @param doneRatio the doneRatio to set
	 */
	public void setDoneRatio(Integer doneRatio) {
		this.doneRatio = doneRatio;
	}
	/**
	 * @return the estimatedHours
	 */
	public Double getEstimatedHours() {
		return estimatedHours;
	}
	/**
	 * @param estimatedHours the estimatedHours to set
	 */
	public void setEstimatedHours(Double estimatedHours) {
		this.estimatedHours = estimatedHours;
	}
	/**
	 * @return the parentId
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * @return the rootId
	 */
	public Integer getRootId() {
		return rootId;
	}
	/**
	 * @param rootId the rootId to set
	 */
	public void setRootId(Integer rootId) {
		this.rootId = rootId;
	}
	/**
	 * @return the isPrivate
	 */
	public Boolean getIsPrivate() {
		return isPrivate;
	}
	/**
	 * @param isPrivate the isPrivate to set
	 */
	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
	/**
	 * @return the closedOn
	 */
	public Instant getClosedOn() {
		return closedOn;
	}
	/**
	 * @param closedOn the closedOn to set
	 */
	public void setClosedOn(Instant closedOn) {
		this.closedOn = closedOn;
	}
	private Boolean isPrivate;
    private Instant closedOn;

}
