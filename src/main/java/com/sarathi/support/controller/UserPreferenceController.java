package com.sarathi.support.controller;

import com.sarathi.support.dto.UserPreferenceDTO;
import com.sarathi.support.service.UserPreferenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user-preferences")
public class UserPreferenceController {

    private final UserPreferenceService service;

     
    public UserPreferenceController(UserPreferenceService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserPreferenceDTO> getAllUserPreferences() {
        return service.getAllUserPreferences();
    }

    @GetMapping("/{id}")
    public Optional<UserPreferenceDTO> getUserPreferenceById(@PathVariable Integer id) {
        return service.getUserPreferenceById(id);
    }

    @PostMapping
    public UserPreferenceDTO saveUserPreference(@RequestBody UserPreferenceDTO dto) {
        return service.saveUserPreference(dto);
    }

    @PutMapping("/{id}")
    public UserPreferenceDTO updateUserPreference(@PathVariable Integer id, @RequestBody UserPreferenceDTO dto) {
        return service.updateUserPreference(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteUserPreference(@PathVariable Integer id) {
        service.deleteUserPreference(id);
    }
}
