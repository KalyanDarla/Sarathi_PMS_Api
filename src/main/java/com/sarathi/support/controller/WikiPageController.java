package com.sarathi.support.controller;

import com.sarathi.support.dto.WikiPageDTO;
import com.sarathi.support.service.WikiPageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/wiki-pages")
public class WikiPageController {

    private final WikiPageService service;

     
    public WikiPageController(WikiPageService service) {
        this.service = service;
    }

    @GetMapping
    public List<WikiPageDTO> getAllWikiPages() {
        return service.getAllWikiPages();
    }

    @GetMapping("/{id}")
    public Optional<WikiPageDTO> getWikiPageById(@PathVariable Integer id) {
        return service.getWikiPageById(id);
    }

    @PostMapping
    public WikiPageDTO saveWikiPage(@RequestBody WikiPageDTO dto) {
        return service.saveWikiPage(dto);
    }

    @PutMapping("/{id}")
    public WikiPageDTO updateWikiPage(@PathVariable Integer id, @RequestBody WikiPageDTO dto) {
        return service.updateWikiPage(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteWikiPage(@PathVariable Integer id) {
        service.deleteWikiPage(id);
    }
}

