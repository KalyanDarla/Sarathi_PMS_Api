package com.sarathi.support.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.sarathi.support.entity.ArInternalMetadatum;
import com.sarathi.support.service.ArInternalMetadatumService;

public class ArInternalMetadatumController {
	private final ArInternalMetadatumService service;

	public ArInternalMetadatumController(ArInternalMetadatumService service) {
		this.service = service;
	}

	@GetMapping
	public List<ArInternalMetadatum> getAllMetadata() {
		return service.getAllMetadata();
	}

	@GetMapping("/{key}")
	public Optional<ArInternalMetadatum> getMetadataByKey(@PathVariable String key) {
		return service.getMetadataByKey(key);
	}

	@PostMapping
	public ArInternalMetadatum saveMetadata(@RequestBody ArInternalMetadatum metadata) {
		return service.saveMetadata(metadata);
	}

	@DeleteMapping("/{key}")
	public void deleteMetadata(@PathVariable String key) {
		service.deleteMetadata(key);
	}
}
