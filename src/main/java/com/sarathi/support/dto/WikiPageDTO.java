package com.sarathi.support.dto;

import java.time.Instant;

public class WikiPageDTO {
    private Integer id;
    private Integer wikiId;
    private String title;
    private Instant createdOn;
    private Boolean protectedField;
    private Integer parentId;

    public WikiPageDTO() {}

    public WikiPageDTO(Integer id, Integer wikiId, String title, Instant createdOn, Boolean protectedField, Integer parentId) {
        this.id = id;
        this.wikiId = wikiId;
        this.title = title;
        this.createdOn = createdOn;
        this.protectedField = protectedField;
        this.parentId = parentId;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getWikiId() {
		return wikiId;
	}

	public void setWikiId(Integer wikiId) {
		this.wikiId = wikiId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public Boolean getProtectedField() {
		return protectedField;
	}

	public void setProtectedField(Boolean protectedField) {
		this.protectedField = protectedField;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

 }

