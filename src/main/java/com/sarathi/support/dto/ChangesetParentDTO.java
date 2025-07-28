package com.sarathi.support.dto;

public class ChangesetParentDTO {
    private Integer changesetId;
    private Integer parentId;

    public ChangesetParentDTO() {}

    public ChangesetParentDTO(Integer changesetId, Integer parentId) {
        this.changesetId = changesetId;
        this.parentId = parentId;
    }

	public Integer getChangesetId() {
		return changesetId;
	}

	public void setChangesetId(Integer changesetId) {
		this.changesetId = changesetId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

 }
