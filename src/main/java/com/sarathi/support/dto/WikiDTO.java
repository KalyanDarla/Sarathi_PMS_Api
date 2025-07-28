package com.sarathi.support.dto;

public class WikiDTO {
    private Integer id;
    private Integer projectId;
    private String startPage;
    private Integer status;

    public WikiDTO() {}

    public WikiDTO(Integer id, Integer projectId, String startPage, Integer status) {
        this.id = id;
        this.projectId = projectId;
        this.startPage = startPage;
        this.status = status;
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

	public String getStartPage() {
		return startPage;
	}

	public void setStartPage(String startPage) {
		this.startPage = startPage;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

 }
