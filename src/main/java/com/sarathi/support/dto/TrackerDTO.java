package com.sarathi.support.dto;

public class TrackerDTO {
    private Integer id;
    private String name;
    private Boolean isInChlog;
    private Integer position;
    private Boolean isInRoadmap;
    private Integer fieldsBits;
    private Integer defaultStatusId;

    public TrackerDTO() {}

    public TrackerDTO(Integer id, String name, Boolean isInChlog, Integer position, Boolean isInRoadmap,
                      Integer fieldsBits, Integer defaultStatusId) {
        this.id = id;
        this.name = name;
        this.isInChlog = isInChlog;
        this.position = position;
        this.isInRoadmap = isInRoadmap;
        this.fieldsBits = fieldsBits;
        this.defaultStatusId = defaultStatusId;
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

	public Boolean getIsInChlog() {
		return isInChlog;
	}

	public void setIsInChlog(Boolean isInChlog) {
		this.isInChlog = isInChlog;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Boolean getIsInRoadmap() {
		return isInRoadmap;
	}

	public void setIsInRoadmap(Boolean isInRoadmap) {
		this.isInRoadmap = isInRoadmap;
	}

	public Integer getFieldsBits() {
		return fieldsBits;
	}

	public void setFieldsBits(Integer fieldsBits) {
		this.fieldsBits = fieldsBits;
	}

	public Integer getDefaultStatusId() {
		return defaultStatusId;
	}

	public void setDefaultStatusId(Integer defaultStatusId) {
		this.defaultStatusId = defaultStatusId;
	}

 }

