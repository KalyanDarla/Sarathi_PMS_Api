package com.sarathi.support.controller;

import com.sarathi.support.dto.QueriesRoleDTO;
import com.sarathi.support.service.QueriesRoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/queries-roles")
public class QueriesRoleController {

    private final QueriesRoleService service;

     
    public QueriesRoleController(QueriesRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<QueriesRoleDTO> getAllQueriesRoles() {
        return service.getAllQueriesRoles();
    }

    @GetMapping("/{id}")
    public Optional<QueriesRoleDTO> getQueriesRoleById(@PathVariable Integer id) {
        return service.getQueriesRoleById(id);
    }

    @PostMapping
    public QueriesRoleDTO saveQueriesRole(@RequestBody QueriesRoleDTO dto) {
        return service.saveQueriesRole(dto);
    }

    @PutMapping("/{id}")
    public QueriesRoleDTO updateQueriesRole(@PathVariable Integer id, @RequestBody QueriesRoleDTO dto) {
        return service.updateQueriesRole(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteQueriesRole(@PathVariable Integer id) {
        service.deleteQueriesRole(id);
    }
}

