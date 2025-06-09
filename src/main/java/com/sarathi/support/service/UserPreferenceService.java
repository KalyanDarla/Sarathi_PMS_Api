package com.sarathi.support.service;

import com.sarathi.support.dto.UserPreferenceDTO;
import com.sarathi.support.entity.UserPreference;
import com.sarathi.support.repository.UserPreferenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserPreferenceService {

    private final UserPreferenceRepository repository;

     
    public UserPreferenceService(UserPreferenceRepository repository) {
        this.repository = repository;
    }

    public List<UserPreferenceDTO> getAllUserPreferences() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<UserPreferenceDTO> getUserPreferenceById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public UserPreferenceDTO saveUserPreference(UserPreferenceDTO dto) {
        UserPreference userPreference = convertToEntity(dto);
        UserPreference savedUserPreference = repository.save(userPreference);
        return convertToDTO(savedUserPreference);
    }

    public UserPreferenceDTO updateUserPreference(Integer id, UserPreferenceDTO dto) {
        Optional<UserPreference> existingPreferenceOpt = repository.findById(id);
        if (existingPreferenceOpt.isPresent()) {
            UserPreference existingPreference = existingPreferenceOpt.get();
            existingPreference.setUserId(dto.getUserId());
            existingPreference.setOthers(dto.getOthers());
            existingPreference.setHideMail(dto.getHideMail());
            existingPreference.setTimeZone(dto.getTimeZone());

            UserPreference updatedPreference = repository.save(existingPreference);
            return convertToDTO(updatedPreference);
        } else {
            throw new RuntimeException("UserPreference with ID " + id + " not found.");
        }
    }

    public void deleteUserPreference(Integer id) {
        repository.deleteById(id);
    }

    private UserPreferenceDTO convertToDTO(UserPreference userPreference) {
        return new UserPreferenceDTO(
                userPreference.getId(),
                userPreference.getUserId(),
                userPreference.getOthers(),
                userPreference.getHideMail(),
                userPreference.getTimeZone()
        );
    }

    private UserPreference convertToEntity(UserPreferenceDTO dto) {
        UserPreference userPreference = new UserPreference();
        userPreference.setId(dto.getId());
        userPreference.setUserId(dto.getUserId());
        userPreference.setOthers(dto.getOthers());
        userPreference.setHideMail(dto.getHideMail());
        userPreference.setTimeZone(dto.getTimeZone());
        return userPreference;
    }
}

