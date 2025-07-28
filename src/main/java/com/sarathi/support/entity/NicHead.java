package com.sarathi.support.entity;
import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "nic_heads")
public class NicHead {

    @Id
    private Long id;

    private String name;

    private String designation;

    private LocalTime createdon;

    private LocalTime createdtime;

    private String updatedon;

    private LocalTime updatedtime;

	public NicHead() {
		super();
	}

	public NicHead(Long id, String name, String designation, LocalTime createdon, LocalTime createdtime,
			String updatedon, LocalTime updatedtime) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.createdon = createdon;
		this.createdtime = createdtime;
		this.updatedon = updatedon;
		this.updatedtime = updatedtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalTime getCreatedon() {
		return createdon;
	}

	public void setCreatedon(LocalTime createdon) {
		this.createdon = createdon;
	}

	public LocalTime getCreatedtime() {
		return createdtime;
	}

	public void setCreatedtime(LocalTime createdtime) {
		this.createdtime = createdtime;
	}

	public String getUpdatedon() {
		return updatedon;
	}

	public void setUpdatedon(String updatedon) {
		this.updatedon = updatedon;
	}

	public LocalTime getUpdatedtime() {
		return updatedtime;
	}

	public void setUpdatedtime(LocalTime updatedtime) {
		this.updatedtime = updatedtime;
	}

 }
