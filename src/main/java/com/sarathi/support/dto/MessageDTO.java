package com.sarathi.support.dto;

import java.time.Instant;

public class MessageDTO {
    private Integer id;
    private Integer boardId;
    private Integer parentId;
    private String subject;
    private String content;
    private Integer authorId;
    private Integer repliesCount;
    private Integer lastReplyId;
    private Instant createdOn;
    private Instant updatedOn;
    private Boolean locked;
    private Integer sticky;

    public MessageDTO() {}

    public MessageDTO(Integer id, Integer boardId, Integer parentId, String subject, String content, Integer authorId,
                      Integer repliesCount, Integer lastReplyId, Instant createdOn, Instant updatedOn, Boolean locked, Integer sticky) {
        this.id = id;
        this.boardId = boardId;
        this.parentId = parentId;
        this.subject = subject;
        this.content = content;
        this.authorId = authorId;
        this.repliesCount = repliesCount;
        this.lastReplyId = lastReplyId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.locked = locked;
        this.sticky = sticky;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBoardId() {
		return boardId;
	}

	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public Integer getRepliesCount() {
		return repliesCount;
	}

	public void setRepliesCount(Integer repliesCount) {
		this.repliesCount = repliesCount;
	}

	public Integer getLastReplyId() {
		return lastReplyId;
	}

	public void setLastReplyId(Integer lastReplyId) {
		this.lastReplyId = lastReplyId;
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

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public Integer getSticky() {
		return sticky;
	}

	public void setSticky(Integer sticky) {
		this.sticky = sticky;
	}

 }

