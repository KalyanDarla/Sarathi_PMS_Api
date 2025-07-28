package com.sarathi.support.controller;

import com.sarathi.support.dto.EnabledModuleDTO;
import com.sarathi.support.service.EnabledModuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enabled-modules")
public class EnabledModuleController {

    private final EnabledModuleService service;

     
    public EnabledModuleController(EnabledModuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<EnabledModuleDTO> getAllEnabledModules() {
        return service.getAllEnabledModules();
    }

    @GetMapping("/{id}")
    public Optional<EnabledModuleDTO> getEnabledModuleById(@PathVariable Integer id) {
        return service.getEnabledModuleById(id);
    }

    @PostMapping
    public EnabledModuleDTO saveEnabledModule(@RequestBody EnabledModuleDTO dto) {
        return service.saveEnabledModule(dto);
    }

    @PutMapping("/{id}")
    public EnabledModuleDTO updateEnabledModule(@PathVariable Integer id, @RequestBody EnabledModuleDTO dto) {
        return service.updateEnabledModule(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteEnabledModule(@PathVariable Integer id) {
        service.deleteEnabledModule(id);
    }
}
