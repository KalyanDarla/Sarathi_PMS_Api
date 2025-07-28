package com.sarathi.support.dto;

import java.time.Instant;

public class DocumentDTO {
    private Integer id;
    private Integer projectId;
    private Integer categoryId;
    private String title;
    private String description;
    private Instant createdOn;

    public DocumentDTO() {}

    public DocumentDTO(Integer id, Integer projectId, Integer categoryId, String title, String description, Instant createdOn) {
        this.id = id;
        this.projectId = projectId;
        this.categoryId = categoryId;
        this.title = title;
        this.description = description;
        this.createdOn = createdOn;
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

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

 }
