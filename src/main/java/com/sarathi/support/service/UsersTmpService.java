package com.sarathi.support.service;

import com.sarathi.support.dto.UsersTmpDTO;
import com.sarathi.support.entity.UsersTmp;
import com.sarathi.support.repository.UsersTmpRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsersTmpService {

    private final UsersTmpRepository repository;

     
    public UsersTmpService(UsersTmpRepository repository) {
        this.repository = repository;
    }

    public List<UsersTmpDTO> getAllUsersTmp() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<UsersTmpDTO> getUsersTmpById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public UsersTmpDTO saveUsersTmp(UsersTmpDTO dto) {
        UsersTmp usersTmp = convertToEntity(dto);

        UsersTmp savedUsersTmp = repository.save(usersTmp);
        return convertToDTO(savedUsersTmp);
    }

    public UsersTmpDTO updateUsersTmp(Integer id, UsersTmpDTO dto) {
        Optional<UsersTmp> existingUsersTmpOpt = repository.findById(id);
        if (existingUsersTmpOpt.isPresent()) {
            UsersTmp existingUsersTmp = existingUsersTmpOpt.get();
            existingUsersTmp.setLogin(dto.getLogin());
            existingUsersTmp.setHashedPassword(dto.getHashedPassword());
            existingUsersTmp.setFirstname(dto.getFirstname());
            existingUsersTmp.setLastname(dto.getLastname());
            existingUsersTmp.setAdmin(dto.getAdmin());
            existingUsersTmp.setStatus(dto.getStatus());
            existingUsersTmp.setLastLoginOn(dto.getLastLoginOn());
            existingUsersTmp.setLanguage(dto.getLanguage());
            existingUsersTmp.setAuthSourceId(dto.getAuthSourceId());
            existingUsersTmp.setType(dto.getType());
            existingUsersTmp.setIdentityUrl(dto.getIdentityUrl());
            existingUsersTmp.setMailNotification(dto.getMailNotification());
            existingUsersTmp.setSalt(dto.getSalt());
            existingUsersTmp.setMustChangePasswd(dto.getMustChangePasswd());
            existingUsersTmp.setPasswdChangedOn(dto.getPasswdChangedOn());
            existingUsersTmp.setUpdatedOn(Instant.now());

            UsersTmp updatedUsersTmp = repository.save(existingUsersTmp);
            return convertToDTO(updatedUsersTmp);
        } else {
            throw new RuntimeException("UsersTmp with ID " + id + " not found.");
        }
    }

    public void deleteUsersTmp(Integer id) {
        repository.deleteById(id);
    }

    private UsersTmpDTO convertToDTO(UsersTmp usersTmp) {
        return new UsersTmpDTO(
                usersTmp.getId(),
                usersTmp.getLogin(),
                usersTmp.getHashedPassword(),
                usersTmp.getFirstname(),
                usersTmp.getLastname(),
                usersTmp.getAdmin(),
                usersTmp.getStatus(),
                usersTmp.getLastLoginOn(),
                usersTmp.getLanguage(),
                usersTmp.getAuthSourceId(),
                usersTmp.getCreatedOn(),
                usersTmp.getUpdatedOn(),
                usersTmp.getType(),
                usersTmp.getIdentityUrl(),
                usersTmp.getMailNotification(),
                usersTmp.getSalt(),
                usersTmp.getMustChangePasswd(),
                usersTmp.getPasswdChangedOn()
        );
    }

    private UsersTmp convertToEntity(UsersTmpDTO dto) {
        UsersTmp usersTmp = new UsersTmp();
        usersTmp.setId(dto.getId());
        usersTmp.setLogin(dto.getLogin());
        usersTmp.setHashedPassword(dto.getHashedPassword());
        usersTmp.setFirstname(dto.getFirstname());
        usersTmp.setLastname(dto.getLastname());
        usersTmp.setAdmin(dto.getAdmin());
        usersTmp.setStatus(dto.getStatus());
        usersTmp.setLastLoginOn(dto.getLastLoginOn());
        usersTmp.setLanguage(dto.getLanguage());
        usersTmp.setAuthSourceId(dto.getAuthSourceId());
        usersTmp.setCreatedOn(Instant.now());
        usersTmp.setUpdatedOn(Instant.now());
        usersTmp.setType(dto.getType());
        usersTmp.setIdentityUrl(dto.getIdentityUrl());
        usersTmp.setMailNotification(dto.getMailNotification());
        return usersTmp;
    }
}
