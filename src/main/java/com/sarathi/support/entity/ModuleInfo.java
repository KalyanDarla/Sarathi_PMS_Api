package com.sarathi.support.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "module_info")
public class ModuleInfo {

    @Id
    private Short id; // int2 maps to Java Short

    @Column(name = "name")
    private String name;

    @Column(length = 1024)
    private String description;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "createdon")
    private LocalTime createdOn;

    @Column(name = "updatedby")
    private String updatedBy;

    @Column(name = "updatedon")
    private LocalTime updatedOn;

    // Getters and Setters
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalTime updatedOn) {
        this.updatedOn = updatedOn;
    }
}
