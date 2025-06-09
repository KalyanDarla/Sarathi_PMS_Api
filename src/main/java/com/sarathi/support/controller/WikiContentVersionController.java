package com.sarathi.support.controller;

import com.sarathi.support.dto.WikiContentVersionDTO;
import com.sarathi.support.service.WikiContentVersionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/wiki-content-versions")
public class WikiContentVersionController {

    private final WikiContentVersionService service;

     
    public WikiContentVersionController(WikiContentVersionService service) {
        this.service = service;
    }

    @GetMapping
    public List<WikiContentVersionDTO> getAllWikiContentVersions() {
        return service.getAllWikiContentVersions();
    }

    @GetMapping("/{id}")
    public Optional<WikiContentVersionDTO> getWikiContentVersionById(@PathVariable Integer id) {
        return service.getWikiContentVersionById(id);
    }

    @PostMapping
    public WikiContentVersionDTO saveWikiContentVersion(@RequestBody WikiContentVersionDTO dto) {
        return service.saveWikiContentVersion(dto);
    }

    @PutMapping("/{id}")
    public WikiContentVersionDTO updateWikiContentVersion(@PathVariable Integer id, @RequestBody WikiContentVersionDTO dto) {
        return service.updateWikiContentVersion(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteWikiContentVersion(@PathVariable Integer id) {
        service.deleteWikiContentVersion(id);
    }
}
