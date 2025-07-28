package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles", schema = "public")
public class Role {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "\"position\"")
    private Integer position;

    @Column(name = "assignable")
    private Boolean assignable;

    @Column(name = "builtin", nullable = false)
    private Integer builtin;


    @Column(name = "permissions")
    private String permissions;

    @Column(name = "issues_visibility", nullable = false, length = 30)
    private String issuesVisibility;

    @Column(name = "users_visibility", nullable = false, length = 30)
    private String usersVisibility;

    @Column(name = "time_entries_visibility", nullable = false, length = 30)
    private String timeEntriesVisibility;

    @Column(name = "all_roles_managed", nullable = false)
    private Boolean allRolesManaged = false;


    @Column(name = "settings")
    private String settings;

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