package com.sarathi.support.controller;

import com.sarathi.support.dto.NewsDTO;
import com.sarathi.support.service.NewsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/news")
public class NewsController {

    private final NewsService service;

     
    public NewsController(NewsService service) {
        this.service = service;
    }

    @GetMapping
    public List<NewsDTO> getAllNews() {
        return service.getAllNews();
    }

    @GetMapping("/{id}")
    public Optional<NewsDTO> getNewsById(@PathVariable Integer id) {
        return service.getNewsById(id);
    }

    @PostMapping
    public NewsDTO saveNews(@RequestBody NewsDTO dto) {
        return service.saveNews(dto);
    }

    @PutMapping("/{id}")
    public NewsDTO updateNews(@PathVariable Integer id, @RequestBody NewsDTO dto) {
        return service.updateNews(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteNews(@PathVariable Integer id) {
        service.deleteNews(id);
    }
}

