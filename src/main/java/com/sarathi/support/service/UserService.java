package com.sarathi.support.service;

import com.sarathi.support.dto.UserDTO;
import com.sarathi.support.entity.User;
import com.sarathi.support.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository repository;
    //private final PasswordEncoder passwordEncoder;
     
    public UserService(UserRepository repository ) {
        this.repository = repository;
     }

    public List<UserDTO> getAllUsers() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<UserDTO> getUserById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public UserDTO saveUser(UserDTO dto) {
         User user = convertToEntity(dto);
         User  savedUser = repository.save(user);
         return convertToDTO(savedUser);
    }

    public UserDTO updateUser(Integer id, UserDTO dto) {
        Optional<User> existingUserOpt = repository.findById(id);
        if (existingUserOpt.isPresent()) {
            User existingUser = existingUserOpt.get();
            existingUser.setLogin(dto.getLogin());
            existingUser.setHashedPassword(dto.getHashedPassword());
            existingUser.setFirstname(dto.getFirstname());
            existingUser.setLastname(dto.getLastname());
            existingUser.setAdmin(dto.getAdmin());
            existingUser.setStatus(dto.getStatus());
            existingUser.setLastLoginOn(Timestamp.valueOf(LocalDateTime.now()));
            existingUser.setLanguage(dto.getLanguage());
            existingUser.setAuthSourceId(dto.getAuthSourceId());
            existingUser.setType(dto.getType());
            existingUser.setIdentityUrl(dto.getIdentityUrl());
            existingUser.setMailNotification(dto.getMailNotification());
            existingUser.setSalt(dto.getSalt());
            existingUser.setMustChangePasswd(dto.getMustChangePasswd());
            existingUser.setPasswdChangedOn(Timestamp.valueOf(LocalDateTime.now()));
            existingUser.setUpdatedOn(Timestamp.valueOf(LocalDateTime.now()));

            User updatedUser = repository.save(existingUser);
            return convertToDTO(updatedUser);
        } else {
            throw new RuntimeException("User with ID " + id + " not found.");
        }
    }

    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }

    private UserDTO convertToDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getLogin(),
                user.getHashedPassword(),
                user.getFirstname(),
                user.getLastname(),
                user.getAdmin(),
                user.getStatus(),
                user.getLastLoginOn(),
                user.getLanguage(),
                user.getAuthSourceId(),
                user.getCreatedOn(),
                user.getUpdatedOn(),
                user.getType(),
                user.getIdentityUrl(),
                user.getMailNotification(),
                user.getSalt(),
                user.getMustChangePasswd(),
                user.getPasswdChangedOn()
        );
    }

    private User convertToEntity(UserDTO dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setLogin(dto.getLogin());
        user.setHashedPassword(dto.getHashedPassword());
        user.setFirstname(dto.getFirstname());
        user.setLastname(dto.getLastname());
        user.setAdmin(dto.getAdmin());
        user.setStatus(dto.getStatus());
        user.setLastLoginOn(dto.getLastLoginOn());
        user.setLanguage(dto.getLanguage());
        user.setAuthSourceId(dto.getAuthSourceId());
        user.setCreatedOn(Timestamp.valueOf(LocalDateTime.now()));
        user.setUpdatedOn(Timestamp.valueOf(LocalDateTime.now()));
        user.setType(dto.getType());
        user.setIdentityUrl(dto.getIdentityUrl());
        user.setMailNotification(dto.getMailNotification());
        user.setSalt(dto.getSalt());
        user.setMustChangePasswd(dto.getMustChangePasswd());
        user.setPasswdChangedOn(dto.getPasswdChangedOn());
        return user;
    }

    public List<String> getAllUserNames() {
        List<String> userNames = repository.findByLogin() ;
        if (userNames.isEmpty()) {
            throw new RuntimeException("No users Names are found");
        }
        return userNames;
    }
}
