package com.sarathi.support.dto;

public class SchemaMigrationDTO {
    private String version;

    public SchemaMigrationDTO() {}

    public SchemaMigrationDTO(String version) {
        this.version = version;
    }

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

 }
