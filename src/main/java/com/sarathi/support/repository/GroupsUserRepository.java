package com.sarathi.support.repository;

import com.sarathi.support.entity.GroupsUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupsUserRepository extends JpaRepository<GroupsUser, Integer> {
}
