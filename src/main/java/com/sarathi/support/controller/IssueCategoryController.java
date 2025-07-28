package com.sarathi.support.controller;

import com.sarathi.support.dto.IssueCategoryDTO;
import com.sarathi.support.service.IssueCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/issue-categories")
public class IssueCategoryController {

    private final IssueCategoryService service;

     
    public IssueCategoryController(IssueCategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<IssueCategoryDTO> getAllIssueCategories() {
        return service.getAllIssueCategories();
    }

    @GetMapping("/{id}")
    public Optional<IssueCategoryDTO> getIssueCategoryById(@PathVariable Integer id) {
        return service.getIssueCategoryById(id);
    }

    @PostMapping
    public IssueCategoryDTO saveIssueCategory(@RequestBody IssueCategoryDTO dto) {
        return service.saveIssueCategory(dto);
    }

    @PutMapping("/{id}")
    public IssueCategoryDTO updateIssueCategory(@PathVariable Integer id, @RequestBody IssueCategoryDTO dto) {
        return service.updateIssueCategory(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteIssueCategory(@PathVariable Integer id) {
        service.deleteIssueCategory(id);
    }
}

