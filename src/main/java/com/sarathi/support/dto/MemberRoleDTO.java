package com.sarathi.support.dto;

public class MemberRoleDTO {
    private Integer id;
    private Integer memberId;
    private Integer roleId;
    private Integer inheritedFrom;

    public MemberRoleDTO() {}

    public MemberRoleDTO(Integer id, Integer memberId, Integer roleId, Integer inheritedFrom) {
        this.id = id;
        this.memberId = memberId;
        this.roleId = roleId;
        this.inheritedFrom = inheritedFrom;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getInheritedFrom() {
		return inheritedFrom;
	}

	public void setInheritedFrom(Integer inheritedFrom) {
		this.inheritedFrom = inheritedFrom;
	}

 }

