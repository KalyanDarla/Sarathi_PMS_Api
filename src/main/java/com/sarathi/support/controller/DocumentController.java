package com.sarathi.support.controller;

import com.sarathi.support.dto.DocumentDTO;
import com.sarathi.support.service.DocumentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    private final DocumentService service;

     
    public DocumentController(DocumentService service) {
        this.service = service;
    }

    @GetMapping
    public List<DocumentDTO> getAllDocuments() {
        return service.getAllDocuments();
    }

    @GetMapping("/{id}")
    public Optional<DocumentDTO> getDocumentById(@PathVariable Integer id) {
        return service.getDocumentById(id);
    }

    @PostMapping
    public DocumentDTO saveDocument(@RequestBody DocumentDTO dto) {
        return service.saveDocument(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteDocument(@PathVariable Integer id) {
        service.deleteDocument(id);
    }
}
