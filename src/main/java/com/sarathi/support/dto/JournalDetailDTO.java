package com.sarathi.support.dto;

public class JournalDetailDTO {
    private Integer id;
    private Integer journalId;
    private String property;
    private String propKey;
    private String oldValue;
    private String value;

    public JournalDetailDTO() {}

    public JournalDetailDTO(Integer id, Integer journalId, String property, String propKey, String oldValue, String value) {
        this.id = id;
        this.journalId = journalId;
        this.property = property;
        this.propKey = propKey;
        this.oldValue = oldValue;
        this.value = value;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getJournalId() {
		return journalId;
	}

	public void setJournalId(Integer journalId) {
		this.journalId = journalId;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getPropKey() {
		return propKey;
	}

	public void setPropKey(String propKey) {
		this.propKey = propKey;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

 }

