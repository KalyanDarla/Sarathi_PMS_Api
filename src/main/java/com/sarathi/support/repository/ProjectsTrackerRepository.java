package com.sarathi.support.repository;

import com.sarathi.support.entity.ProjectsTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsTrackerRepository extends JpaRepository<ProjectsTracker, Integer> {
}

