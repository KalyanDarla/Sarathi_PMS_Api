package com.sarathi.support.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sarathi.support.dto.WorkFlowStatusDto;
import com.sarathi.support.dto.WorkflowDTO;
import com.sarathi.support.service.WorkflowService;

@RestController
@RequestMapping("/workflows")
public class WorkflowController {

    private final WorkflowService service;

     
    public WorkflowController(WorkflowService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkflowDTO> getAllWorkflows() {
        return service.getAllWorkflows();
    }

    @GetMapping("/{id}")
    public Optional<WorkflowDTO> getWorkflowById(@PathVariable Integer id) {
        return service.getWorkflowById(id);
    }

    @PostMapping
    public WorkflowDTO saveWorkflow(@RequestBody WorkflowDTO dto) {
        return service.saveWorkflow(dto);
    }

    @PutMapping("/{id}")
    public WorkflowDTO updateWorkflow(@PathVariable Integer id, @RequestBody WorkflowDTO dto) {
        return service.updateWorkflow(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkflow(@PathVariable Integer id) {
        service.deleteWorkflow(id);
    }
    
    @GetMapping("/new-status")
    public List<WorkFlowStatusDto> getNewStatusIds(@RequestParam Long projectId,
                                      @RequestParam Long userId,
                                      @RequestParam Integer oldStatusId,
                                      @RequestParam Integer trackerId) {
        return service.getNewStatusIds(projectId, userId, oldStatusId, trackerId);
    }
}
