package com.sarathi.support.controller;

import com.sarathi.support.dto.JournalDetailDTO;
import com.sarathi.support.service.JournalDetailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journal-details")
public class JournalDetailController {

    private final JournalDetailService service;

     
    public JournalDetailController(JournalDetailService service) {
        this.service = service;
    }

    @GetMapping
    public List<JournalDetailDTO> getAllJournalDetails() {
        return service.getAllJournalDetails();
    }

    @GetMapping("/{id}")
    public Optional<JournalDetailDTO> getJournalDetailById(@PathVariable Integer id) {
        return service.getJournalDetailById(id);
    }

    @PostMapping
    public JournalDetailDTO saveJournalDetail(@RequestBody JournalDetailDTO dto) {
        return service.saveJournalDetail(dto);
    }

    @PutMapping("/{id}")
    public JournalDetailDTO updateJournalDetail(@PathVariable Integer id, @RequestBody JournalDetailDTO dto) {
        return service.updateJournalDetail(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteJournalDetail(@PathVariable Integer id) {
        service.deleteJournalDetail(id);
    }
}

