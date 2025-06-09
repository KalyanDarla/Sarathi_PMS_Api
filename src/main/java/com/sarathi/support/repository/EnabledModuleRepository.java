package com.sarathi.support.repository;

import com.sarathi.support.entity.EnabledModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnabledModuleRepository extends JpaRepository<EnabledModule, Integer> {
}
