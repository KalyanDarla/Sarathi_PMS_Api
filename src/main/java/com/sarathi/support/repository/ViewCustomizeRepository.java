package com.sarathi.support.repository;

import com.sarathi.support.entity.ViewCustomize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewCustomizeRepository extends JpaRepository<ViewCustomize, Integer> {
}
