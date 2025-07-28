 package com.sarathi.support.entity;

import jakarta.persistence.*;

 @Entity
@Table(name = "custom_fields_projects", schema = "public", indexes = {
        @Index(name = "index_custom_fields_projects_on_custom_field_id_and_project_id", columnList = "custom_field_id, project_id", unique = true)
})
public class CustomFieldsProject {
     @Id
    @Column(name = "custom_field_id", nullable = false)
    private Integer customFieldId;

    @Column(name = "project_id", nullable = false)
    private Integer projectId;

    public Integer getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(Integer customFieldId) {
        this.customFieldId = customFieldId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

}