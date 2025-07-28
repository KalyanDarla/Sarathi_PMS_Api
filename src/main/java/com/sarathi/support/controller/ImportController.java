 package com.sarathi.support.controller;

import com.sarathi.support.dto.ImportDTO;
import com.sarathi.support.service.ImportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/imports")
public class ImportController {

    private final ImportService service;

     
    public ImportController(ImportService service) {
        this.service = service;
    }

    @GetMapping
    public List<ImportDTO> getAllImports() {
        return service.getAllImports();
    }

    @GetMapping("/{id}")
    public Optional<ImportDTO> getImportById(@PathVariable Integer id) {
        return service.getImportById(id);
    }

    @PostMapping
    public ImportDTO saveImport(@RequestBody ImportDTO dto) {
        return service.saveImport(dto);
    }

    @PutMapping("/{id}")
    public ImportDTO updateImport(@PathVariable Integer id, @RequestBody ImportDTO dto) {
        return service.updateImport(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteImport(@PathVariable Integer id) {
        service.deleteImport(id);
    }
}

