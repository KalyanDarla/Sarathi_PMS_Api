package com.sarathi.support.dto;

public class ChangesetsIssueDTO {
    private Integer changesetId;
    private Integer issueId;

    public ChangesetsIssueDTO() {}

    public ChangesetsIssueDTO(Integer changesetId, Integer issueId) {
        this.changesetId = changesetId;
        this.issueId = issueId;
    }

	public Integer getChangesetId() {
		return changesetId;
	}

	public void setChangesetId(Integer changesetId) {
		this.changesetId = changesetId;
	}

	public Integer getIssueId() {
		return issueId;
	}

	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
	}

    
 }
