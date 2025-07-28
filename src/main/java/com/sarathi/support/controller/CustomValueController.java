package com.sarathi.support.controller;

import com.sarathi.support.dto.CustomValueDTO;
import com.sarathi.support.service.CustomValueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/custom-values")
public class CustomValueController {

    private final CustomValueService service;

     
    public CustomValueController(CustomValueService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomValueDTO> getAllCustomValues() {
        return service.getAllCustomValues();
    }

    @GetMapping("/{id}")
    public Optional<CustomValueDTO> getCustomValueById(@PathVariable Integer id) {
        return service.getCustomValueById(id);
    }

    @PostMapping
    public CustomValueDTO saveCustomValue(@RequestBody CustomValueDTO dto) {
        return service.saveCustomValue(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomValue(@PathVariable Integer id) {
        service.deleteCustomValue(id);
    }
}
