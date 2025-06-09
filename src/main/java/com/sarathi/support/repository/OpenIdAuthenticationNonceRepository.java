package com.sarathi.support.repository;

import com.sarathi.support.entity.OpenIdAuthenticationNonce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenIdAuthenticationNonceRepository extends JpaRepository<OpenIdAuthenticationNonce, Integer> {
}

