package com.sarathi.support.controller;

import com.sarathi.support.dto.VersionDTO;
import com.sarathi.support.service.VersionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/versions")
public class VersionController {

    private final VersionService service;

     
    public VersionController(VersionService service) {
        this.service = service;
    }

    @GetMapping
    public List<VersionDTO> getAllVersions() {
        return service.getAllVersions();
    }

    @GetMapping("/{id}")
    public Optional<VersionDTO> getVersionById(@PathVariable Integer id) {
        return service.getVersionById(id);
    }

    @PostMapping
    public VersionDTO saveVersion(@RequestBody VersionDTO dto) {
        return service.saveVersion(dto);
    }

    @PutMapping("/{id}")
    public VersionDTO updateVersion(@PathVariable Integer id, @RequestBody VersionDTO dto) {
        return service.updateVersion(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteVersion(@PathVariable Integer id) {
        service.deleteVersion(id);
    }
}
