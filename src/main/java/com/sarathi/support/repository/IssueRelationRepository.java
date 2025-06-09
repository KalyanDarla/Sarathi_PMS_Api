package com.sarathi.support.repository;

import com.sarathi.support.entity.IssueRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRelationRepository extends JpaRepository<IssueRelation, Integer> {
}

