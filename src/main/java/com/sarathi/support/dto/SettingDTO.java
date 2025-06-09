package com.sarathi.support.dto;

import java.time.Instant;

public class SettingDTO {
    private Integer id;
    private String name;
    private String value;
    private Instant updatedOn;

    public SettingDTO() {}

    public SettingDTO(Integer id, String name, String value, Instant updatedOn) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.updatedOn = updatedOn;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Instant getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Instant updatedOn) {
		this.updatedOn = updatedOn;
	}

 }

