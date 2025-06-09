package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "changes", schema = "public", indexes = {
        @Index(name = "changesets_changeset_id", columnList = "changeset_id")
})
public class Change {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "changeset_id", nullable = false)
    private Integer changesetId;

    @Column(name = "action", nullable = false, length = 1)
    private String action;

    @Column(name = "path", nullable = false)
    private String path;

    @Column(name = "from_path")
    private String fromPath;

    @Column(name = "from_revision")
    private String fromRevision;

    @Column(name = "revision")
    private String revision;

    @Column(name = "branch")
    private String branch;

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