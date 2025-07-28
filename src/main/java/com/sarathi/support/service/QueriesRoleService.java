package com.sarathi.support.service;

import com.sarathi.support.dto.QueriesRoleDTO;
import com.sarathi.support.entity.QueriesRole;
import com.sarathi.support.repository.QueriesRoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QueriesRoleService {

    private final QueriesRoleRepository repository;

     
    public QueriesRoleService(QueriesRoleRepository repository) {
        this.repository = repository;
    }

    public List<QueriesRoleDTO> getAllQueriesRoles() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<QueriesRoleDTO> getQueriesRoleById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public QueriesRoleDTO saveQueriesRole(QueriesRoleDTO dto) {
        QueriesRole queriesRole = convertToEntity(dto);
        QueriesRole savedQueriesRole = repository.save(queriesRole);
        return convertToDTO(savedQueriesRole);
    }

    public QueriesRoleDTO updateQueriesRole(Integer id, QueriesRoleDTO dto) {
        Optional<QueriesRole> existingRoleOpt = repository.findById(id);
        if (existingRoleOpt.isPresent()) {
            QueriesRole existingRole = existingRoleOpt.get();
            existingRole.setQueryId(dto.getQueryId());
            existingRole.setRoleId(dto.getRoleId());

            QueriesRole updatedRole = repository.save(existingRole);
            return convertToDTO(updatedRole);
        } else {
            throw new RuntimeException("QueriesRole with ID " + id + " not found.");
        }
    }

    public void deleteQueriesRole(Integer id) {
        repository.deleteById(id);
    }

    private QueriesRoleDTO convertToDTO(QueriesRole queriesRole) {
        return new QueriesRoleDTO(
                queriesRole.getQueryId(),
                queriesRole.getRoleId()
        );
    }

    private QueriesRole convertToEntity(QueriesRoleDTO dto) {
        QueriesRole queriesRole = new QueriesRole();
        queriesRole.setQueryId(dto.getQueryId());
        queriesRole.setRoleId(dto.getRoleId());
        return queriesRole;
    }
}

