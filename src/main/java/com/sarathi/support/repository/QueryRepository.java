package com.sarathi.support.repository;

import com.sarathi.support.entity.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryRepository extends JpaRepository<Query, Integer> {
}

