package com.sarathi.support.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sarathi.support.entity.Workflow;

@Repository
public interface WorkflowRepository extends JpaRepository<Workflow, Integer> {

	@Query(value = """
			    SELECT w.new_status_id
			    FROM member_roles mr
			    JOIN members m ON mr.member_id = m.id
			    JOIN workflows w ON mr.role_id = w.role_id
			    WHERE m.project_id = :projectId
			      AND m.user_id = :userId
			      AND w.old_status_id = :oldStatusId
			      AND w.tracker_id = :trackerId
			""", nativeQuery = true)
	List<Integer> findNewStatusIds(@Param("projectId") Long projectId, @Param("userId") Long userId,
			@Param("oldStatusId") Integer oldStatusId, @Param("trackerId") Integer trackerId);

}
