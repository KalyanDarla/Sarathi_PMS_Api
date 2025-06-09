package com.sarathi.support.dto;

import java.time.Instant;

public class ProjectDTO {
    private Integer id;
    private String name;
    private String description;
    private String homepage;
    private Boolean isPublic;
    private Integer parentId;
    private Instant createdOn;
    private Instant updatedOn;
    private String identifier;
    private Integer status;
    private Integer lft;
    private Integer rgt;
    private Boolean inheritMembers;
    private Integer defaultVersionId;
    private Integer defaultAssignedToId;

    public ProjectDTO() {}

    public ProjectDTO(Integer id, String name, String description, String homepage, Boolean isPublic, Integer parentId,
                      Instant createdOn, Instant updatedOn, String identifier, Integer status, Integer lft, Integer rgt,
                      Boolean inheritMembers, Integer defaultVersionId, Integer defaultAssignedToId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.homepage = homepage;
        this.isPublic = isPublic;
        this.parentId = parentId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.identifier = identifier;
        this.status = status;
        this.lft = lft;
        this.rgt = rgt;
        this.inheritMembers = inheritMembers;
        this.defaultVersionId = defaultVersionId;
        this.defaultAssignedToId = defaultAssignedToId;
    }

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

