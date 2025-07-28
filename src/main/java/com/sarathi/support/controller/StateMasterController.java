package com.sarathi.support.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarathi.support.dto.StateMasterDTO;
import com.sarathi.support.entity.StateMaster;
import com.sarathi.support.service.StateMasterService;

@RestController
@RequestMapping("/states")
public class StateMasterController {

	@Autowired
	private StateMasterService service;

	@GetMapping
	public List<StateMasterDTO> getAllStates() {
		return service.getAllStateDTOs();
	}

	@GetMapping("/{id}")
	public ResponseEntity<StateMaster> getStateById(@PathVariable Short id) {
		return service.getStateById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public StateMaster createState(@RequestBody StateMaster state) {
		return service.saveState(state);
	}

	@PutMapping("/{id}")
	public ResponseEntity<StateMaster> updateState(@PathVariable Short id, @RequestBody StateMaster updatedState) {
		return service.getStateById(id).map(existing -> {
			updatedState.setId(id);
			return ResponseEntity.ok(service.saveState(updatedState));
		}).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteState(@PathVariable Short id) {
		if (service.getStateById(id).isPresent()) {
			service.deleteStateById(id);
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
}
