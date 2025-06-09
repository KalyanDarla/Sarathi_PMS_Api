package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "custom_values", schema = "public", indexes = {
        @Index(name = "custom_values_customized", columnList = "customized_type, customized_id"),
        @Index(name = "index_custom_values_on_custom_field_id", columnList = "custom_field_id")
})
public class CustomValue {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "customized_type", nullable = false, length = 30)
    private String customizedType;

    @Column(name = "customized_id", nullable = false)
    private Integer customizedId;

    @Column(name = "custom_field_id", nullable = false)
    private Integer customFieldId;

    @Column(name = "value")
    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomizedType() {
        return customizedType;
    }

    public void setCustomizedType(String customizedType) {
        this.customizedType = customizedType;
    }

    public Integer getCustomizedId() {
        return customizedId;
    }

    public void setCustomizedId(Integer customizedId) {
        this.customizedId = customizedId;
    }

    public Integer getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(Integer customFieldId) {
        this.customFieldId = customFieldId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}