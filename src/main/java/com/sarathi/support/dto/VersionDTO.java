package com.sarathi.support.dto;

import java.time.Instant;
import java.time.LocalDate;

public class VersionDTO {
    private Integer id;
    private Integer projectId;
    private String name;
    private String description;
    private LocalDate effectiveDate;
    private Instant createdOn;
    private Instant updatedOn;
    private String wikiPageTitle;
    private String status;
    private String sharing;

    public VersionDTO() {}

    public VersionDTO(Integer id, Integer projectId, String name, String description, LocalDate effectiveDate, Instant createdOn,
                      Instant updatedOn, String wikiPageTitle, String status, String sharing) {
        this.id = id;
        this.projectId = projectId;
        this.name = name;
        this.description = description;
        this.effectiveDate = effectiveDate;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.wikiPageTitle = wikiPageTitle;
        this.status = status;
        this.sharing = sharing;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(LocalDate effectiveDate) {
		this.effectiveDate = effectiveDate;
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

	public String getWikiPageTitle() {
		return wikiPageTitle;
	}

	public void setWikiPageTitle(String wikiPageTitle) {
		this.wikiPageTitle = wikiPageTitle;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSharing() {
		return sharing;
	}

	public void setSharing(String sharing) {
		this.sharing = sharing;
	}

 }

