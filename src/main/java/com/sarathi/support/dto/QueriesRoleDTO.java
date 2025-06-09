package com.sarathi.support.dto;

public class QueriesRoleDTO {
    private Integer queryId;
    private Integer roleId;

    public QueriesRoleDTO() {}

    public QueriesRoleDTO(Integer queryId, Integer roleId) {
        this.queryId = queryId;
        this.roleId = roleId;
    }

	public Integer getQueryId() {
		return queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

 }
