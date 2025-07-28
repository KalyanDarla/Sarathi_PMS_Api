package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

	@Id
	private Long id;

	@Column(name = "category_name", nullable = false, unique = true)
	private String categoryName;

	// Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
