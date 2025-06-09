package com.sarathi.support.repository;

import com.sarathi.support.entity.CustomField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomFieldRepository extends JpaRepository<CustomField, Integer> {
}
