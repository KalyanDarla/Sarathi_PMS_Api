package com.sarathi.support.controller;

import com.sarathi.support.dto.IssueDTO;
import com.sarathi.support.dto.IssueViewDto;
import com.sarathi.support.service.IssueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/issues")
public class IssueController {

    private final IssueService service;

     
    public IssueController(IssueService service) {
        this.service = service;
    }

    @GetMapping("/getAllIssues")
    public List<IssueViewDto> getAllIssues() {
        return service.getAllIssues();
    }

    @GetMapping("/{id}")
    public Optional<IssueViewDto> getIssueById(@PathVariable Integer id) {
        return service.getIssueById(id);
    }

    @PostMapping("/saveIssue")
    public IssueDTO saveIssue(@RequestBody IssueDTO dto) {
        return service.saveIssue(dto);
    }

    @PutMapping("/{id}")
    public IssueDTO updateIssue(@PathVariable Integer id, @RequestBody IssueDTO dto) {
        return service.updateIssue(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteIssue(@PathVariable Integer id) {
        service.deleteIssue(id);
    }
    
 
}
