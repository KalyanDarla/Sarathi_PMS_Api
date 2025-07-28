package com.sarathi.support.dto;

public class ProjectsTrackerDTO {
    private Integer projectId;
    private Integer trackerId;

    public ProjectsTrackerDTO() {}

    public ProjectsTrackerDTO(Integer projectId, Integer trackerId) {
        this.projectId = projectId;
        this.trackerId = trackerId;
    }

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getTrackerId() {
		return trackerId;
	}

	public void setTrackerId(Integer trackerId) {
		this.trackerId = trackerId;
	}

 }
