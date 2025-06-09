package com.sarathi.support.controller;

import com.sarathi.support.dto.RepositoriesDTO;
import com.sarathi.support.service.RepositoriesService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/repositories")
public class RepositoriesController {
	private final RepositoriesService service;

	public RepositoriesController(RepositoriesService service) {
		this.service = service;
	}

	@GetMapping
	public List<RepositoriesDTO> getAllRepositories() {
		return service.getAllRepositories();
	}

	@GetMapping("/{id}")
	public Optional<RepositoriesDTO> getRepositoryById(@PathVariable Integer id) {
		return service.getRepositoryById(id);
	}

	@PostMapping
	public RepositoriesDTO saveRepository(@RequestBody RepositoriesDTO dto) {
		return service.saveRepository(dto);
	}

	@PutMapping("/{id}")
	public RepositoriesDTO updateRepository(@PathVariable Integer id, @RequestBody RepositoriesDTO dto) {
		return service.updateRepository(id, dto);
	}

	@DeleteMapping("/{id}")
	public void deleteRepository(@PathVariable Integer id) {
		service.deleteRepository(id);
	}
}
