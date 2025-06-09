package com.sarathi.support.service;

import com.sarathi.support.dto.GroupsUserDTO;
import com.sarathi.support.entity.GroupsUser;
import com.sarathi.support.repository.GroupsUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GroupsUserService {

    private final GroupsUserRepository repository;

     public GroupsUserService(GroupsUserRepository repository) {
        this.repository = repository;
    }

    public List<GroupsUserDTO> getAllGroupsUsers() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<GroupsUserDTO> getGroupsUserById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public GroupsUserDTO saveGroupsUser(GroupsUserDTO dto) {
        GroupsUser groupsUser = convertToEntity(dto);
        GroupsUser savedGroupsUser = repository.save(groupsUser);
        return convertToDTO(savedGroupsUser);
    }

    public GroupsUserDTO updateGroupsUser(Integer id, GroupsUserDTO dto) {
        Optional<GroupsUser> existingGroupsUserOpt = repository.findById(id);
        if (existingGroupsUserOpt.isPresent()) {
            GroupsUser existingGroupsUser = existingGroupsUserOpt.get();
            existingGroupsUser.setGroupId(dto.getGroupId());
            existingGroupsUser.setUserId(dto.getUserId());

            GroupsUser updatedGroupsUser = repository.save(existingGroupsUser);
            return convertToDTO(updatedGroupsUser);
        } else {
            throw new RuntimeException("GroupsUser with ID " + id + " not found.");
        }
    }

    public void deleteGroupsUser(Integer id) {
        repository.deleteById(id);
    }

    private GroupsUserDTO convertToDTO(GroupsUser groupsUser) {
        return new GroupsUserDTO(
                groupsUser.getGroupId(),
                groupsUser.getUserId()
        );
    }

    private GroupsUser convertToEntity(GroupsUserDTO dto) {
        GroupsUser groupsUser = new GroupsUser();
        groupsUser.setGroupId(dto.getGroupId());
        groupsUser.setUserId(dto.getUserId());
        return groupsUser;
    }
}
