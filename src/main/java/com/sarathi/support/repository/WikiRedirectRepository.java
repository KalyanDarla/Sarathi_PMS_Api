package com.sarathi.support.repository;

import com.sarathi.support.entity.WikiRedirect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikiRedirectRepository extends JpaRepository<WikiRedirect, Integer> {
}

