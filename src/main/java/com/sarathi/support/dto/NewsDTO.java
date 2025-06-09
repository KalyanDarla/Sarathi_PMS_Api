package com.sarathi.support.dto;

import java.time.Instant;

public class NewsDTO {
    private Integer id;
    private Integer projectId;
    private String title;
    private String summary;
    private String description;
    private Integer authorId;
    private Instant createdOn;
    private Integer commentsCount;

    public NewsDTO() {}

    public NewsDTO(Integer id, Integer projectId, String title, String summary, String description, Integer authorId, Instant createdOn, Integer commentsCount) {
        this.id = id;
        this.projectId = projectId;
        this.title = title;
        this.summary = summary;
        this.description = description;
        this.authorId = authorId;
        this.createdOn = createdOn;
        this.commentsCount = commentsCount;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public Integer getCommentsCount() {
		return commentsCount;
	}

	public void setCommentsCount(Integer commentsCount) {
		this.commentsCount = commentsCount;
	}

 }

