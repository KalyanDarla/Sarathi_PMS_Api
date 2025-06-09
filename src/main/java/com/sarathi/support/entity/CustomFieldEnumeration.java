package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "custom_field_enumerations", schema = "public")
public class CustomFieldEnumeration {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "custom_field_id", nullable = false)
    private Integer customFieldId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "\"position\"", nullable = false)
    private Integer position;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(Integer customFieldId) {
        this.customFieldId = customFieldId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

}