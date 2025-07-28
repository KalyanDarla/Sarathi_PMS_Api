package com.sarathi.support.entity;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "state_master")
public class StateMaster {

    @Id
    @Column(name = "id")
    private Short id; // `int2` maps to Java `Short`

    @Column(name = "name", length = 128)
    private String name;

    @Column(name = "description", length = 64)
    private String description;

    @Column(name = "createdon")
    private LocalTime createdOn;

    @Column(name = "updatedon")
    private LocalTime updatedOn;

    @Column(name = "created_by", length = 128)
    private String createdBy;

    @Column(name = "updated_by", length = 128)
    private String updatedBy;

	 

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

	public LocalTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalTime createdOn) {
		this.createdOn = createdOn;
	}

	public LocalTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

    
}

