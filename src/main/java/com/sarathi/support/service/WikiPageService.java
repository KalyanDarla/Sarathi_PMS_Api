package com.sarathi.support.service;

import com.sarathi.support.dto.WikiPageDTO;
import com.sarathi.support.entity.WikiPage;
import com.sarathi.support.repository.WikiPageRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WikiPageService {

    private final WikiPageRepository repository;

     
    public WikiPageService(WikiPageRepository repository) {
        this.repository = repository;
    }

    public List<WikiPageDTO> getAllWikiPages() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<WikiPageDTO> getWikiPageById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public WikiPageDTO saveWikiPage(WikiPageDTO dto) {
        WikiPage wikiPage = convertToEntity(dto);
        wikiPage.setCreatedOn(Instant.now());
        WikiPage savedWikiPage = repository.save(wikiPage);
        return convertToDTO(savedWikiPage);
    }

    public WikiPageDTO updateWikiPage(Integer id, WikiPageDTO dto) {
        Optional<WikiPage> existingWikiPageOpt = repository.findById(id);
        if (existingWikiPageOpt.isPresent()) {
            WikiPage existingWikiPage = existingWikiPageOpt.get();
            existingWikiPage.setWikiId(dto.getWikiId());
            existingWikiPage.setTitle(dto.getTitle());
            existingWikiPage.setProtectedField(dto.getProtectedField());
            existingWikiPage.setParentId(dto.getParentId());
            existingWikiPage.setCreatedOn(Instant.now());

            WikiPage updatedWikiPage = repository.save(existingWikiPage);
            return convertToDTO(updatedWikiPage);
        } else {
            throw new RuntimeException("WikiPage with ID " + id + " not found.");
        }
    }

    public void deleteWikiPage(Integer id) {
        repository.deleteById(id);
    }

    private WikiPageDTO convertToDTO(WikiPage wikiPage) {
        return new WikiPageDTO(
                wikiPage.getId(),
                wikiPage.getWikiId(),
                wikiPage.getTitle(),
                wikiPage.getCreatedOn(),
                wikiPage.getProtectedField(),
                wikiPage.getParentId()
        );
    }

    private WikiPage convertToEntity(WikiPageDTO dto) {
        WikiPage wikiPage = new WikiPage();
        wikiPage.setId(dto.getId());
        wikiPage.setWikiId(dto.getWikiId());
        wikiPage.setTitle(dto.getTitle());
        wikiPage.setProtectedField(dto.getProtectedField());
        wikiPage.setParentId(dto.getParentId());
        return wikiPage;
    }
}

