package com.sarathi.support.dto;

public class IssueStatusDTO {
    private Integer id;
    private String name;
    private Boolean isClosed;
    private Integer position;
    private Integer defaultDoneRatio;

    public IssueStatusDTO() {}

    public IssueStatusDTO(Integer id, String name, Boolean isClosed, Integer position, Integer defaultDoneRatio) {
        this.id = id;
        this.name = name;
        this.isClosed = isClosed;
        this.position = position;
        this.defaultDoneRatio = defaultDoneRatio;
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

	public Boolean getIsClosed() {
		return isClosed;
	}

	public void setIsClosed(Boolean isClosed) {
		this.isClosed = isClosed;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Integer getDefaultDoneRatio() {
		return defaultDoneRatio;
	}

	public void setDefaultDoneRatio(Integer defaultDoneRatio) {
		this.defaultDoneRatio = defaultDoneRatio;
	}

 }
