package com.sarathi.support.controller;

import com.sarathi.support.dto.WikiRedirectDTO;
import com.sarathi.support.service.WikiRedirectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/wiki-redirects")
public class WikiRedirectController {

    private final WikiRedirectService service;

     
    public WikiRedirectController(WikiRedirectService service) {
        this.service = service;
    }

    @GetMapping
    public List<WikiRedirectDTO> getAllWikiRedirects() {
        return service.getAllWikiRedirects();
    }

    @GetMapping("/{id}")
    public Optional<WikiRedirectDTO> getWikiRedirectById(@PathVariable Integer id) {
        return service.getWikiRedirectById(id);
    }

    @PostMapping
    public WikiRedirectDTO saveWikiRedirect(@RequestBody WikiRedirectDTO dto) {
        return service.saveWikiRedirect(dto);
    }

    @PutMapping("/{id}")
    public WikiRedirectDTO updateWikiRedirect(@PathVariable Integer id, @RequestBody WikiRedirectDTO dto) {
        return service.updateWikiRedirect(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteWikiRedirect(@PathVariable Integer id) {
        service.deleteWikiRedirect(id);
    }
}

