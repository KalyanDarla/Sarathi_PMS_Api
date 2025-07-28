package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "queries_roles", schema = "public", indexes = {
        @Index(name = "queries_roles_ids", columnList = "query_id, role_id", unique = true)
})
public class QueriesRole {
    @Id
    @Column(name = "query_id", nullable = false)
    private Integer queryId;

    @Column(name = "role_id", nullable = false)
    private Integer roleId;

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