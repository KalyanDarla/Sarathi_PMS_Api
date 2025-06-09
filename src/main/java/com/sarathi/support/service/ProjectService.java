package com.sarathi.support.service;

import com.sarathi.support.dto.ProjectDTO;
import com.sarathi.support.entity.Project;
import com.sarathi.support.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    private final ProjectRepository repository;

     
    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public List<ProjectDTO> getAllProjects() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<ProjectDTO> getProjectById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public ProjectDTO saveProject(ProjectDTO dto) {
        Project project = convertToEntity(dto);
        project.setCreatedOn(Instant.now());
        project.setUpdatedOn(Instant.now());
        Project savedProject = repository.save(project);
        return convertToDTO(savedProject);
    }

    public ProjectDTO updateProject(Integer id, ProjectDTO dto) {
        Optional<Project> existingProjectOpt = repository.findById(id);
        if (existingProjectOpt.isPresent()) {
            Project existingProject = existingProjectOpt.get();
            existingProject.setName(dto.getName());
            existingProject.setDescription(dto.getDescription());
            existingProject.setHomepage(dto.getHomepage());
            existingProject.setIsPublic(dto.getIsPublic());
            existingProject.setParentId(dto.getParentId());
            existingProject.setIdentifier(dto.getIdentifier());
            existingProject.setStatus(dto.getStatus());
            existingProject.setLft(dto.getLft());
            existingProject.setRgt(dto.getRgt());
            existingProject.setInheritMembers(dto.getInheritMembers());
            existingProject.setDefaultVersionId(dto.getDefaultVersionId());
            existingProject.setDefaultAssignedToId(dto.getDefaultAssignedToId());
            existingProject.setUpdatedOn(Instant.now());

            Project updatedProject = repository.save(existingProject);
            return convertToDTO(updatedProject);
        } else {
            throw new RuntimeException("Project with ID " + id + " not found.");
        }
    }

    public void deleteProject(Integer id) {
        repository.deleteById(id);
    }

    private ProjectDTO convertToDTO(Project project) {
        return new ProjectDTO(
                project.getId(), project.getName(), project.getDescription(), project.getHomepage(),
                project.getIsPublic(), project.getParentId(), project.getCreatedOn(), project.getUpdatedOn(),
                project.getIdentifier(), project.getStatus(), project.getLft(), project.getRgt(),
                project.getInheritMembers(), project.getDefaultVersionId(), project.getDefaultAssignedToId()
        );
    }

    private Project convertToEntity(ProjectDTO dto) {
        Project project = new Project();
        project.setId(dto.getId());
        project.setName(dto.getName());
        project.setDescription(dto.getDescription());
        project.setHomepage(dto.getHomepage());
        project.setIsPublic(dto.getIsPublic());
        project.setParentId(dto.getParentId());
        project.setIdentifier(dto.getIdentifier());
        project.setStatus(dto.getStatus());
        project.setLft(dto.getLft());
        project.setRgt(dto.getRgt());
        project.setInheritMembers(dto.getInheritMembers());
        project.setDefaultVersionId(dto.getDefaultVersionId());
        project.setDefaultAssignedToId(dto.getDefaultAssignedToId());
        return project;
    }
}

