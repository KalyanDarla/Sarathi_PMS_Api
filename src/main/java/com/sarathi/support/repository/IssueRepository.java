package com.sarathi.support.repository;

import com.sarathi.support.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IssueRepository extends JpaRepository<Issue, Integer> {
}

