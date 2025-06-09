package com.sarathi.support.dto;

public class CustomFieldsTrackerDTO {
    private Integer customFieldId;
    private Integer trackerId;

    public CustomFieldsTrackerDTO() {}

    public CustomFieldsTrackerDTO(Integer customFieldId, Integer trackerId) {
        this.customFieldId = customFieldId;
        this.trackerId = trackerId;
    }

	public Integer getCustomFieldId() {
		return customFieldId;
	}

	public void setCustomFieldId(Integer customFieldId) {
		this.customFieldId = customFieldId;
	}

	public Integer getTrackerId() {
		return trackerId;
	}

	public void setTrackerId(Integer trackerId) {
		this.trackerId = trackerId;
	}

 }
