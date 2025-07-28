package com.sarathi.support.service;

import com.sarathi.support.dto.DocumentDTO;
import com.sarathi.support.entity.Document;
import com.sarathi.support.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DocumentService {

    private final DocumentRepository repository;

     
    public DocumentService(DocumentRepository repository) {
        this.repository = repository;
    }

    public List<DocumentDTO> getAllDocuments() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<DocumentDTO> getDocumentById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public DocumentDTO saveDocument(DocumentDTO dto) {
        Document document = convertToEntity(dto);
        Document savedDocument = repository.save(document);
        return convertToDTO(savedDocument);
    }

    public void deleteDocument(Integer id) {
        repository.deleteById(id);
    }

    private DocumentDTO convertToDTO(Document document) {
        return new DocumentDTO(
                document.getId(),
                document.getProjectId(),
                document.getCategoryId(),
                document.getTitle(),
                document.getDescription(),
                document.getCreatedOn()
        );
    }

    private Document convertToEntity(DocumentDTO dto) {
        Document document = new Document();
        document.setId(dto.getId());
        document.setProjectId(dto.getProjectId());
        document.setCategoryId(dto.getCategoryId());
        document.setTitle(dto.getTitle());
        document.setDescription(dto.getDescription());
        document.setCreatedOn(dto.getCreatedOn());
        return document;
    }
}
