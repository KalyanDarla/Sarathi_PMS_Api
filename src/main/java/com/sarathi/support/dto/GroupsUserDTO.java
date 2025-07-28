package com.sarathi.support.dto;

public class GroupsUserDTO {
    private Integer groupId;
    private Integer userId;

    public GroupsUserDTO() {}

    public GroupsUserDTO(Integer groupId, Integer userId) {
        this.groupId = groupId;
        this.userId = userId;
    }

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

 }
