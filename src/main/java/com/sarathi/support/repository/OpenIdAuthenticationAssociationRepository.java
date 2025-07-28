package com.sarathi.support.repository;

import com.sarathi.support.entity.OpenIdAuthenticationAssociation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenIdAuthenticationAssociationRepository extends JpaRepository<OpenIdAuthenticationAssociation, Integer> {
}

