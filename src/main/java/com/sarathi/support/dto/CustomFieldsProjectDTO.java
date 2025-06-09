package com.sarathi.support.dto;

public class CustomFieldsProjectDTO {
    private Integer customFieldId;
    private Integer projectId;

    public CustomFieldsProjectDTO() {}

    public CustomFieldsProjectDTO(Integer customFieldId, Integer projectId) {
        this.customFieldId = customFieldId;
        this.projectId = projectId;
    }

	public Integer getCustomFieldId() {
		return customFieldId;
	}

	public void setCustomFieldId(Integer customFieldId) {
		this.customFieldId = customFieldId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

 }
