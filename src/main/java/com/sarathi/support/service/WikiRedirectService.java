package com.sarathi.support.service;

import com.sarathi.support.dto.WikiRedirectDTO;
import com.sarathi.support.entity.WikiRedirect;
import com.sarathi.support.repository.WikiRedirectRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WikiRedirectService {

    private final WikiRedirectRepository repository;

     
    public WikiRedirectService(WikiRedirectRepository repository) {
        this.repository = repository;
    }

    public List<WikiRedirectDTO> getAllWikiRedirects() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<WikiRedirectDTO> getWikiRedirectById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public WikiRedirectDTO saveWikiRedirect(WikiRedirectDTO dto) {
        WikiRedirect wikiRedirect = convertToEntity(dto);
        wikiRedirect.setCreatedOn(Instant.now());
        WikiRedirect savedWikiRedirect = repository.save(wikiRedirect);
        return convertToDTO(savedWikiRedirect);
    }

    public WikiRedirectDTO updateWikiRedirect(Integer id, WikiRedirectDTO dto) {
        Optional<WikiRedirect> existingWikiRedirectOpt = repository.findById(id);
        if (existingWikiRedirectOpt.isPresent()) {
            WikiRedirect existingWikiRedirect = existingWikiRedirectOpt.get();
            existingWikiRedirect.setWikiId(dto.getWikiId());
            existingWikiRedirect.setTitle(dto.getTitle());
            existingWikiRedirect.setRedirectsTo(dto.getRedirectsTo());
            existingWikiRedirect.setRedirectsToWikiId(dto.getRedirectsToWikiId());
            existingWikiRedirect.setCreatedOn(Instant.now());

            WikiRedirect updatedWikiRedirect = repository.save(existingWikiRedirect);
            return convertToDTO(updatedWikiRedirect);
        } else {
            throw new RuntimeException("WikiRedirect with ID " + id + " not found.");
        }
    }

    public void deleteWikiRedirect(Integer id) {
        repository.deleteById(id);
    }

    private WikiRedirectDTO convertToDTO(WikiRedirect wikiRedirect) {
        return new WikiRedirectDTO(
                wikiRedirect.getId(),
                wikiRedirect.getWikiId(),
                wikiRedirect.getTitle(),
                wikiRedirect.getRedirectsTo(),
                wikiRedirect.getCreatedOn(),
                wikiRedirect.getRedirectsToWikiId()
        );
    }

    private WikiRedirect convertToEntity(WikiRedirectDTO dto) {
        WikiRedirect wikiRedirect = new WikiRedirect();
        wikiRedirect.setId(dto.getId());
        wikiRedirect.setWikiId(dto.getWikiId());
        wikiRedirect.setTitle(dto.getTitle());
        wikiRedirect.setRedirectsTo(dto.getRedirectsTo());
        wikiRedirect.setRedirectsToWikiId(dto.getRedirectsToWikiId());
        return wikiRedirect;
    }
}

