package com.sarathi.support.service;

import com.sarathi.support.dto.WikiContentDTO;
import com.sarathi.support.entity.WikiContent;
import com.sarathi.support.repository.WikiContentRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WikiContentService {

    private final WikiContentRepository repository;

     
    public WikiContentService(WikiContentRepository repository) {
        this.repository = repository;
    }

    public List<WikiContentDTO> getAllWikiContents() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<WikiContentDTO> getWikiContentById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public WikiContentDTO saveWikiContent(WikiContentDTO dto) {
        WikiContent wikiContent = convertToEntity(dto);
        wikiContent.setUpdatedOn(Instant.now());
        WikiContent savedWikiContent = repository.save(wikiContent);
        return convertToDTO(savedWikiContent);
    }

    public WikiContentDTO updateWikiContent(Integer id, WikiContentDTO dto) {
        Optional<WikiContent> existingWikiContentOpt = repository.findById(id);
        if (existingWikiContentOpt.isPresent()) {
            WikiContent existingWikiContent = existingWikiContentOpt.get();
            existingWikiContent.setPageId(dto.getPageId());
            existingWikiContent.setAuthorId(dto.getAuthorId());
            existingWikiContent.setText(dto.getText());
            existingWikiContent.setComments(dto.getComments());
            existingWikiContent.setVersion(dto.getVersion());
            existingWikiContent.setUpdatedOn(Instant.now());

            WikiContent updatedWikiContent = repository.save(existingWikiContent);
            return convertToDTO(updatedWikiContent);
        } else {
            throw new RuntimeException("WikiContent with ID " + id + " not found.");
        }
    }

    public void deleteWikiContent(Integer id) {
        repository.deleteById(id);
    }

    private WikiContentDTO convertToDTO(WikiContent wikiContent) {
        return new WikiContentDTO(
                wikiContent.getId(),
                wikiContent.getPageId(),
                wikiContent.getAuthorId(),
                wikiContent.getText(),
                wikiContent.getComments(),
                wikiContent.getUpdatedOn(),
                wikiContent.getVersion()
        );
    }

    private WikiContent convertToEntity(WikiContentDTO dto) {
        WikiContent wikiContent = new WikiContent();
        wikiContent.setId(dto.getId());
        wikiContent.setPageId(dto.getPageId());
        wikiContent.setAuthorId(dto.getAuthorId());
        wikiContent.setText(dto.getText());
        wikiContent.setComments(dto.getComments());
        wikiContent.setVersion(dto.getVersion());
        return wikiContent;
    }
}

