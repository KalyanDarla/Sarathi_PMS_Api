package com.sarathi.support.dto;

import java.time.Instant;
import java.time.LocalDate;

public class TimeEntryDTO {
    private Integer id;
    private Integer projectId;
    private Integer userId;
    private Integer issueId;
    private Double hours;
    private String comments;
    private Integer activityId;
    private LocalDate spentOn;
    private Integer tyear;
    private Integer tmonth;
    private Integer tweek;
    private Instant createdOn;
    private Instant updatedOn;

    public TimeEntryDTO() {}

    public TimeEntryDTO(Integer id, Integer projectId, Integer userId, Integer issueId, Double hours, String comments,
                        Integer activityId, LocalDate spentOn, Integer tyear, Integer tmonth, Integer tweek, Instant createdOn, Instant updatedOn) {
        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.issueId = issueId;
        this.hours = hours;
        this.comments = comments;
        this.activityId = activityId;
        this.spentOn = spentOn;
        this.tyear = tyear;
        this.tmonth = tmonth;
        this.tweek = tweek;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getIssueId() {
		return issueId;
	}

	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
	}

	public Double getHours() {
		return hours;
	}

	public void setHours(Double hours) {
		this.hours = hours;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public LocalDate getSpentOn() {
		return spentOn;
	}

	public void setSpentOn(LocalDate spentOn) {
		this.spentOn = spentOn;
	}

	public Integer getTyear() {
		return tyear;
	}

	public void setTyear(Integer tyear) {
		this.tyear = tyear;
	}

	public Integer getTmonth() {
		return tmonth;
	}

	public void setTmonth(Integer tmonth) {
		this.tmonth = tmonth;
	}

	public Integer getTweek() {
		return tweek;
	}

	public void setTweek(Integer tweek) {
		this.tweek = tweek;
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

 }

