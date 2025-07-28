package com.sarathi.support.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarathi.support.dto.ModuleInfoDTO;
import com.sarathi.support.entity.ModuleInfo;
import com.sarathi.support.service.ModuleInfoService;

@RestController
@RequestMapping("/modules")
public class ModuleInfoController {

    private final ModuleInfoService service;

    public ModuleInfoController(ModuleInfoService service) {
        this.service = service;
    }

    @GetMapping
    public List<ModuleInfoDTO> getAll() {
        return service.getAllModules();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModuleInfo> getById(@PathVariable Short id) {
        return service.getModuleById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ModuleInfo create(@RequestBody ModuleInfo module) {
        return service.createModule(module);
    }

    @PutMapping("/{id}")
    public ModuleInfo update(@PathVariable Short id, @RequestBody ModuleInfo module) {
        return service.updateModule(id, module);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Short id) {
        service.deleteModule(id);
        return ResponseEntity.noContent().build();
    }
}

