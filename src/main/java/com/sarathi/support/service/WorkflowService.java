package com.sarathi.support.service;

import com.sarathi.support.dto.WorkflowDTO;
import com.sarathi.support.entity.Workflow;
import com.sarathi.support.repository.WorkflowRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WorkflowService {

    private final WorkflowRepository repository;

     
    public WorkflowService(WorkflowRepository repository) {
        this.repository = repository;
    }

    public List<WorkflowDTO> getAllWorkflows() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<WorkflowDTO> getWorkflowById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public WorkflowDTO saveWorkflow(WorkflowDTO dto) {
        Workflow workflow = convertToEntity(dto);
        Workflow savedWorkflow = repository.save(workflow);
        return convertToDTO(savedWorkflow);
    }

    public WorkflowDTO updateWorkflow(Integer id, WorkflowDTO dto) {
        Optional<Workflow> existingWorkflowOpt = repository.findById(id);
        if (existingWorkflowOpt.isPresent()) {
            Workflow existingWorkflow = existingWorkflowOpt.get();
            existingWorkflow.setTrackerId(dto.getTrackerId());
            existingWorkflow.setOldStatusId(dto.getOldStatusId());
            existingWorkflow.setNewStatusId(dto.getNewStatusId());
            existingWorkflow.setRoleId(dto.getRoleId());
            existingWorkflow.setAssignee(dto.getAssignee());
            existingWorkflow.setAuthor(dto.getAuthor());
            existingWorkflow.setType(dto.getType());
            existingWorkflow.setFieldName(dto.getFieldName());
            existingWorkflow.setRule(dto.getRule());

            Workflow updatedWorkflow = repository.save(existingWorkflow);
            return convertToDTO(updatedWorkflow);
        } else {
            throw new RuntimeException("Workflow with ID " + id + " not found.");
        }
    }

    public void deleteWorkflow(Integer id) {
        repository.deleteById(id);
    }

    private WorkflowDTO convertToDTO(Workflow workflow) {
        return new WorkflowDTO(
                workflow.getId(),
                workflow.getTrackerId(),
                workflow.getOldStatusId(),
                workflow.getNewStatusId(),
                workflow.getRoleId(),
                workflow.getAssignee(),
                workflow.getAuthor(),
                workflow.getType(),
                workflow.getFieldName(),
                workflow.getRule()
        );
    }

    private Workflow convertToEntity(WorkflowDTO dto) {
        Workflow workflow = new Workflow();
        workflow.setId(dto.getId());
        workflow.setTrackerId(dto.getTrackerId());
        workflow.setOldStatusId(dto.getOldStatusId());
        workflow.setNewStatusId(dto.getNewStatusId());
        workflow.setRoleId(dto.getRoleId());
        workflow.setAssignee(dto.getAssignee());
        workflow.setAuthor(dto.getAuthor());
        workflow.setType(dto.getType());
        workflow.setFieldName(dto.getFieldName());
        workflow.setRule(dto.getRule());
        return workflow;
    }
}
