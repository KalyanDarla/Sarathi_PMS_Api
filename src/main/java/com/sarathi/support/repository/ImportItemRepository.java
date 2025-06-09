package com.sarathi.support.repository;

import com.sarathi.support.entity.ImportItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImportItemRepository extends JpaRepository<ImportItem, Integer> {
}
