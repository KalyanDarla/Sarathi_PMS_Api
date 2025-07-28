package com.sarathi.support.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarathi.support.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
 }

