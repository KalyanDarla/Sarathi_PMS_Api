package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "issue_relations", schema = "public", indexes = {
        @Index(name = "index_issue_relations_on_issue_from_id_and_issue_to_id", columnList = "issue_from_id, issue_to_id", unique = true),
        @Index(name = "index_issue_relations_on_issue_from_id", columnList = "issue_from_id"),
        @Index(name = "index_issue_relations_on_issue_to_id", columnList = "issue_to_id")
})
public class IssueRelation {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "issue_from_id", nullable = false)
    private Integer issueFromId;

    @Column(name = "issue_to_id", nullable = false)
    private Integer issueToId;

    @Column(name = "relation_type", nullable = false)
    private String relationType;

    @Column(name = "delay")
    private Integer delay;

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