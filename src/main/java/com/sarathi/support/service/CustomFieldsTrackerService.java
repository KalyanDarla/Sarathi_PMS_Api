package com.sarathi.support.service;

import com.sarathi.support.dto.CustomFieldsTrackerDTO;
import com.sarathi.support.entity.CustomFieldsTracker;
import com.sarathi.support.repository.CustomFieldsTrackerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomFieldsTrackerService {

    private final CustomFieldsTrackerRepository repository;

     
    public CustomFieldsTrackerService(CustomFieldsTrackerRepository repository) {
        this.repository = repository;
    }

    public List<CustomFieldsTrackerDTO> getAllCustomFieldsTrackers() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<CustomFieldsTrackerDTO> getCustomFieldsTrackerById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public CustomFieldsTrackerDTO saveCustomFieldsTracker(CustomFieldsTrackerDTO dto) {
        CustomFieldsTracker customFieldsTracker = convertToEntity(dto);
        CustomFieldsTracker savedTracker = repository.save(customFieldsTracker);
        return convertToDTO(savedTracker);
    }

    public void deleteCustomFieldsTracker(Integer id) {
        repository.deleteById(id);
    }

    private CustomFieldsTrackerDTO convertToDTO(CustomFieldsTracker entity) {
        return new CustomFieldsTrackerDTO(
                entity.getCustomFieldId(),
                entity.getTrackerId()
        );
    }

    private CustomFieldsTracker convertToEntity(CustomFieldsTrackerDTO dto) {
        CustomFieldsTracker entity = new CustomFieldsTracker();
        entity.setCustomFieldId(dto.getCustomFieldId());
        entity.setTrackerId(dto.getTrackerId());
        return entity;
    }
}
