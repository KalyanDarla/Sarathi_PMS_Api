package com.sarathi.support.dto;

import java.time.Instant;

public class ArInternalMetadatumDTO {
	private String key;
	private String value;
	private Instant createdAt;
	private Instant updatedAt;

	public ArInternalMetadatumDTO() {
	}

	public ArInternalMetadatumDTO(String key, String value, Instant createdAt, Instant updatedAt) {
		this.key = key;
		this.value = value;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}
}
