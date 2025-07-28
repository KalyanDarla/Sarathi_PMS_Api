package com.sarathi.support.controller;

import com.sarathi.support.dto.CustomFieldsTrackerDTO;
import com.sarathi.support.service.CustomFieldsTrackerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/custom-fields-trackers")
public class CustomFieldsTrackerController {

    private final CustomFieldsTrackerService service;

     
    public CustomFieldsTrackerController(CustomFieldsTrackerService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomFieldsTrackerDTO> getAllCustomFieldsTrackers() {
        return service.getAllCustomFieldsTrackers();
    }

    @GetMapping("/{id}")
    public Optional<CustomFieldsTrackerDTO> getCustomFieldsTrackerById(@PathVariable Integer id) {
        return service.getCustomFieldsTrackerById(id);
    }

    @PostMapping
    public CustomFieldsTrackerDTO saveCustomFieldsTracker(@RequestBody CustomFieldsTrackerDTO dto) {
        return service.saveCustomFieldsTracker(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomFieldsTracker(@PathVariable Integer id) {
        service.deleteCustomFieldsTracker(id);
    }
}
