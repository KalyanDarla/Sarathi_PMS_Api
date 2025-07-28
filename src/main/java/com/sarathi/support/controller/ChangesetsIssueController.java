package com.sarathi.support.controller;

import com.sarathi.support.dto.ChangesetsIssueDTO;
import com.sarathi.support.service.ChangesetsIssueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/changesets-issues")
public class ChangesetsIssueController {

    private final ChangesetsIssueService service;

     
    public ChangesetsIssueController(ChangesetsIssueService service) {
        this.service = service;
    }

    @GetMapping
    public List<ChangesetsIssueDTO> getAllChangesetsIssues() {
        return service.getAllChangesetsIssues();
    }

    @GetMapping("/{id}")
    public Optional<ChangesetsIssueDTO> getChangesetsIssueById(@PathVariable Integer id) {
        return service.getChangesetsIssueById(id);
    }

    @PostMapping
    public ChangesetsIssueDTO saveChangesetsIssue(@RequestBody ChangesetsIssueDTO dto) {
        return service.saveChangesetsIssue(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteChangesetsIssue(@PathVariable Integer id) {
        service.deleteChangesetsIssue(id);
    }
}
