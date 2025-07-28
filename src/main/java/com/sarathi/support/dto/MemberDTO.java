package com.sarathi.support.dto;

import java.time.Instant;

public class MemberDTO {
    private Integer id;
    private Integer userId;
    private Integer projectId;
    private Instant createdOn;
    private Boolean mailNotification;

    public MemberDTO() {}

    public MemberDTO(Integer id, Integer userId, Integer projectId, Instant createdOn, Boolean mailNotification) {
        this.id = id;
        this.userId = userId;
        this.projectId = projectId;
        this.createdOn = createdOn;
        this.mailNotification = mailNotification;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public Boolean getMailNotification() {
		return mailNotification;
	}

	public void setMailNotification(Boolean mailNotification) {
		this.mailNotification = mailNotification;
	}

 }

