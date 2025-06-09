package com.sarathi.support.controller;

import com.sarathi.support.dto.JournalDTO;
import com.sarathi.support.service.JournalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journals")
public class JournalController {

    private final JournalService service;

     
    public JournalController(JournalService service) {
        this.service = service;
    }

    @GetMapping
    public List<JournalDTO> getAllJournals() {
        return service.getAllJournals();
    }

    @GetMapping("/{id}")
    public Optional<JournalDTO> getJournalById(@PathVariable Integer id) {
        return service.getJournalById(id);
    }

    @PostMapping
    public JournalDTO saveJournal(@RequestBody JournalDTO dto) {
        return service.saveJournal(dto);
    }

    @PutMapping("/{id}")
    public JournalDTO updateJournal(@PathVariable Integer id, @RequestBody JournalDTO dto) {
        return service.updateJournal(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteJournal(@PathVariable Integer id) {
        service.deleteJournal(id);
    }
}

