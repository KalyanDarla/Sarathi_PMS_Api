package com.sarathi.support.repository;

import com.sarathi.support.entity.Wiki;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikiRepository extends JpaRepository<Wiki, Integer> {
}

