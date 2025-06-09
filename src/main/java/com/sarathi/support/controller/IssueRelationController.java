package com.sarathi.support.controller;

import com.sarathi.support.dto.IssueRelationDTO;
import com.sarathi.support.service.IssueRelationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/issue-relations")
public class IssueRelationController {

    private final IssueRelationService service;

     
    public IssueRelationController(IssueRelationService service) {
        this.service = service;
    }

    @GetMapping
    public List<IssueRelationDTO> getAllIssueRelations() {
        return service.getAllIssueRelations();
    }

    @GetMapping("/{id}")
    public Optional<IssueRelationDTO> getIssueRelationById(@PathVariable Integer id) {
        return service.getIssueRelationById(id);
    }

    @PostMapping
    public IssueRelationDTO saveIssueRelation(@RequestBody IssueRelationDTO dto) {
        return service.saveIssueRelation(dto);
    }

    @PutMapping("/{id}")
    public IssueRelationDTO updateIssueRelation(@PathVariable Integer id, @RequestBody IssueRelationDTO dto) {
        return service.updateIssueRelation(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteIssueRelation(@PathVariable Integer id) {
        service.deleteIssueRelation(id);
    }
}

