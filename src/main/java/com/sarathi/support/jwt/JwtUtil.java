package com.sarathi.support.jwt;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.*;

@Component
public class JwtUtil {

	private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
	private final long expiration = 1000 * 60 * 60; // 1 hour

	public String generateToken(String username, Integer userId) {
		return Jwts.builder().setSubject(username).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + expiration)).claim("userId", userId).signWith(key)
				.compact();
	}

	public String extractUsername(String token) {
		return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody().getSubject();
	}

	public boolean validateToken(String token) {
		try {
			Jws<Claims> claims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);

			// Explicitly check expiration
			Date expiration = claims.getBody().getExpiration();
			return expiration.after(new Date());
		} catch (ExpiredJwtException e) {
			System.out.println("Token expired at: " + e.getClaims().getExpiration());
		} catch (JwtException | IllegalArgumentException e) {
			System.out.println("Invalid JWT: " + e.getMessage());
		}
		return false;
	}

	public Date extractExpiration(String token) {
		return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody().getExpiration();
	}
}
