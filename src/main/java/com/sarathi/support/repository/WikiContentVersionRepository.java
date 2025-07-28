package com.sarathi.support.repository;

import com.sarathi.support.entity.WikiContentVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikiContentVersionRepository extends JpaRepository<WikiContentVersion, Integer> {
}
