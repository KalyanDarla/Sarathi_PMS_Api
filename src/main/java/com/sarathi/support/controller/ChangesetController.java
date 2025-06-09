package com.sarathi.support.controller;

import com.sarathi.support.dto.ChangesetDTO;
import com.sarathi.support.service.ChangesetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/changesets")
public class ChangesetController {

    private final ChangesetService service;

     
    public ChangesetController(ChangesetService service) {
        this.service = service;
    }

    @GetMapping
    public List<ChangesetDTO> getAllChangesets() {
        return service.getAllChangesets();
    }

    @GetMapping("/{id}")
    public Optional<ChangesetDTO> getChangesetById(@PathVariable Integer id) {
        return service.getChangesetById(id);
    }

    @PostMapping
    public ChangesetDTO saveChangeset(@RequestBody ChangesetDTO dto) {
        return service.saveChangeset(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteChangeset(@PathVariable Integer id) {
        service.deleteChangeset(id);
    }
}
