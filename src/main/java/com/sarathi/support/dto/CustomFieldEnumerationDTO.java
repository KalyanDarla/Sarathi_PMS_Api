package com.sarathi.support.dto;

public class CustomFieldEnumerationDTO {
    private Integer id;
    private Integer customFieldId;
    private String name;
    private Boolean active;
    private Integer position;

    public CustomFieldEnumerationDTO() {}

    public CustomFieldEnumerationDTO(Integer id, Integer customFieldId, String name, Boolean active, Integer position) {
        this.id = id;
        this.customFieldId = customFieldId;
        this.name = name;
        this.active = active;
        this.position = position;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomFieldId() {
		return customFieldId;
	}

	public void setCustomFieldId(Integer customFieldId) {
		this.customFieldId = customFieldId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

 }
