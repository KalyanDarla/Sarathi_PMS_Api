 package com.sarathi.support.repository;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sarathi.support.entity.Repositories;
 
  
@Repository
public interface RepositoriesRepository extends JpaRepository<Repositories, Integer> {
}

