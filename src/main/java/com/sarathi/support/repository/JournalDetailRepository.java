package com.sarathi.support.repository;

import com.sarathi.support.entity.JournalDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalDetailRepository extends JpaRepository<JournalDetail, Integer> {
}

