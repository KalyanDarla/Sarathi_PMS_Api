package com.sarathi.support.controller;

import com.sarathi.support.dto.AttachmentDTO;

import com.sarathi.support.service.AttachmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/attachments")
public class AttachmentController {

	private final AttachmentService service;

	public AttachmentController(AttachmentService service) {
		this.service = service;
	}

	@GetMapping
	public List<AttachmentDTO> getAllAttachments() {
		return service.getAllAttachments();
	}

	@GetMapping("/{id}")
	public Optional<AttachmentDTO> getAttachmentById(@PathVariable Integer id) {
		return service.getAttachmentById(id);
	}

	@PostMapping
	public AttachmentDTO saveAttachment(@RequestBody AttachmentDTO dto) {
		return service.saveAttachment(dto);
	}

	@DeleteMapping("/{id}")
	public void deleteAttachment(@PathVariable Integer id) {
		service.deleteAttachment(id);
	}
}
