package com.sarathi.support.dto;

public class RolesManagedRoleDTO {
    private Integer roleId;
    private Integer managedRoleId;

    public RolesManagedRoleDTO() {}

    public RolesManagedRoleDTO(Integer roleId, Integer managedRoleId) {
        this.roleId = roleId;
        this.managedRoleId = managedRoleId;
    }

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getManagedRoleId() {
		return managedRoleId;
	}

	public void setManagedRoleId(Integer managedRoleId) {
		this.managedRoleId = managedRoleId;
	}

 }
