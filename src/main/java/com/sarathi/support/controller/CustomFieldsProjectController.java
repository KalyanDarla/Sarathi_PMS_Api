package com.sarathi.support.controller;

import com.sarathi.support.dto.CustomFieldsProjectDTO;
import com.sarathi.support.service.CustomFieldsProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/custom-fields-projects")
public class CustomFieldsProjectController {

    private final CustomFieldsProjectService service;

     public CustomFieldsProjectController(CustomFieldsProjectService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomFieldsProjectDTO> getAllCustomFieldsProjects() {
        return service.getAllCustomFieldsProjects();
    }

    @GetMapping("/{id}")
    public Optional<CustomFieldsProjectDTO> getCustomFieldsProjectById(@PathVariable Integer id) {
        return service.getCustomFieldsProjectById(id);
    }

    @PostMapping
    public CustomFieldsProjectDTO saveCustomFieldsProject(@RequestBody CustomFieldsProjectDTO dto) {
        return service.saveCustomFieldsProject(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomFieldsProject(@PathVariable Integer id) {
        service.deleteCustomFieldsProject(id);
    }
}
