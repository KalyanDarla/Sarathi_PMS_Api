package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles_managed_roles", schema = "public", indexes = {
        @Index(name = "index_roles_managed_roles_on_role_id_and_managed_role_id", columnList = "role_id, managed_role_id", unique = true)
})
public class RolesManagedRole {
    @Column(name = "role_id", nullable = false)
    private Integer roleId;
    @Id
    @Column(name = "managed_role_id", nullable = false)
    private Integer managedRoleId;

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