package com.sarathi.support.repository;

import com.sarathi.support.entity.Member;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface MemberRepository extends JpaRepository<Member, Integer> {
	
	 @Query("SELECT u.firstname||' '|| u.lastname FROM User u JOIN Member m ON u.id = m.userId WHERE m.projectId = :projectId")
	    List<String> findByprojectId(@Param("projectId") Integer projectId);
}

