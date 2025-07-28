package com.sarathi.support.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarathi.support.dto.AuthSourceDTO;
import com.sarathi.support.dto.LoginRequestDTO;
import com.sarathi.support.dto.UserResponseDto;
import com.sarathi.support.entity.User;
import com.sarathi.support.jwt.JwtUtil;
import com.sarathi.support.repository.UserRepository;
import com.sarathi.support.service.AuthSourceService;
import com.sarathi.support.util.PasetoTokenGenerator;
import org.springframework.security.core.AuthenticationException;

@RestController
@RequestMapping("/auth-sources")
public class AuthSourceController {

	private final AuthSourceService service;

	private final AuthenticationManager authManager;

	private final JwtUtil jwtUtil;
	private final UserRepository userRepo;

	PasetoTokenGenerator PasetoTokenGenerator = new PasetoTokenGenerator();

	public AuthSourceController(AuthSourceService service, AuthenticationManager authManager, JwtUtil jwtUtil,
			UserRepository userRepo) {
		super();
		this.service = service;
		this.authManager = authManager;
		this.jwtUtil = jwtUtil;
		this.userRepo = userRepo;
	}

	@PostMapping("/login")
	public ResponseEntity<UserResponseDto> login(@RequestBody LoginRequestDTO loginDTO) {
		try {
			// Authenticate the user
			UsernamePasswordAuthenticationToken authInput = new UsernamePasswordAuthenticationToken(
					loginDTO.getUsername(), loginDTO.getPassword());
			authManager.authenticate(authInput);

			User user = userRepo.findByLogin(loginDTO.getUsername())
					.orElseThrow(() -> new UsernameNotFoundException("User not found"));

			String jwtToken = jwtUtil.generateToken(user.getLogin(), user.getId());
			System.out.println("JWT Token = " + jwtToken);

			UserResponseDto userResponseDto = new UserResponseDto(user.getId(), user.getLogin());

			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Bearer " + jwtToken);

			return ResponseEntity.ok().headers(headers).body(userResponseDto);

		} catch (AuthenticationException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}

	}

	@GetMapping
	public List<AuthSourceDTO> getAllAuthSources() {
		return service.getAllAuthSources();
	}

	@GetMapping("/{id}")
	public Optional<AuthSourceDTO> getAuthSourceById(@PathVariable Integer id) {
		return service.getAuthSourceById(id);
	}

	@PostMapping
	public AuthSourceDTO saveAuthSource(@RequestBody AuthSourceDTO dto) {
		return service.saveAuthSource(dto);
	}

	@DeleteMapping("/{id}")
	public void deleteAuthSource(@PathVariable Integer id) {
		service.deleteAuthSource(id);
	}
}
