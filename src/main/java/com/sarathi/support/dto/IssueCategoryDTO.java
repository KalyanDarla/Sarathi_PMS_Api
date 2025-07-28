package com.sarathi.support.dto;

public class IssueCategoryDTO {
    private Integer id;
    private Integer projectId;
    private String name;
    private Integer assignedToId;

    public IssueCategoryDTO() {}

    public IssueCategoryDTO(Integer id, Integer projectId, String name, Integer assignedToId) {
        this.id = id;
        this.projectId = projectId;
        this.name = name;
        this.assignedToId = assignedToId;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAssignedToId() {
		return assignedToId;
	}

	public void setAssignedToId(Integer assignedToId) {
		this.assignedToId = assignedToId;
	}

 }

