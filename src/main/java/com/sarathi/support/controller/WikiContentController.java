package com.sarathi.support.controller;

import com.sarathi.support.dto.WikiContentDTO;
import com.sarathi.support.service.WikiContentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/wiki-contents")
public class WikiContentController {

    private final WikiContentService service;

     
    public WikiContentController(WikiContentService service) {
        this.service = service;
    }

    @GetMapping
    public List<WikiContentDTO> getAllWikiContents() {
        return service.getAllWikiContents();
    }

    @GetMapping("/{id}")
    public Optional<WikiContentDTO> getWikiContentById(@PathVariable Integer id) {
        return service.getWikiContentById(id);
    }

    @PostMapping
    public WikiContentDTO saveWikiContent(@RequestBody WikiContentDTO dto) {
        return service.saveWikiContent(dto);
    }

    @PutMapping("/{id}")
    public WikiContentDTO updateWikiContent(@PathVariable Integer id, @RequestBody WikiContentDTO dto) {
        return service.updateWikiContent(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteWikiContent(@PathVariable Integer id) {
        service.deleteWikiContent(id);
    }
}
