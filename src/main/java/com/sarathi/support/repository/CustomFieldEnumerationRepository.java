package com.sarathi.support.repository;

import com.sarathi.support.entity.CustomFieldEnumeration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomFieldEnumerationRepository extends JpaRepository<CustomFieldEnumeration, Integer> {
}
