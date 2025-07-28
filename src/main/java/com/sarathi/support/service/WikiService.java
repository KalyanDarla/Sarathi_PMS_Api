package com.sarathi.support.service;

import com.sarathi.support.dto.WikiDTO;
import com.sarathi.support.entity.Wiki;
import com.sarathi.support.repository.WikiRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WikiService {

    private final WikiRepository repository;

     public WikiService(WikiRepository repository) {
        this.repository = repository;
    }

    public List<WikiDTO> getAllWikis() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<WikiDTO> getWikiById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public WikiDTO saveWiki(WikiDTO dto) {
        Wiki wiki = convertToEntity(dto);
        Wiki savedWiki = repository.save(wiki);
        return convertToDTO(savedWiki);
    }

    public WikiDTO updateWiki(Integer id, WikiDTO dto) {
        Optional<Wiki> existingWikiOpt = repository.findById(id);
        if (existingWikiOpt.isPresent()) {
            Wiki existingWiki = existingWikiOpt.get();
            existingWiki.setProjectId(dto.getProjectId());
            existingWiki.setStartPage(dto.getStartPage());
            existingWiki.setStatus(dto.getStatus());

            Wiki updatedWiki = repository.save(existingWiki);
            return convertToDTO(updatedWiki);
        } else {
            throw new RuntimeException("Wiki with ID " + id + " not found.");
        }
    }

    public void deleteWiki(Integer id) {
        repository.deleteById(id);
    }

    private WikiDTO convertToDTO(Wiki wiki) {
        return new WikiDTO(
                wiki.getId(),
                wiki.getProjectId(),
                wiki.getStartPage(),
                wiki.getStatus()
        );
    }

    private Wiki convertToEntity(WikiDTO dto) {
        Wiki wiki = new Wiki();
        wiki.setId(dto.getId());
        wiki.setProjectId(dto.getProjectId());
        wiki.setStartPage(dto.getStartPage());
        wiki.setStatus(dto.getStatus());
        return wiki;
    }
}
