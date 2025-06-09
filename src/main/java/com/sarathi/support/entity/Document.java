package com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "documents", schema = "public", indexes = {
        @Index(name = "documents_project_id", columnList = "project_id"),
        @Index(name = "index_documents_on_category_id", columnList = "category_id"),
        @Index(name = "index_documents_on_created_on", columnList = "created_on")
})
public class Document {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "project_id", nullable = false)
    private Integer projectId;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "created_on")
    private Instant createdOn;

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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

}