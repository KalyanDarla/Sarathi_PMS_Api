package com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "issues", schema = "public", indexes = {
        @Index(name = "index_issues_on_tracker_id", columnList = "tracker_id"),
        @Index(name = "issues_project_id", columnList = "project_id"),
        @Index(name = "index_issues_on_category_id", columnList = "category_id"),
        @Index(name = "index_issues_on_status_id", columnList = "status_id"),
        @Index(name = "index_issues_on_assigned_to_id", columnList = "assigned_to_id"),
        @Index(name = "index_issues_on_priority_id", columnList = "priority_id"),
        @Index(name = "index_issues_on_fixed_version_id", columnList = "fixed_version_id"),
        @Index(name = "index_issues_on_author_id", columnList = "author_id"),
        @Index(name = "index_issues_on_created_on", columnList = "created_on"),
        @Index(name = "index_issues_on_parent_id", columnList = "parent_id"),
        @Index(name = "index_issues_on_root_id_and_lft_and_rgt", columnList = "root_id, lft, rgt")
})
public class Issue {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "tracker_id", nullable = false)
    private Integer trackerId;

    @Column(name = "project_id", nullable = false)
    private Integer projectId;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "description")
    private String description;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "status_id", nullable = false)
    private Integer statusId;

    @Column(name = "assigned_to_id")
    private Integer assignedToId;

    @Column(name = "priority_id", nullable = false)
    private Integer priorityId;

    @Column(name = "fixed_version_id")
    private Integer fixedVersionId;

    @Column(name = "author_id", nullable = false)
    private Integer authorId;

    @Column(name = "lock_version", nullable = false)
    private Integer lockVersion;

    @Column(name = "created_on")
    private Instant createdOn;

    @Column(name = "updated_on")
    private Instant updatedOn;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "done_ratio", nullable = false)
    private Integer doneRatio;

    @Column(name = "estimated_hours")
    private Double estimatedHours;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "root_id")
    private Integer rootId;

    @Column(name = "lft")
    private Integer lft;

    @Column(name = "rgt")
    private Integer rgt;

    @Column(name = "is_private", nullable = false)
    private Boolean isPrivate = false;

    @Column(name = "closed_on")
    private Instant closedOn;

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