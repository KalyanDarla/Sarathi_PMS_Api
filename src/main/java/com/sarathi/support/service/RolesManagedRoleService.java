package com.sarathi.support.service;

import com.sarathi.support.dto.RolesManagedRoleDTO;
import com.sarathi.support.entity.RolesManagedRole;
import com.sarathi.support.repository.RolesManagedRoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RolesManagedRoleService {

    private final RolesManagedRoleRepository repository;

     
    public RolesManagedRoleService(RolesManagedRoleRepository repository) {
        this.repository = repository;
    }

    public List<RolesManagedRoleDTO> getAllRolesManagedRoles() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<RolesManagedRoleDTO> getRolesManagedRoleById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public RolesManagedRoleDTO saveRolesManagedRole(RolesManagedRoleDTO dto) {
        RolesManagedRole rolesManagedRole = convertToEntity(dto);
        RolesManagedRole savedRolesManagedRole = repository.save(rolesManagedRole);
        return convertToDTO(savedRolesManagedRole);
    }

    public RolesManagedRoleDTO updateRolesManagedRole(Integer id, RolesManagedRoleDTO dto) {
        Optional<RolesManagedRole> existingRolesManagedRoleOpt = repository.findById(id);
        if (existingRolesManagedRoleOpt.isPresent()) {
            RolesManagedRole existingRolesManagedRole = existingRolesManagedRoleOpt.get();
            existingRolesManagedRole.setRoleId(dto.getRoleId());
            existingRolesManagedRole.setManagedRoleId(dto.getManagedRoleId());

            RolesManagedRole updatedRolesManagedRole = repository.save(existingRolesManagedRole);
            return convertToDTO(updatedRolesManagedRole);
        } else {
            throw new RuntimeException("RolesManagedRole with ID " + id + " not found.");
        }
    }

    public void deleteRolesManagedRole(Integer id) {
        repository.deleteById(id);
    }

    private RolesManagedRoleDTO convertToDTO(RolesManagedRole rolesManagedRole) {
        return new RolesManagedRoleDTO(
                rolesManagedRole.getRoleId(),
                rolesManagedRole.getManagedRoleId()
        );
    }

    private RolesManagedRole convertToEntity(RolesManagedRoleDTO dto) {
        RolesManagedRole rolesManagedRole = new RolesManagedRole();
        rolesManagedRole.setRoleId(dto.getRoleId());
        rolesManagedRole.setManagedRoleId(dto.getManagedRoleId());
        return rolesManagedRole;
    }
}
