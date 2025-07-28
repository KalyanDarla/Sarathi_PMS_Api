package com.sarathi.support.dto;

public class IssueRelationDTO {
    private Integer id;
    private Integer issueFromId;
    private Integer issueToId;
    private String relationType;
    private Integer delay;

    public IssueRelationDTO() {}

    public IssueRelationDTO(Integer id, Integer issueFromId, Integer issueToId, String relationType, Integer delay) {
        this.id = id;
        this.issueFromId = issueFromId;
        this.issueToId = issueToId;
        this.relationType = relationType;
        this.delay = delay;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIssueFromId() {
		return issueFromId;
	}

	public void setIssueFromId(Integer issueFromId) {
		this.issueFromId = issueFromId;
	}

	public Integer getIssueToId() {
		return issueToId;
	}

	public void setIssueToId(Integer issueToId) {
		this.issueToId = issueToId;
	}

	public String getRelationType() {
		return relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public Integer getDelay() {
		return delay;
	}

	public void setDelay(Integer delay) {
		this.delay = delay;
	}

 }

