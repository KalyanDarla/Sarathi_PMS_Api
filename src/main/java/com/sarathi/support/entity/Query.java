package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "queries", schema = "public", indexes = {
        @Index(name = "index_queries_on_project_id", columnList = "project_id"),
        @Index(name = "index_queries_on_user_id", columnList = "user_id")
})
public class Query {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "filters")
    private String filters;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "column_names")
    private String columnNames;

    @Column(name = "sort_criteria")
    private String sortCriteria;

    @Column(name = "group_by")
    private String groupBy;

    @Column(name = "type")
    private String type;

    @Column(name = "visibility")
    private Integer visibility;

    @Column(name = "options")
    private String options;

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

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String columnNames) {
        this.columnNames = columnNames;
    }

    public String getSortCriteria() {
        return sortCriteria;
    }

    public void setSortCriteria(String sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

}