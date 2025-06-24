package com.sarathi.support.controller;

import com.sarathi.support.dto.WorkflowDTO;
import com.sarathi.support.service.WorkflowService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public List<Long> getNewStatusIds(@RequestParam Long projectId,
                                      @RequestParam Long userId,
                                      @RequestParam Integer oldStatusId,
                                      @RequestParam Integer trackerId) {
        return service.getNewStatusIds(projectId, userId, oldStatusId, trackerId);
    }
}
