package com.sarathi.support.controller;

import com.sarathi.support.dto.ProjectsTrackerDTO;
import com.sarathi.support.service.ProjectsTrackerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projects-trackers")
public class ProjectsTrackerController {

    private final ProjectsTrackerService service;

     
    public ProjectsTrackerController(ProjectsTrackerService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProjectsTrackerDTO> getAllProjectsTrackers() {
        return service.getAllProjectsTrackers();
    }

    @GetMapping("/{id}")
    public Optional<ProjectsTrackerDTO> getProjectsTrackerById(@PathVariable Integer id) {
        return service.getProjectsTrackerById(id);
    }

    @PostMapping
    public ProjectsTrackerDTO saveProjectsTracker(@RequestBody ProjectsTrackerDTO dto) {
        return service.saveProjectsTracker(dto);
    }

    @PutMapping("/{id}")
    public ProjectsTrackerDTO updateProjectsTracker(@PathVariable Integer id, @RequestBody ProjectsTrackerDTO dto) {
        return service.updateProjectsTracker(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteProjectsTracker(@PathVariable Integer id) {
        service.deleteProjectsTracker(id);
    }
}

