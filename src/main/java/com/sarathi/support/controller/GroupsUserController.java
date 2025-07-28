package com.sarathi.support.controller;

import com.sarathi.support.dto.GroupsUserDTO;
import com.sarathi.support.service.GroupsUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/groups-users")
public class GroupsUserController {

    private final GroupsUserService service;

     public GroupsUserController(GroupsUserService service) {
        this.service = service;
    }

    @GetMapping
    public List<GroupsUserDTO> getAllGroupsUsers() {
        return service.getAllGroupsUsers();
    }

    @GetMapping("/{id}")
    public Optional<GroupsUserDTO> getGroupsUserById(@PathVariable Integer id) {
        return service.getGroupsUserById(id);
    }

    @PostMapping
    public GroupsUserDTO saveGroupsUser(@RequestBody GroupsUserDTO dto) {
        return service.saveGroupsUser(dto);
    }

    @PutMapping("/{id}")
    public GroupsUserDTO updateGroupsUser(@PathVariable Integer id, @RequestBody GroupsUserDTO dto) {
        return service.updateGroupsUser(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteGroupsUser(@PathVariable Integer id) {
        service.deleteGroupsUser(id);
    }
}
