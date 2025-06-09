package com.sarathi.support.dto;

public class EnabledModuleDTO {
    private Integer id;
    private Integer projectId;
    private String name;

    public EnabledModuleDTO() {}

    public EnabledModuleDTO(Integer id, Integer projectId, String name) {
        this.id = id;
        this.projectId = projectId;
        this.name = name;
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

 }
