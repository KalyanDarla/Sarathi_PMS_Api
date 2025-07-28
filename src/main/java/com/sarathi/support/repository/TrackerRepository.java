package com.sarathi.support.repository;

import com.sarathi.support.entity.Tracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackerRepository extends JpaRepository<Tracker, Integer> {
}
