package com.sarathi.support.dto;

public class RoleDTO {
    private Integer id;
    private String name;
    private Integer position;
    private Boolean assignable;
    private Integer builtin;
    private String permissions;
    private String issuesVisibility;
    private String usersVisibility;
    private String timeEntriesVisibility;
    private Boolean allRolesManaged;
    private String settings;

    public RoleDTO() {}

    public RoleDTO(Integer id, String name, Integer position, Boolean assignable, Integer builtin, String permissions,
                   String issuesVisibility, String usersVisibility, String timeEntriesVisibility, Boolean allRolesManaged, String settings) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.assignable = assignable;
        this.builtin = builtin;
        this.permissions = permissions;
        this.issuesVisibility = issuesVisibility;
        this.usersVisibility = usersVisibility;
        this.timeEntriesVisibility = timeEntriesVisibility;
        this.allRolesManaged = allRolesManaged;
        this.settings = settings;
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

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Boolean getAssignable() {
		return assignable;
	}

	public void setAssignable(Boolean assignable) {
		this.assignable = assignable;
	}

	public Integer getBuiltin() {
		return builtin;
	}

	public void setBuiltin(Integer builtin) {
		this.builtin = builtin;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	public String getIssuesVisibility() {
		return issuesVisibility;
	}

	public void setIssuesVisibility(String issuesVisibility) {
		this.issuesVisibility = issuesVisibility;
	}

	public String getUsersVisibility() {
		return usersVisibility;
	}

	public void setUsersVisibility(String usersVisibility) {
		this.usersVisibility = usersVisibility;
	}

	public String getTimeEntriesVisibility() {
		return timeEntriesVisibility;
	}

	public void setTimeEntriesVisibility(String timeEntriesVisibility) {
		this.timeEntriesVisibility = timeEntriesVisibility;
	}

	public Boolean getAllRolesManaged() {
		return allRolesManaged;
	}

	public void setAllRolesManaged(Boolean allRolesManaged) {
		this.allRolesManaged = allRolesManaged;
	}

	public String getSettings() {
		return settings;
	}

	public void setSettings(String settings) {
		this.settings = settings;
	}

 }
