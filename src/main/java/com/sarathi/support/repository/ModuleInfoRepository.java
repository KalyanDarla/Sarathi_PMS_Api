package com.sarathi.support.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sarathi.support.entity.ModuleInfo;

public interface ModuleInfoRepository extends JpaRepository<ModuleInfo, Short> {
	@Query("SELECT MAX(i.id) FROM ModuleInfo i")
    Integer findMaxId();
}

