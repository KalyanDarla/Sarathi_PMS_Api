package com.sarathi.support.repository;

import com.sarathi.support.entity.CustomFieldsTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomFieldsTrackerRepository extends JpaRepository<CustomFieldsTracker, Integer> {
}
