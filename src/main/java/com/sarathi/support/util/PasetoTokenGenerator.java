package com.sarathi.support.util;

import java.security.Key;

import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

/**
 * This class is used to generate keys for authentication.
 *  Right now implementation is in jwt we will change to paseto after Demo.
 */

public class PasetoTokenGenerator {

	private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    public String generateToken() {
    	
        return Jwts.builder()
                .setSubject("sai")
                .setIssuer("your-app")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600000)) // 1 hour
                .signWith(key)
                .compact();
    }

}
