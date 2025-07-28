package com.sarathi.support.service;

import com.sarathi.support.dto.MemberRoleDTO;
import com.sarathi.support.entity.MemberRole;
import com.sarathi.support.repository.MemberRoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MemberRoleService {

    private final MemberRoleRepository repository;

     
    public MemberRoleService(MemberRoleRepository repository) {
        this.repository = repository;
    }

    public List<MemberRoleDTO> getAllMemberRoles() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<MemberRoleDTO> getMemberRoleById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public MemberRoleDTO saveMemberRole(MemberRoleDTO dto) {
        MemberRole memberRole = convertToEntity(dto);
        MemberRole savedMemberRole = repository.save(memberRole);
        return convertToDTO(savedMemberRole);
    }

    public MemberRoleDTO updateMemberRole(Integer id, MemberRoleDTO dto) {
        Optional<MemberRole> existingMemberRoleOpt = repository.findById(id);
        if (existingMemberRoleOpt.isPresent()) {
            MemberRole existingMemberRole = existingMemberRoleOpt.get();
            existingMemberRole.setMemberId(dto.getMemberId());
            existingMemberRole.setRoleId(dto.getRoleId());
            existingMemberRole.setInheritedFrom(dto.getInheritedFrom());

            MemberRole updatedMemberRole = repository.save(existingMemberRole);
            return convertToDTO(updatedMemberRole);
        } else {
            throw new RuntimeException("MemberRole with ID " + id + " not found.");
        }
    }

    public void deleteMemberRole(Integer id) {
        repository.deleteById(id);
    }

    private MemberRoleDTO convertToDTO(MemberRole memberRole) {
        return new MemberRoleDTO(
                memberRole.getId(),
                memberRole.getMemberId(),
                memberRole.getRoleId(),
                memberRole.getInheritedFrom()
        );
    }

    private MemberRole convertToEntity(MemberRoleDTO dto) {
        MemberRole memberRole = new MemberRole();
        memberRole.setId(dto.getId());
        memberRole.setMemberId(dto.getMemberId());
        memberRole.setRoleId(dto.getRoleId());
        memberRole.setInheritedFrom(dto.getInheritedFrom());
        return memberRole;
    }
}

