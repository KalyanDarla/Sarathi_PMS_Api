package com.sarathi.support.controller;

import com.sarathi.support.dto.CustomFieldsRoleDTO;
import com.sarathi.support.service.CustomFieldsRoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/custom-fields-roles")
public class CustomFieldsRoleController {

    private final CustomFieldsRoleService service;

     
    public CustomFieldsRoleController(CustomFieldsRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomFieldsRoleDTO> getAllCustomFieldsRoles() {
        return service.getAllCustomFieldsRoles();
    }

    @GetMapping("/{id}")
    public Optional<CustomFieldsRoleDTO> getCustomFieldsRoleById(@PathVariable Integer id) {
        return service.getCustomFieldsRoleById(id);
    }

    @PostMapping
    public CustomFieldsRoleDTO saveCustomFieldsRole(@RequestBody CustomFieldsRoleDTO dto) {
        return service.saveCustomFieldsRole(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomFieldsRole(@PathVariable Integer id) {
        service.deleteCustomFieldsRole(id);
    }
}
