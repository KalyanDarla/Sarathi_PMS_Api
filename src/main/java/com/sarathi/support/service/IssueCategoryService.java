package com.sarathi.support.service;

import com.sarathi.support.dto.IssueCategoryDTO;
import com.sarathi.support.entity.IssueCategory;
import com.sarathi.support.repository.IssueCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class IssueCategoryService {

    private final IssueCategoryRepository repository;

     
    public IssueCategoryService(IssueCategoryRepository repository) {
        this.repository = repository;
    }

    public List<IssueCategoryDTO> getAllIssueCategories() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<IssueCategoryDTO> getIssueCategoryById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public IssueCategoryDTO saveIssueCategory(IssueCategoryDTO dto) {
        IssueCategory issueCategory = convertToEntity(dto);
        IssueCategory savedIssueCategory = repository.save(issueCategory);
        return convertToDTO(savedIssueCategory);
    }

    public IssueCategoryDTO updateIssueCategory(Integer id, IssueCategoryDTO dto) {
        Optional<IssueCategory> existingCategoryOpt = repository.findById(id);
        if (existingCategoryOpt.isPresent()) {
            IssueCategory existingCategory = existingCategoryOpt.get();
            existingCategory.setProjectId(dto.getProjectId());
            existingCategory.setName(dto.getName());
            existingCategory.setAssignedToId(dto.getAssignedToId());

            IssueCategory updatedCategory = repository.save(existingCategory);
            return convertToDTO(updatedCategory);
        } else {
            throw new RuntimeException("IssueCategory with ID " + id + " not found.");
        }
    }

    public void deleteIssueCategory(Integer id) {
        repository.deleteById(id);
    }

    private IssueCategoryDTO convertToDTO(IssueCategory issueCategory) {
        return new IssueCategoryDTO(
                issueCategory.getId(),
                issueCategory.getProjectId(),
                issueCategory.getName(),
                issueCategory.getAssignedToId()
        );
    }

    private IssueCategory convertToEntity(IssueCategoryDTO dto) {
        IssueCategory issueCategory = new IssueCategory();
        issueCategory.setId(dto.getId());
        issueCategory.setProjectId(dto.getProjectId());
        issueCategory.setName(dto.getName());
        issueCategory.setAssignedToId(dto.getAssignedToId());
        return issueCategory;
    }
}

