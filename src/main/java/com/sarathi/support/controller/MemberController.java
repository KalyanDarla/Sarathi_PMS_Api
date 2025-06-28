package com.sarathi.support.controller;

import com.sarathi.support.dto.MemberDTO;
import com.sarathi.support.dto.UserDTO;
import com.sarathi.support.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberService service;

     
    public MemberController(MemberService service) {
        this.service = service;
    }

    @GetMapping
    public List<MemberDTO> getAllMembers() {
        return service.getAllMembers();
    }

    /*
    @GetMapping("/{id}")
    public Optional<MemberDTO> getMemberById(@PathVariable Integer id) {
        return service.getMemberById(id);
    }
*/
    @PostMapping
    public MemberDTO saveMember(@RequestBody MemberDTO dto) {
        return service.saveMember(dto);
    }

    @PutMapping("/{id}")
    public MemberDTO updateMember(@PathVariable Integer id, @RequestBody MemberDTO dto) {
        return service.updateMember(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable Integer id) {
        service.deleteMember(id);
    }
    
    @GetMapping("/{projectId}")
    public List<UserDTO> getUsersByProjectId(@PathVariable Integer projectId) {
        return service.getUsersByProjectId(projectId);
    }
}

