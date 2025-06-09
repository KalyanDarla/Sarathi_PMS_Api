package com.sarathi.support.dto;

public class CustomValueDTO {
    private Integer id;
    private String customizedType;
    private Integer customizedId;
    private Integer customFieldId;
    private String value;

    public CustomValueDTO() {}

    public CustomValueDTO(Integer id, String customizedType, Integer customizedId, Integer customFieldId, String value) {
        this.id = id;
        this.customizedType = customizedType;
        this.customizedId = customizedId;
        this.customFieldId = customFieldId;
        this.value = value;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomizedType() {
		return customizedType;
	}

	public void setCustomizedType(String customizedType) {
		this.customizedType = customizedType;
	}

	public Integer getCustomizedId() {
		return customizedId;
	}

	public void setCustomizedId(Integer customizedId) {
		this.customizedId = customizedId;
	}

	public Integer getCustomFieldId() {
		return customFieldId;
	}

	public void setCustomFieldId(Integer customFieldId) {
		this.customFieldId = customFieldId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

 }
