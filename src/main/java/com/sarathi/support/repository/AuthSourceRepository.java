package com.sarathi.support.repository;

import com.sarathi.support.entity.AuthSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthSourceRepository extends JpaRepository<AuthSource, Integer> {
}
