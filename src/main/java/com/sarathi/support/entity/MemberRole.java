package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "member_roles", schema = "public", indexes = {
        @Index(name = "index_member_roles_on_member_id", columnList = "member_id"),
        @Index(name = "index_member_roles_on_role_id", columnList = "role_id"),
        @Index(name = "index_member_roles_on_inherited_from", columnList = "inherited_from")
})
public class MemberRole {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "member_id", nullable = false)
    private Integer memberId;

    @Column(name = "role_id", nullable = false)
    private Integer roleId;

    @Column(name = "inherited_from")
    private Integer inheritedFrom;

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