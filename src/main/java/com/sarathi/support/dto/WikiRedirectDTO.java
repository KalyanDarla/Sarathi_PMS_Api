package com.sarathi.support.dto;

import java.time.Instant;

public class WikiRedirectDTO {
    private Integer id;
    private Integer wikiId;
    private String title;
    private String redirectsTo;
    private Instant createdOn;
    private Integer redirectsToWikiId;

    public WikiRedirectDTO() {}

    public WikiRedirectDTO(Integer id, Integer wikiId, String title, String redirectsTo, Instant createdOn, Integer redirectsToWikiId) {
        this.id = id;
        this.wikiId = wikiId;
        this.title = title;
        this.redirectsTo = redirectsTo;
        this.createdOn = createdOn;
        this.redirectsToWikiId = redirectsToWikiId;
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

	public String getRedirectsTo() {
		return redirectsTo;
	}

	public void setRedirectsTo(String redirectsTo) {
		this.redirectsTo = redirectsTo;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public Integer getRedirectsToWikiId() {
		return redirectsToWikiId;
	}

	public void setRedirectsToWikiId(Integer redirectsToWikiId) {
		this.redirectsToWikiId = redirectsToWikiId;
	}

 }

