package com.sarathi.support.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarathi.support.dto.IssueDTO;
import com.sarathi.support.dto.IssueViewDto;
import com.sarathi.support.dto.StatusUpdateRequest;
import com.sarathi.support.service.IssueService;

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
    
    @GetMapping("/assign/{id}")
    public List<IssueViewDto> getIssueByAssignId(@PathVariable Integer id) {
        return service.getIssueByAssignId(id);
    }
    @PutMapping("/{issueId}/status")
    public ResponseEntity<Map<String, String>> updateIssueStatus(
            @PathVariable Integer issueId,
            @RequestBody StatusUpdateRequest request) {

        boolean updated = service.updateStatus(issueId, request.getStatusId());

        if (updated) {
            Map<String, String> response = new HashMap<>();
            response.put("message", "Status updated successfully");
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("error", "Issue not found"));
        }
    }

}
