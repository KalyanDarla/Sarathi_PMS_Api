package com.sarathi.support.controller;

import com.sarathi.support.dto.TimeEntryDTO;
import com.sarathi.support.service.TimeEntryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/time-entries")
public class TimeEntryController {

    private final TimeEntryService service;

     
    public TimeEntryController(TimeEntryService service) {
        this.service = service;
    }

    @GetMapping
    public List<TimeEntryDTO> getAllTimeEntries() {
        return service.getAllTimeEntries();
    }

    @GetMapping("/{id}")
    public Optional<TimeEntryDTO> getTimeEntryById(@PathVariable Integer id) {
        return service.getTimeEntryById(id);
    }

    @PostMapping
    public TimeEntryDTO saveTimeEntry(@RequestBody TimeEntryDTO dto) {
        return service.saveTimeEntry(dto);
    }

    @PutMapping("/{id}")
    public TimeEntryDTO updateTimeEntry(@PathVariable Integer id, @RequestBody TimeEntryDTO dto) {
        return service.updateTimeEntry(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteTimeEntry(@PathVariable Integer id) {
        service.deleteTimeEntry(id);
    }
}
