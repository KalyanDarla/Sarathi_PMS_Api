package com.sarathi.support.service;

import com.sarathi.support.dto.RoleDTO;
import com.sarathi.support.entity.Role;
import com.sarathi.support.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RoleService {

    private final RoleRepository repository;

     
    public RoleService(RoleRepository repository) {
        this.repository = repository;
    }

    public List<RoleDTO> getAllRoles() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<RoleDTO> getRoleById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public RoleDTO saveRole(RoleDTO dto) {
        Role role = convertToEntity(dto);
        Role savedRole = repository.save(role);
        return convertToDTO(savedRole);
    }

    public RoleDTO updateRole(Integer id, RoleDTO dto) {
        Optional<Role> existingRoleOpt = repository.findById(id);
        if (existingRoleOpt.isPresent()) {
            Role existingRole = existingRoleOpt.get();
            existingRole.setName(dto.getName());
            existingRole.setPosition(dto.getPosition());
            existingRole.setAssignable(dto.getAssignable());
            existingRole.setBuiltin(dto.getBuiltin());
            existingRole.setPermissions(dto.getPermissions());
            existingRole.setIssuesVisibility(dto.getIssuesVisibility());
            existingRole.setUsersVisibility(dto.getUsersVisibility());
            existingRole.setTimeEntriesVisibility(dto.getTimeEntriesVisibility());
            existingRole.setAllRolesManaged(dto.getAllRolesManaged());
            existingRole.setSettings(dto.getSettings());

            Role updatedRole = repository.save(existingRole);
            return convertToDTO(updatedRole);
        } else {
            throw new RuntimeException("Role with ID " + id + " not found.");
        }
    }

    public void deleteRole(Integer id) {
        repository.deleteById(id);
    }

    private RoleDTO convertToDTO(Role role) {
        return new RoleDTO(
                role.getId(),
                role.getName(),
                role.getPosition(),
                role.getAssignable(),
                role.getBuiltin(),
                role.getPermissions(),
                role.getIssuesVisibility(),
                role.getUsersVisibility(),
                role.getTimeEntriesVisibility(),
                role.getAllRolesManaged(),
                role.getSettings()
        );
    }

    private Role convertToEntity(RoleDTO dto) {
        Role role = new Role();
        role.setId(dto.getId());
        role.setName(dto.getName());
        role.setPosition(dto.getPosition());
        role.setAssignable(dto.getAssignable());
        role.setBuiltin(dto.getBuiltin());
        role.setPermissions(dto.getPermissions());
        role.setIssuesVisibility(dto.getIssuesVisibility());
        role.setUsersVisibility(dto.getUsersVisibility());
        role.setTimeEntriesVisibility(dto.getTimeEntriesVisibility());
        role.setAllRolesManaged(dto.getAllRolesManaged());
        role.setSettings(dto.getSettings());
        return role;
    }
}
