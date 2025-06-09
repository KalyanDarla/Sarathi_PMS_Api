package com.sarathi.support.dto;

import java.time.Instant;

public class WikiContentDTO {
    private Integer id;
    private Integer pageId;
    private Integer authorId;
    private String text;
    private String comments;
    private Instant updatedOn;
    private Integer version;

    public WikiContentDTO() {}

    public WikiContentDTO(Integer id, Integer pageId, Integer authorId, String text, String comments, Instant updatedOn, Integer version) {
        this.id = id;
        this.pageId = pageId;
        this.authorId = authorId;
        this.text = text;
        this.comments = comments;
        this.updatedOn = updatedOn;
        this.version = version;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPageId() {
		return pageId;
	}

	public void setPageId(Integer pageId) {
		this.pageId = pageId;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Instant getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Instant updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

 }

