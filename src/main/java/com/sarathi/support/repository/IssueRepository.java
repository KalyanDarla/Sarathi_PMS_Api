package com.sarathi.support.repository;

import com.sarathi.support.entity.Issue;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface IssueRepository extends JpaRepository<Issue, Integer> {
	
	@Query("SELECT MAX(i.id) FROM Issue i")
    Integer findMaxId();
	
	List<Issue> findByassignedToId(Integer assignId);
}

