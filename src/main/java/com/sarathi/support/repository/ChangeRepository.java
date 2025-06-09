package com.sarathi.support.repository;

import com.sarathi.support.entity.Change;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChangeRepository extends JpaRepository<Change, Integer> {
}
