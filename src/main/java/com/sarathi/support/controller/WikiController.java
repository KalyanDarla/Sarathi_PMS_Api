package com.sarathi.support.controller;

import com.sarathi.support.dto.WikiDTO;
import com.sarathi.support.service.WikiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/wikis")
public class WikiController {

    private final WikiService service;

     
    public WikiController(WikiService service) {
        this.service = service;
    }

    @GetMapping
    public List<WikiDTO> getAllWikis() {
        return service.getAllWikis();
    }

    @GetMapping("/{id}")
    public Optional<WikiDTO> getWikiById(@PathVariable Integer id) {
        return service.getWikiById(id);
    }

    @PostMapping
    public WikiDTO saveWiki(@RequestBody WikiDTO dto) {
        return service.saveWiki(dto);
    }

    @PutMapping("/{id}")
    public WikiDTO updateWiki(@PathVariable Integer id, @RequestBody WikiDTO dto) {
        return service.updateWiki(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteWiki(@PathVariable Integer id) {
        service.deleteWiki(id);
    }
}
