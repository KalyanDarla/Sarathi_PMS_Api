package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "enumerations", schema = "public", indexes = {
        @Index(name = "index_enumerations_on_id_and_type", columnList = "id, type"),
        @Index(name = "index_enumerations_on_project_id", columnList = "project_id")
})
public class Enumeration {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "\"position\"")
    private Integer position;

    @Column(name = "is_default", nullable = false)
    private Boolean isDefault = false;

    @Column(name = "type")
    private String type;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "position_name", length = 30)
    private String positionName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

}