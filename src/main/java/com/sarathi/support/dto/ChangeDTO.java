package com.sarathi.support.dto;

public class ChangeDTO {
    private Integer id;
    private Integer changesetId;
    private String action;
    private String path;
    private String fromPath;
    private String fromRevision;
    private String revision;
    private String branch;

    public ChangeDTO() {}

    public ChangeDTO(Integer id, Integer changesetId, String action, String path, String fromPath, String fromRevision, String revision, String branch) {
        this.id = id;
        this.changesetId = changesetId;
        this.action = action;
        this.path = path;
        this.fromPath = fromPath;
        this.fromRevision = fromRevision;
        this.revision = revision;
        this.branch = branch;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getChangesetId() {
		return changesetId;
	}

	public void setChangesetId(Integer changesetId) {
		this.changesetId = changesetId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getFromPath() {
		return fromPath;
	}

	public void setFromPath(String fromPath) {
		this.fromPath = fromPath;
	}

	public String getFromRevision() {
		return fromRevision;
	}

	public void setFromRevision(String fromRevision) {
		this.fromRevision = fromRevision;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
    
    

 }
