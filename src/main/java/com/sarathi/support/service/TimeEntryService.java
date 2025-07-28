package com.sarathi.support.service;

import com.sarathi.support.dto.TimeEntryDTO;
import com.sarathi.support.entity.TimeEntry;
import com.sarathi.support.repository.TimeEntryRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TimeEntryService {

    private final TimeEntryRepository repository;

     
    public TimeEntryService(TimeEntryRepository repository) {
        this.repository = repository;
    }

    public List<TimeEntryDTO> getAllTimeEntries() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<TimeEntryDTO> getTimeEntryById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public TimeEntryDTO saveTimeEntry(TimeEntryDTO dto) {
        TimeEntry timeEntry = convertToEntity(dto);
        timeEntry.setCreatedOn(Instant.now());
        timeEntry.setUpdatedOn(Instant.now());
        TimeEntry savedTimeEntry = repository.save(timeEntry);
        return convertToDTO(savedTimeEntry);
    }

    public TimeEntryDTO updateTimeEntry(Integer id, TimeEntryDTO dto) {
        Optional<TimeEntry> existingTimeEntryOpt = repository.findById(id);
        if (existingTimeEntryOpt.isPresent()) {
            TimeEntry existingTimeEntry = existingTimeEntryOpt.get();
            existingTimeEntry.setProjectId(dto.getProjectId());
            existingTimeEntry.setUserId(dto.getUserId());
            existingTimeEntry.setIssueId(dto.getIssueId());
            existingTimeEntry.setHours(dto.getHours());
            existingTimeEntry.setComments(dto.getComments());
            existingTimeEntry.setActivityId(dto.getActivityId());
            existingTimeEntry.setSpentOn(dto.getSpentOn());
            existingTimeEntry.setTyear(dto.getTyear());
            existingTimeEntry.setTmonth(dto.getTmonth());
            existingTimeEntry.setTweek(dto.getTweek());
            existingTimeEntry.setUpdatedOn(Instant.now());

            TimeEntry updatedTimeEntry = repository.save(existingTimeEntry);
            return convertToDTO(updatedTimeEntry);
        } else {
            throw new RuntimeException("TimeEntry with ID " + id + " not found.");
        }
    }

    public void deleteTimeEntry(Integer id) {
        repository.deleteById(id);
    }

    private TimeEntryDTO convertToDTO(TimeEntry timeEntry) {
        return new TimeEntryDTO(
                timeEntry.getId(),
                timeEntry.getProjectId(),
                timeEntry.getUserId(),
                timeEntry.getIssueId(),
                timeEntry.getHours(),
                timeEntry.getComments(),
                timeEntry.getActivityId(),
                timeEntry.getSpentOn(),
                timeEntry.getTyear(),
                timeEntry.getTmonth(),
                timeEntry.getTweek(),
                timeEntry.getCreatedOn(),
                timeEntry.getUpdatedOn()
        );
    }

    private TimeEntry convertToEntity(TimeEntryDTO dto) {
        TimeEntry timeEntry = new TimeEntry();
        timeEntry.setId(dto.getId());
        timeEntry.setProjectId(dto.getProjectId());
        timeEntry.setUserId(dto.getUserId());
        timeEntry.setIssueId(dto.getIssueId());
        timeEntry.setHours(dto.getHours());
        timeEntry.setComments(dto.getComments());
        timeEntry.setActivityId(dto.getActivityId());
        timeEntry.setSpentOn(dto.getSpentOn());
        timeEntry.setTyear(dto.getTyear());
        timeEntry.setTmonth(dto.getTmonth());
        timeEntry.setTweek(dto.getTweek());
        return timeEntry;
    }
}
