package com.sarathi.support.repository;

import com.sarathi.support.entity.UsersTmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersTmpRepository extends JpaRepository<UsersTmp, Integer> {
}

