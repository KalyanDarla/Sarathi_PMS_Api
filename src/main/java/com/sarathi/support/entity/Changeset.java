package com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "changesets", schema = "public", indexes = {
        @Index(name = "changesets_repos_rev", columnList = "repository_id, revision", unique = true),
        @Index(name = "changesets_repos_scmid", columnList = "repository_id, scmid"),
        @Index(name = "index_changesets_on_repository_id", columnList = "repository_id"),
        @Index(name = "index_changesets_on_committed_on", columnList = "committed_on"),
        @Index(name = "index_changesets_on_user_id", columnList = "user_id")
})
public class Changeset {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "repository_id", nullable = false)
    private Integer repositoryId;

    @Column(name = "revision", nullable = false)
    private String revision;

    @Column(name = "committer")
    private String committer;

    @Column(name = "committed_on", nullable = false)
    private Instant committedOn;

    @Column(name = "comments")
    private String comments;

    @Column(name = "commit_date")
    private LocalDate commitDate;

    @Column(name = "scmid")
    private String scmid;

    @Column(name = "user_id")
    private Integer userId;

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