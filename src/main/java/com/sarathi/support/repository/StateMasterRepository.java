package com.sarathi.support.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sarathi.support.entity.StateMaster;

public interface StateMasterRepository extends JpaRepository<StateMaster, Short> {
    // Additional query methods if needed
	@Query("SELECT MAX(i.id) FROM StateMaster i")
    Integer findMaxId();
}
