package com.sarathi.support.dto;

import java.time.Instant;

public class WikiContentVersionDTO {
    private Integer id;
    private Integer wikiContentId;
    private Integer pageId;
    private Integer authorId;
    private byte[] data;
    private String compression;
    private String comments;
    private Instant updatedOn;
    private Integer version;

    public WikiContentVersionDTO() {}

    public WikiContentVersionDTO(Integer id, Integer wikiContentId, Integer pageId, Integer authorId, byte[] data,
                                 String compression, String comments, Instant updatedOn, Integer version) {
        this.id = id;
        this.wikiContentId = wikiContentId;
        this.pageId = pageId;
        this.authorId = authorId;
        this.data = data;
        this.compression = compression;
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

	public Integer getWikiContentId() {
		return wikiContentId;
	}

	public void setWikiContentId(Integer wikiContentId) {
		this.wikiContentId = wikiContentId;
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

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getCompression() {
		return compression;
	}

	public void setCompression(String compression) {
		this.compression = compression;
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
