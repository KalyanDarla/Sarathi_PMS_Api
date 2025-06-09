package com.sarathi.support.repository;

import com.sarathi.support.entity.WikiContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikiContentRepository extends JpaRepository<WikiContent, Integer> {
}

