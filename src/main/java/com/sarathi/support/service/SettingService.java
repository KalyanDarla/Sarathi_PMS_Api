package com.sarathi.support.service;

import com.sarathi.support.dto.SettingDTO;
import com.sarathi.support.entity.Setting;
import com.sarathi.support.repository.SettingRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SettingService {

    private final SettingRepository repository;

     
    public SettingService(SettingRepository repository) {
        this.repository = repository;
    }

    public List<SettingDTO> getAllSettings() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<SettingDTO> getSettingById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public SettingDTO saveSetting(SettingDTO dto) {
        Setting setting = convertToEntity(dto);
        setting.setUpdatedOn(Instant.now());
        Setting savedSetting = repository.save(setting);
        return convertToDTO(savedSetting);
    }

    public SettingDTO updateSetting(Integer id, SettingDTO dto) {
        Optional<Setting> existingSettingOpt = repository.findById(id);
        if (existingSettingOpt.isPresent()) {
            Setting existingSetting = existingSettingOpt.get();
            existingSetting.setName(dto.getName());
            existingSetting.setValue(dto.getValue());
            existingSetting.setUpdatedOn(Instant.now());

            Setting updatedSetting = repository.save(existingSetting);
            return convertToDTO(updatedSetting);
        } else {
            throw new RuntimeException("Setting with ID " + id + " not found.");
        }
    }

    public void deleteSetting(Integer id) {
        repository.deleteById(id);
    }

    private SettingDTO convertToDTO(Setting setting) {
        return new SettingDTO(
                setting.getId(),
                setting.getName(),
                setting.getValue(),
                setting.getUpdatedOn()
        );
    }

    private Setting convertToEntity(SettingDTO dto) {
        Setting setting = new Setting();
        setting.setId(dto.getId());
        setting.setName(dto.getName());
        setting.setValue(dto.getValue());
        setting.setUpdatedOn(dto.getUpdatedOn());
        return setting;
    }
}

