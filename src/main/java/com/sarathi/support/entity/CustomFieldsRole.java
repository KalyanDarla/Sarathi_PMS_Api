package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "custom_fields_roles", schema = "public", indexes = {
        @Index(name = "custom_fields_roles_ids", columnList = "custom_field_id, role_id", unique = true)
})
public class CustomFieldsRole {
    @Id
    @Column(name = "custom_field_id", nullable = false)
    private Integer customFieldId;

    @Column(name = "role_id", nullable = false)
    private Integer roleId;

    public Integer getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(Integer customFieldId) {
        this.customFieldId = customFieldId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}