package com.sarathi.support.repository;

import com.sarathi.support.entity.WikiPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikiPageRepository extends JpaRepository<WikiPage, Integer> {
}
