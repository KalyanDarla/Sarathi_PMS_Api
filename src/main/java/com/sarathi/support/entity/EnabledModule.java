package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "enabled_modules", schema = "public", indexes = {
        @Index(name = "enabled_modules_project_id", columnList = "project_id")
})
public class EnabledModule {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "name", nullable = false)
    private String name;

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

}