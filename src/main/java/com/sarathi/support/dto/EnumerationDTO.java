package com.sarathi.support.dto;

public class EnumerationDTO {
    private Integer id;
    private String name;
    private Integer position;
    private Boolean isDefault;
    private String type;
    private Boolean active;
    private Integer projectId;
    private Integer parentId;
    private String positionName;

    public EnumerationDTO() {}

    public EnumerationDTO(Integer id, String name, Integer position, Boolean isDefault, String type, Boolean active, Integer projectId, Integer parentId, String positionName) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.isDefault = isDefault;
        this.type = type;
        this.active = active;
        this.projectId = projectId;
        this.parentId = parentId;
        this.positionName = positionName;
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

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

 }
