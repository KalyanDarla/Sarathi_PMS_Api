package com.sarathi.support.service;

import com.sarathi.support.dto.ProjectsTrackerDTO;
import com.sarathi.support.entity.ProjectsTracker;
import com.sarathi.support.repository.ProjectsTrackerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProjectsTrackerService {

    private final ProjectsTrackerRepository repository;

     
    public ProjectsTrackerService(ProjectsTrackerRepository repository) {
        this.repository = repository;
    }

    public List<ProjectsTrackerDTO> getAllProjectsTrackers() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<ProjectsTrackerDTO> getProjectsTrackerById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public ProjectsTrackerDTO saveProjectsTracker(ProjectsTrackerDTO dto) {
        ProjectsTracker projectsTracker = convertToEntity(dto);
        ProjectsTracker savedProjectsTracker = repository.save(projectsTracker);
        return convertToDTO(savedProjectsTracker);
    }

    public ProjectsTrackerDTO updateProjectsTracker(Integer id, ProjectsTrackerDTO dto) {
        Optional<ProjectsTracker> existingTrackerOpt = repository.findById(id);
        if (existingTrackerOpt.isPresent()) {
            ProjectsTracker existingTracker = existingTrackerOpt.get();
            existingTracker.setProjectId(dto.getProjectId());
            existingTracker.setTrackerId(dto.getTrackerId());

            ProjectsTracker updatedTracker = repository.save(existingTracker);
            return convertToDTO(updatedTracker);
        } else {
            throw new RuntimeException("ProjectsTracker with ID " + id + " not found.");
        }
    }

    public void deleteProjectsTracker(Integer id) {
        repository.deleteById(id);
    }

    private ProjectsTrackerDTO convertToDTO(ProjectsTracker projectsTracker) {
        return new ProjectsTrackerDTO(
                projectsTracker.getProjectId(),
                projectsTracker.getTrackerId()
        );
    }

    private ProjectsTracker convertToEntity(ProjectsTrackerDTO dto) {
        ProjectsTracker projectsTracker = new ProjectsTracker();
        projectsTracker.setProjectId(dto.getProjectId());
        projectsTracker.setTrackerId(dto.getTrackerId());
        return projectsTracker;
    }
}

