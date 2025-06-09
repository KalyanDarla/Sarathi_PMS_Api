package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "groups_users", schema = "public", indexes = {
        @Index(name = "groups_users_ids", columnList = "group_id, user_id", unique = true)
})
public class GroupsUser {
    @Id
    @Column(name = "group_id", nullable = false)
    private Integer groupId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

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