package com.sarathi.support.controller;

import com.sarathi.support.dto.SettingDTO;
import com.sarathi.support.service.SettingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/settings")
public class SettingController {

    private final SettingService service;

     
    public SettingController(SettingService service) {
        this.service = service;
    }

    @GetMapping
    public List<SettingDTO> getAllSettings() {
        return service.getAllSettings();
    }

    @GetMapping("/{id}")
    public Optional<SettingDTO> getSettingById(@PathVariable Integer id) {
        return service.getSettingById(id);
    }

    @PostMapping
    public SettingDTO saveSetting(@RequestBody SettingDTO dto) {
        return service.saveSetting(dto);
    }

    @PutMapping("/{id}")
    public SettingDTO updateSetting(@PathVariable Integer id, @RequestBody SettingDTO dto) {
        return service.updateSetting(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteSetting(@PathVariable Integer id) {
        service.deleteSetting(id);
    }
}
