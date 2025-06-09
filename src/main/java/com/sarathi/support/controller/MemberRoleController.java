package com.sarathi.support.controller;

import com.sarathi.support.dto.MemberRoleDTO;
import com.sarathi.support.service.MemberRoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/member-roles")
public class MemberRoleController {

    private final MemberRoleService service;

     public MemberRoleController(MemberRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<MemberRoleDTO> getAllMemberRoles() {
        return service.getAllMemberRoles();
    }

    @GetMapping("/{id}")
    public Optional<MemberRoleDTO> getMemberRoleById(@PathVariable Integer id) {
        return service.getMemberRoleById(id);
    }

    @PostMapping
    public MemberRoleDTO saveMemberRole(@RequestBody MemberRoleDTO dto) {
        return service.saveMemberRole(dto);
    }

    @PutMapping("/{id}")
    public MemberRoleDTO updateMemberRole(@PathVariable Integer id, @RequestBody MemberRoleDTO dto) {
        return service.updateMemberRole(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteMemberRole(@PathVariable Integer id) {
        service.deleteMemberRole(id);
    }
}

