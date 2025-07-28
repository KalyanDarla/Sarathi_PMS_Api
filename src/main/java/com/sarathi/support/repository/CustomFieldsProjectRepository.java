package com.sarathi.support.repository;

import com.sarathi.support.entity.CustomFieldsProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomFieldsProjectRepository extends JpaRepository<CustomFieldsProject, Integer> {
}
