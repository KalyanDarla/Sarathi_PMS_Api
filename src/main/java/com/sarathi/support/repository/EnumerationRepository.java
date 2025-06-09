package com.sarathi.support.repository;

import com.sarathi.support.entity.Enumeration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnumerationRepository extends JpaRepository<Enumeration, Integer> {
}
