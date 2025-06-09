package com.sarathi.support.controller;

import com.sarathi.support.dto.IssueStatusDTO;
import com.sarathi.support.service.IssueStatusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/issue-statuses")
public class IssueStatusController {

    private final IssueStatusService service;

     
    public IssueStatusController(IssueStatusService service) {
        this.service = service;
    }

    @GetMapping
    public List<IssueStatusDTO> getAllIssueStatuses() {
        return service.getAllIssueStatuses();
    }

    @GetMapping("/{id}")
    public Optional<IssueStatusDTO> getIssueStatusById(@PathVariable Integer id) {
        return service.getIssueStatusById(id);
    }

    @PostMapping
    public IssueStatusDTO saveIssueStatus(@RequestBody IssueStatusDTO dto) {
        return service.saveIssueStatus(dto);
    }

    @PutMapping("/{id}")
    public IssueStatusDTO updateIssueStatus(@PathVariable Integer id, @RequestBody IssueStatusDTO dto) {
        return service.updateIssueStatus(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteIssueStatus(@PathVariable Integer id) {
        service.deleteIssueStatus(id);
    }
}

