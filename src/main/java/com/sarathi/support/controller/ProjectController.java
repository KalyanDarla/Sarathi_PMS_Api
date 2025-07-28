package com.sarathi.support.controller;

import com.sarathi.support.dto.ProjectDTO;
import com.sarathi.support.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService service;

     
    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProjectDTO> getAllProjects() {
        return service.getAllProjects();
    }

    @GetMapping("/{id}")
    public Optional<ProjectDTO> getProjectById(@PathVariable Integer id) {
        return service.getProjectById(id);
    }
    @GetMapping("/project/{userId}")
    public List<ProjectDTO> getProjectByUserId(@PathVariable Integer userId) {
        return service.getProjectByUserId(userId);
    }

    @PostMapping
    public ProjectDTO saveProject(@RequestBody ProjectDTO dto) {
        return service.saveProject(dto);
    }

    @PutMapping("/{id}")
    public ProjectDTO updateProject(@PathVariable Integer id, @RequestBody ProjectDTO dto) {
        return service.updateProject(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Integer id) {
        service.deleteProject(id);
    }
}

