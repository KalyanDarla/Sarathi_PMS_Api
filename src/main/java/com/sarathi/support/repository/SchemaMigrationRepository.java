package com.sarathi.support.repository;

import com.sarathi.support.entity.SchemaMigration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchemaMigrationRepository extends JpaRepository<SchemaMigration, String> {
}

