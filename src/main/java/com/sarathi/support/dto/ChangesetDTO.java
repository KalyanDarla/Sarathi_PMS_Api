package com.sarathi.support.dto;

import java.time.Instant;
import java.time.LocalDate;

public class ChangesetDTO {
    private Integer id;
    private Integer repositoryId;
    private String revision;
    private String committer;
    private Instant committedOn;
    private String comments;
    private LocalDate commitDate;
    private String scmid;
    private Integer userId;

    public ChangesetDTO() {}

    public ChangesetDTO(Integer id, Integer repositoryId, String revision, String committer, Instant committedOn, String comments, LocalDate commitDate, String scmid, Integer userId) {
        this.id = id;
        this.repositoryId = repositoryId;
        this.revision = revision;
        this.committer = committer;
        this.committedOn = committedOn;
        this.comments = comments;
        this.commitDate = commitDate;
        this.scmid = scmid;
        this.userId = userId;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRepositoryId() {
		return repositoryId;
	}

	public void setRepositoryId(Integer repositoryId) {
		this.repositoryId = repositoryId;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getCommitter() {
		return committer;
	}

	public void setCommitter(String committer) {
		this.committer = committer;
	}

	public Instant getCommittedOn() {
		return committedOn;
	}

	public void setCommittedOn(Instant committedOn) {
		this.committedOn = committedOn;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public LocalDate getCommitDate() {
		return commitDate;
	}

	public void setCommitDate(LocalDate commitDate) {
		this.commitDate = commitDate;
	}

	public String getScmid() {
		return scmid;
	}

	public void setScmid(String scmid) {
		this.scmid = scmid;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
    
    

 }
