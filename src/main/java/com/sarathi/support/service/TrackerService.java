package com.sarathi.support.service;

import com.sarathi.support.dto.TrackerDTO;
import com.sarathi.support.entity.Tracker;
import com.sarathi.support.repository.TrackerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TrackerService {

    private final TrackerRepository repository;

     
    public TrackerService(TrackerRepository repository) {
        this.repository = repository;
    }

    public List<TrackerDTO> getAllTrackers() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<TrackerDTO> getTrackerById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public TrackerDTO saveTracker(TrackerDTO dto) {
        Tracker tracker = convertToEntity(dto);
        Tracker savedTracker = repository.save(tracker);
        return convertToDTO(savedTracker);
    }

    public TrackerDTO updateTracker(Integer id, TrackerDTO dto) {
        Optional<Tracker> existingTrackerOpt = repository.findById(id);
        if (existingTrackerOpt.isPresent()) {
            Tracker existingTracker = existingTrackerOpt.get();
            existingTracker.setName(dto.getName());
            existingTracker.setIsInChlog(dto.getIsInChlog());
            existingTracker.setPosition(dto.getPosition());
            existingTracker.setIsInRoadmap(dto.getIsInRoadmap());
            existingTracker.setFieldsBits(dto.getFieldsBits());
            existingTracker.setDefaultStatusId(dto.getDefaultStatusId());

            Tracker updatedTracker = repository.save(existingTracker);
            return convertToDTO(updatedTracker);
        } else {
            throw new RuntimeException("Tracker with ID " + id + " not found.");
        }
    }

    public void deleteTracker(Integer id) {
        repository.deleteById(id);
    }

    private TrackerDTO convertToDTO(Tracker tracker) {
        return new TrackerDTO(
                tracker.getId(),
                tracker.getName(),
                tracker.getIsInChlog(),
                tracker.getPosition(),
                tracker.getIsInRoadmap(),
                tracker.getFieldsBits(),
                tracker.getDefaultStatusId()
        );
    }

    private Tracker convertToEntity(TrackerDTO dto) {
        Tracker tracker = new Tracker();
        tracker.setId(dto.getId());
        tracker.setName(dto.getName());
        tracker.setIsInChlog(dto.getIsInChlog());
        tracker.setPosition(dto.getPosition());
        tracker.setIsInRoadmap(dto.getIsInRoadmap());
        tracker.setFieldsBits(dto.getFieldsBits());
        tracker.setDefaultStatusId(dto.getDefaultStatusId());
        return tracker;
    }
}
