package com.sarathi.support.repository;

import com.sarathi.support.entity.QueriesRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueriesRoleRepository extends JpaRepository<QueriesRole, Integer> {
}
