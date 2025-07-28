package com.sarathi.support.controller;

import com.sarathi.support.dto.RoleDTO;
import com.sarathi.support.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roles")
public class RoleController {

    private final RoleService service;

     
    public RoleController(RoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<RoleDTO> getAllRoles() {
        return service.getAllRoles();
    }

    @GetMapping("/{id}")
    public Optional<RoleDTO> getRoleById(@PathVariable Integer id) {
        return service.getRoleById(id);
    }

    @PostMapping
    public RoleDTO saveRole(@RequestBody RoleDTO dto) {
        return service.saveRole(dto);
    }

    @PutMapping("/{id}")
    public RoleDTO updateRole(@PathVariable Integer id, @RequestBody RoleDTO dto) {
        return service.updateRole(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Integer id) {
        service.deleteRole(id);
    }
}

