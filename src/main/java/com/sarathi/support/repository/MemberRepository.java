package com.sarathi.support.repository;

import com.sarathi.support.entity.Member;
import com.sarathi.support.entity.User;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface MemberRepository extends JpaRepository<Member, Integer> {
	
	/* @Query("SELECT u FROM User u JOIN Member m ON u.id = m.userId WHERE m.projectId = :projectId")
	    List<User> findByprojectId(@Param("projectId") Integer projectId);
	 */
	 
	 @Query(
			  value = "SELECT u.* FROM users u JOIN members m ON u.id = m.user_id WHERE m.project_id = :projectId",
			  nativeQuery = true
			)
			List<User> findByprojectId(@Param("projectId") Integer projectId);

}

