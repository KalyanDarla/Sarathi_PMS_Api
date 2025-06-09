package com.sarathi.support.dto;

import java.time.Instant;

public class CommentDTO {
    private Integer id;
    private String commentedType;
    private Integer commentedId;
    private Integer authorId;
    private String content;
    private Instant createdOn;
    private Instant updatedOn;

    public CommentDTO() {}

    public CommentDTO(Integer id, String commentedType, Integer commentedId, Integer authorId, String content, Instant createdOn, Instant updatedOn) {
        this.id = id;
        this.commentedType = commentedType;
        this.commentedId = commentedId;
        this.authorId = authorId;
        this.content = content;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommentedType() {
		return commentedType;
	}

	public void setCommentedType(String commentedType) {
		this.commentedType = commentedType;
	}

	public Integer getCommentedId() {
		return commentedId;
	}

	public void setCommentedId(Integer commentedId) {
		this.commentedId = commentedId;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
