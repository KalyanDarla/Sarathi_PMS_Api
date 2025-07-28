package com.sarathi.support.service;

import com.sarathi.support.dto.WikiContentVersionDTO;
import com.sarathi.support.entity.WikiContentVersion;
import com.sarathi.support.repository.WikiContentVersionRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WikiContentVersionService {

    private final WikiContentVersionRepository repository;

     
    public WikiContentVersionService(WikiContentVersionRepository repository) {
        this.repository = repository;
    }

    public List<WikiContentVersionDTO> getAllWikiContentVersions() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<WikiContentVersionDTO> getWikiContentVersionById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public WikiContentVersionDTO saveWikiContentVersion(WikiContentVersionDTO dto) {
        WikiContentVersion wikiContentVersion = convertToEntity(dto);
        wikiContentVersion.setUpdatedOn(Instant.now());
        WikiContentVersion savedWikiContentVersion = repository.save(wikiContentVersion);
        return convertToDTO(savedWikiContentVersion);
    }

    public WikiContentVersionDTO updateWikiContentVersion(Integer id, WikiContentVersionDTO dto) {
        Optional<WikiContentVersion> existingWikiContentVersionOpt = repository.findById(id);
        if (existingWikiContentVersionOpt.isPresent()) {
            WikiContentVersion existingWikiContentVersion = existingWikiContentVersionOpt.get();
            existingWikiContentVersion.setWikiContentId(dto.getWikiContentId());
            existingWikiContentVersion.setPageId(dto.getPageId());
            existingWikiContentVersion.setAuthorId(dto.getAuthorId());
            existingWikiContentVersion.setData(dto.getData());
            existingWikiContentVersion.setCompression(dto.getCompression());
            existingWikiContentVersion.setComments(dto.getComments());
            existingWikiContentVersion.setVersion(dto.getVersion());
            existingWikiContentVersion.setUpdatedOn(Instant.now());

            WikiContentVersion updatedWikiContentVersion = repository.save(existingWikiContentVersion);
            return convertToDTO(updatedWikiContentVersion);
        } else {
            throw new RuntimeException("WikiContentVersion with ID " + id + " not found.");
        }
    }

    public void deleteWikiContentVersion(Integer id) {
        repository.deleteById(id);
    }

    private WikiContentVersionDTO convertToDTO(WikiContentVersion wikiContentVersion) {
        return new WikiContentVersionDTO(
                wikiContentVersion.getId(),
                wikiContentVersion.getWikiContentId(),
                wikiContentVersion.getPageId(),
                wikiContentVersion.getAuthorId(),
                wikiContentVersion.getData(),
                wikiContentVersion.getCompression(),
                wikiContentVersion.getComments(),
                wikiContentVersion.getUpdatedOn(),
                wikiContentVersion.getVersion()
        );
    }

    private WikiContentVersion convertToEntity(WikiContentVersionDTO dto) {
        WikiContentVersion wikiContentVersion = new WikiContentVersion();
        wikiContentVersion.setId(dto.getId());
        wikiContentVersion.setWikiContentId(dto.getWikiContentId());
        wikiContentVersion.setPageId(dto.getPageId());
        wikiContentVersion.setAuthorId(dto.getAuthorId());
        wikiContentVersion.setData(dto.getData());
        wikiContentVersion.setCompression(dto.getCompression());
        wikiContentVersion.setComments(dto.getComments());
        wikiContentVersion.setVersion(dto.getVersion());
        return wikiContentVersion;
    }
}
