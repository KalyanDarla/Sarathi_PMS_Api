package com.sarathi.support.controller;

import com.sarathi.support.dto.TrackerDTO;
import com.sarathi.support.service.TrackerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trackers")
public class TrackerController {

    private final TrackerService service;

     
    public TrackerController(TrackerService service) {
        this.service = service;
    }

    @GetMapping
    public List<TrackerDTO> getAllTrackers() {
        return service.getAllTrackers();
    }

    @GetMapping("/{id}")
    public Optional<TrackerDTO> getTrackerById(@PathVariable Integer id) {
        return service.getTrackerById(id);
    }

    @PostMapping
    public TrackerDTO saveTracker(@RequestBody TrackerDTO dto) {
        return service.saveTracker(dto);
    }

    @PutMapping("/{id}")
    public TrackerDTO updateTracker(@PathVariable Integer id, @RequestBody TrackerDTO dto) {
        return service.updateTracker(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteTracker(@PathVariable Integer id) {
        service.deleteTracker(id);
    }
}

