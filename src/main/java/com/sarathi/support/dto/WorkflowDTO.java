package com.sarathi.support.dto;

public class WorkflowDTO {
    private Integer id;
    private Integer trackerId;
    private Integer oldStatusId;
    private Integer newStatusId;
    private Integer roleId;
    private Boolean assignee;
    private Boolean author;
    private String type;
    private String fieldName;
    private String rule;

    public WorkflowDTO() {}

    public WorkflowDTO(Integer id, Integer trackerId, Integer oldStatusId, Integer newStatusId, Integer roleId, Boolean assignee,
                       Boolean author, String type, String fieldName, String rule) {
        this.id = id;
        this.trackerId = trackerId;
        this.oldStatusId = oldStatusId;
        this.newStatusId = newStatusId;
        this.roleId = roleId;
        this.assignee = assignee;
        this.author = author;
        this.type = type;
        this.fieldName = fieldName;
        this.rule = rule;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTrackerId() {
		return trackerId;
	}

	public void setTrackerId(Integer trackerId) {
		this.trackerId = trackerId;
	}

	public Integer getOldStatusId() {
		return oldStatusId;
	}

	public void setOldStatusId(Integer oldStatusId) {
		this.oldStatusId = oldStatusId;
	}

	public Integer getNewStatusId() {
		return newStatusId;
	}

	public void setNewStatusId(Integer newStatusId) {
		this.newStatusId = newStatusId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Boolean getAssignee() {
		return assignee;
	}

	public void setAssignee(Boolean assignee) {
		this.assignee = assignee;
	}

	public Boolean getAuthor() {
		return author;
	}

	public void setAuthor(Boolean author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

 }
