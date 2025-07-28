 package com.sarathi.support.dto;

import java.time.Instant;

public class ImportDTO {
    private Integer id;
    private String type;
    private Integer userId;
    private String filename;
    private String settings;
    private Integer totalItems;
    private Boolean finished;
    private Instant createdAt;
    private Instant updatedAt;

    public ImportDTO() {}

    public ImportDTO(Integer id, String type, Integer userId, String filename, String settings, Integer totalItems, Boolean finished, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.type = type;
        this.userId = userId;
        this.filename = filename;
        this.settings = settings;
        this.totalItems = totalItems;
        this.finished = finished;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getSettings() {
		return settings;
	}

	public void setSettings(String settings) {
		this.settings = settings;
	}

	public Integer getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Boolean getFinished() {
		return finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}

 }
