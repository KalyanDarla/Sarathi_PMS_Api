package com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "projects", schema = "public", indexes = {
        @Index(name = "index_projects_on_lft", columnList = "lft"),
        @Index(name = "index_projects_on_rgt", columnList = "rgt")
})
public class Project {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "homepage")
    private String homepage;

    @Column(name = "is_public", nullable = false)
    private Boolean isPublic = false;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "created_on")
    private Instant createdOn;

    @Column(name = "updated_on")
    private Instant updatedOn;

    @Column(name = "identifier")
    private String identifier;

    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "lft")
    private Integer lft;

    @Column(name = "rgt")
    private Integer rgt;

    @Column(name = "inherit_members", nullable = false)
    private Boolean inheritMembers = false;

    @Column(name = "default_version_id")
    private Integer defaultVersionId;

    @Column(name = "default_assigned_to_id")
    private Integer defaultAssignedToId;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public Instant getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Instant updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLft() {
        return lft;
    }

    public void setLft(Integer lft) {
        this.lft = lft;
    }

    public Integer getRgt() {
        return rgt;
    }

    public void setRgt(Integer rgt) {
        this.rgt = rgt;
    }

    public Boolean getInheritMembers() {
        return inheritMembers;
    }

    public void setInheritMembers(Boolean inheritMembers) {
        this.inheritMembers = inheritMembers;
    }

    public Integer getDefaultVersionId() {
        return defaultVersionId;
    }

    public void setDefaultVersionId(Integer defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }

    public Integer getDefaultAssignedToId() {
        return defaultAssignedToId;
    }

    public void setDefaultAssignedToId(Integer defaultAssignedToId) {
        this.defaultAssignedToId = defaultAssignedToId;
    }

}