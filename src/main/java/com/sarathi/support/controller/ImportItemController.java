package com.sarathi.support.controller;

import com.sarathi.support.dto.ImportItemDTO;
import com.sarathi.support.service.ImportItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/import-items")
public class ImportItemController {

    private final ImportItemService service;

     
    public ImportItemController(ImportItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<ImportItemDTO> getAllImportItems() {
        return service.getAllImportItems();
    }

    @GetMapping("/{id}")
    public Optional<ImportItemDTO> getImportItemById(@PathVariable Integer id) {
        return service.getImportItemById(id);
    }

    @PostMapping
    public ImportItemDTO saveImportItem(@RequestBody ImportItemDTO dto) {
        return service.saveImportItem(dto);
    }

    @PutMapping("/{id}")
    public ImportItemDTO updateImportItem(@PathVariable Integer id, @RequestBody ImportItemDTO dto) {
        return service.updateImportItem(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteImportItem(@PathVariable Integer id) {
        service.deleteImportItem(id);
    }
}
