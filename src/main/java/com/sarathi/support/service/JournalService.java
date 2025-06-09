package com.sarathi.support.service;

import com.sarathi.support.dto.JournalDTO;
import com.sarathi.support.entity.Journal;
import com.sarathi.support.repository.JournalRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


@Service
public class JournalService {

    private final JournalRepository repository;

     
    public JournalService(JournalRepository repository) {
        this.repository = repository;
    }

    public List<JournalDTO> getAllJournals() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<JournalDTO> getJournalById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public JournalDTO saveJournal(JournalDTO dto) {
        Journal journal = convertToEntity(dto);
        journal.setCreatedOn(Timestamp.valueOf(LocalDateTime.now()));
        //journal.setCreatedOn(dto.getCreatedOn() != null ? Timestamp.valueOf(dto.getCreatedOn().toLocalDateTime()) : null);

        Journal savedJournal = repository.save(journal);
        return convertToDTO(savedJournal);
    }

    public JournalDTO updateJournal(Integer id, JournalDTO dto) {
        Optional<Journal> existingJournalOpt = repository.findById(id);
        if (existingJournalOpt.isPresent()) {
            Journal existingJournal = existingJournalOpt.get();
            existingJournal.setJournalizedId(dto.getJournalizedId());
            existingJournal.setJournalizedType(dto.getJournalizedType());
            existingJournal.setUserId(dto.getUserId());
            existingJournal.setNotes(dto.getNotes());
            existingJournal.setPrivateNotes(dto.getPrivateNotes());
            //existingJournal.setCreatedOn(Timestamp.valueOf(LocalDateTime.now()));
            existingJournal.setCreatedOn(dto.getCreatedOn() != null ? Timestamp.valueOf(dto.getCreatedOn().toLocalDateTime()) : null);

            Journal updatedJournal = repository.save(existingJournal);
            return convertToDTO(updatedJournal);
        } else {
            throw new RuntimeException("Journal with ID " + id + " not found.");
        }
    }

    public void deleteJournal(Integer id) {
        repository.deleteById(id);
    }

    private JournalDTO convertToDTO(Journal journal) {
        return new JournalDTO(
                journal.getId(),
                journal.getJournalizedId(),
                journal.getJournalizedType(),
                journal.getUserId(),
                journal.getNotes(),
                journal.getCreatedOn(),
                journal.getPrivateNotes()
        );
    }

    private Journal convertToEntity(JournalDTO dto) {
        Journal journal = new Journal();
        journal.setId(dto.getId());
        journal.setJournalizedId(dto.getJournalizedId());
        journal.setJournalizedType(dto.getJournalizedType());
        journal.setUserId(dto.getUserId());
        journal.setNotes(dto.getNotes());
        journal.setCreatedOn(dto.getCreatedOn());
        journal.setPrivateNotes(dto.getPrivateNotes());
        return journal;
    }
}

