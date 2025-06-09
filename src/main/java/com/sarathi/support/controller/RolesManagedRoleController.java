package com.sarathi.support.controller;

import com.sarathi.support.dto.RolesManagedRoleDTO;
import com.sarathi.support.service.RolesManagedRoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roles-managed-roles")
public class RolesManagedRoleController {

    private final RolesManagedRoleService service;

     
    public RolesManagedRoleController(RolesManagedRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<RolesManagedRoleDTO> getAllRolesManagedRoles() {
        return service.getAllRolesManagedRoles();
    }

    @GetMapping("/{id}")
    public Optional<RolesManagedRoleDTO> getRolesManagedRoleById(@PathVariable Integer id) {
        return service.getRolesManagedRoleById(id);
    }

    @PostMapping
    public RolesManagedRoleDTO saveRolesManagedRole(@RequestBody RolesManagedRoleDTO dto) {
        return service.saveRolesManagedRole(dto);
    }

    @PutMapping("/{id}")
    public RolesManagedRoleDTO updateRolesManagedRole(@PathVariable Integer id, @RequestBody RolesManagedRoleDTO dto) {
        return service.updateRolesManagedRole(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteRolesManagedRole(@PathVariable Integer id) {
        service.deleteRolesManagedRole(id);
    }
}
