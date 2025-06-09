package com.sarathi.support.service;

import java.util.List;
import java.util.Optional;
import com.sarathi.support.entity.ArInternalMetadatum;
import com.sarathi.support.repository.ArInternalMetadatumRepository;

public class ArInternalMetadatumService {
	private final ArInternalMetadatumRepository repository;

	public ArInternalMetadatumService(ArInternalMetadatumRepository repository) {
		this.repository = repository;
	}

	public List<ArInternalMetadatum> getAllMetadata() {
		return repository.findAll();
	}

	public Optional<ArInternalMetadatum> getMetadataByKey(String key) {
		return repository.findById(key);
	}

	public ArInternalMetadatum saveMetadata(ArInternalMetadatum metadata) {
		return repository.save(metadata);
	}

	public void deleteMetadata(String key) {
		repository.deleteById(key);
	}
}
