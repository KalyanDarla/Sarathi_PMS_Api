package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "changeset_parents", schema = "public", indexes = {
        @Index(name = "changeset_parents_changeset_ids", columnList = "changeset_id"),
        @Index(name = "changeset_parents_parent_ids", columnList = "parent_id")
})
public class ChangesetParent {
    @Id
    @Column(name = "changeset_id", nullable = false)
    private Integer changesetId;

    @Column(name = "parent_id", nullable = false)
    private Integer parentId;

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