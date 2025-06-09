package com.sarathi.support.repository;

import com.sarathi.support.entity.RolesManagedRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesManagedRoleRepository extends JpaRepository<RolesManagedRole, Integer> {
}
