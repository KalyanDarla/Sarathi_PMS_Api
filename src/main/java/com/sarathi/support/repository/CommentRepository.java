package com.sarathi.support.repository;

import com.sarathi.support.entity.Comment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
	
	List<Comment> findBycommentedId(Integer commentId);
	
	@Query("SELECT MAX(i.id) FROM Comment i")
    Integer findMaxId();
}
