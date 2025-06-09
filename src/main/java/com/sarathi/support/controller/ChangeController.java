package com.sarathi.support.controller;

import com.sarathi.support.dto.ChangeDTO;
import com.sarathi.support.service.ChangeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/changes")
public class ChangeController {

    private final ChangeService service;

     
    public ChangeController(ChangeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ChangeDTO> getAllChanges() {
        return service.getAllChanges();
    }

    @GetMapping("/{id}")
    public Optional<ChangeDTO> getChangeById(@PathVariable Integer id) {
        return service.getChangeById(id);
    }

    @PostMapping
    public ChangeDTO saveChange(@RequestBody ChangeDTO dto) {
        return service.saveChange(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteChange(@PathVariable Integer id) {
        service.deleteChange(id);
    }
}
