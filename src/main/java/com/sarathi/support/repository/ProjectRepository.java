package com.sarathi.support.repository;

import com.sarathi.support.entity.Project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    List<Project> findByDefaultAssignedToId(Integer userId);

}

