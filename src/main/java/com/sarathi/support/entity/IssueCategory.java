package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "issue_categories", schema = "public", indexes = {
        @Index(name = "issue_categories_project_id", columnList = "project_id"),
        @Index(name = "index_issue_categories_on_assigned_to_id", columnList = "assigned_to_id")
})
public class IssueCategory {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "project_id", nullable = false)
    private Integer projectId;

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @Column(name = "assigned_to_id")
    private Integer assignedToId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAssignedToId() {
        return assignedToId;
    }

    public void setAssignedToId(Integer assignedToId) {
        this.assignedToId = assignedToId;
    }

}