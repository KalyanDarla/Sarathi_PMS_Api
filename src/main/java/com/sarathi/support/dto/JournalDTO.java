package com.sarathi.support.dto;

import java.sql.Timestamp;
import java.time.Instant;

public class JournalDTO {
    private Integer id;
    private Integer journalizedId;
    private String journalizedType;
    private Integer userId;
    private String notes;
    private Timestamp createdOn;
    private Boolean privateNotes;

    public JournalDTO() {}

    public JournalDTO(Integer id, Integer journalizedId, String journalizedType, Integer userId, String notes, Timestamp createdOn, Boolean privateNotes) {
        this.id = id;
        this.journalizedId = journalizedId;
        this.journalizedType = journalizedType;
        this.userId = userId;
        this.notes = notes;
        this.createdOn = createdOn;
        this.privateNotes = privateNotes;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getJournalizedId() {
		return journalizedId;
	}

	public void setJournalizedId(Integer journalizedId) {
		this.journalizedId = journalizedId;
	}

	public String getJournalizedType() {
		return journalizedType;
	}

	public void setJournalizedType(String journalizedType) {
		this.journalizedType = journalizedType;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Boolean getPrivateNotes() {
		return privateNotes;
	}

	public void setPrivateNotes(Boolean privateNotes) {
		this.privateNotes = privateNotes;
	}

 }

