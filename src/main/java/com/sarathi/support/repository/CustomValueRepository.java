package com.sarathi.support.repository;

import com.sarathi.support.entity.CustomValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomValueRepository extends JpaRepository<CustomValue, Integer> {
}
