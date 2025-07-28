package com.sarathi.support.dto;

public class CustomFieldsRoleDTO {
    private Integer customFieldId;
    private Integer roleId;

    public CustomFieldsRoleDTO() {}

    public CustomFieldsRoleDTO(Integer customFieldId, Integer roleId) {
        this.customFieldId = customFieldId;
        this.roleId = roleId;
    }

	public Integer getCustomFieldId() {
		return customFieldId;
	}

	public void setCustomFieldId(Integer customFieldId) {
		this.customFieldId = customFieldId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

 }
