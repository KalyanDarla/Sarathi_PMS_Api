package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "changesets_issues", schema = "public", indexes = {
        @Index(name = "changesets_issues_ids", columnList = "changeset_id, issue_id", unique = true),
        @Index(name = "index_changesets_issues_on_issue_id", columnList = "issue_id")
})
public class ChangesetsIssue {
    @Id
    @Column(name = "changeset_id", nullable = false)
    private Integer changesetId;

    @Column(name = "issue_id", nullable = false)
    private Integer issueId;

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