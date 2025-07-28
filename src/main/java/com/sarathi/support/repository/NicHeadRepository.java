package com.sarathi.support.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sarathi.support.entity.NicHead;

public interface NicHeadRepository extends JpaRepository<NicHead, Long> {
	@Query("SELECT MAX(i.id) FROM NicHead i")
    Integer findMaxId();
}

