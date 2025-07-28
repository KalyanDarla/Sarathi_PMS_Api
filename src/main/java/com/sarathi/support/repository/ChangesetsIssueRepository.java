package com.sarathi.support.repository;

import com.sarathi.support.entity.ChangesetsIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChangesetsIssueRepository extends JpaRepository<ChangesetsIssue, Integer> {
}
