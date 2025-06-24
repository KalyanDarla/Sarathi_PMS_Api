package com.sarathi.support.service;

import com.sarathi.support.dto.MemberDTO;
import com.sarathi.support.entity.Member;
import com.sarathi.support.entity.User;
import com.sarathi.support.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MemberService {

    private final MemberRepository repository;

     
    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public List<MemberDTO> getAllMembers() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<MemberDTO> getMemberById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public MemberDTO saveMember(MemberDTO dto) {
        Member member = convertToEntity(dto);
        member.setCreatedOn(Instant.now());
        Member savedMember = repository.save(member);
        return convertToDTO(savedMember);
    }
    
    public List<String> getUsersByProjectId(Integer projectId){
    	return repository.findByprojectId(projectId);
    }

    public MemberDTO updateMember(Integer id, MemberDTO dto) {
        Optional<Member> existingMemberOpt = repository.findById(id);
        if (existingMemberOpt.isPresent()) {
            Member existingMember = existingMemberOpt.get();
            existingMember.setUserId(dto.getUserId());
            existingMember.setProjectId(dto.getProjectId());
            existingMember.setMailNotification(dto.getMailNotification());
            existingMember.setCreatedOn(Instant.now());

            Member updatedMember = repository.save(existingMember);
            return convertToDTO(updatedMember);
        } else {
            throw new RuntimeException("Member with ID " + id + " not found.");
        }
    }

    public void deleteMember(Integer id) {
        repository.deleteById(id);
    }

    private MemberDTO convertToDTO(Member member) {
        return new MemberDTO(
                member.getId(),
                member.getUserId(),
                member.getProjectId(),
                member.getCreatedOn(),
                member.getMailNotification()
        );
    }

    private Member convertToEntity(MemberDTO dto) {
        Member member = new Member();
        member.setId(dto.getId());
        member.setUserId(dto.getUserId());
        member.setProjectId(dto.getProjectId());
        member.setCreatedOn(dto.getCreatedOn());
        member.setMailNotification(dto.getMailNotification());
        return member;
    }
}

