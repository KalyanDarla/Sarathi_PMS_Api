package com.sarathi.support.repository;

import com.sarathi.support.entity.Changeset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChangesetRepository extends JpaRepository<Changeset, Integer> {
}
