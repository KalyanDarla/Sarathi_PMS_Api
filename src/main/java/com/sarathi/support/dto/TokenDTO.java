package com.sarathi.support.dto;

import java.time.Instant;

public class TokenDTO {
    private Integer id;
    private Integer userId;
    private String action;
    private String value;
    private Instant createdOn;
    private Instant updatedOn;

    public TokenDTO() {}

    public TokenDTO(Integer id, Integer userId, String action, String value, Instant createdOn, Instant updatedOn) {
        this.id = id;
        this.userId = userId;
        this.action = action;
        this.value = value;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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
