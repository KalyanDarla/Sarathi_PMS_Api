package com.sarathi.support.dto;

import java.time.Instant;

public class EmailAddressDTO {
    private Integer id;
    private Integer userId;
    private String address;
    private Boolean isDefault;
    private Boolean notify;
    private Instant createdOn;
    private Instant updatedOn;

    public EmailAddressDTO() {}

    public EmailAddressDTO(Integer id, Integer userId, String address, Boolean isDefault, Boolean notify, Instant createdOn, Instant updatedOn) {
        this.id = id;
        this.userId = userId;
        this.address = address;
        this.isDefault = isDefault;
        this.notify = notify;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Boolean getNotify() {
		return notify;
	}

	public void setNotify(Boolean notify) {
		this.notify = notify;
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
