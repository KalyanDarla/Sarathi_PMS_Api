package com.sarathi.support.repository;

import com.sarathi.support.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByLogin(String username);
    @Query("SELECT u.login FROM User u")
    List<String> findByLogin();
    @Query("SELECT MAX(i.id) FROM User i")
    Integer findMaxId();
	
}

