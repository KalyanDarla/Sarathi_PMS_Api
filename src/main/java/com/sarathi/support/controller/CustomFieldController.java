package com.sarathi.support.controller;

import com.sarathi.support.dto.CustomFieldDTO;
import com.sarathi.support.service.CustomFieldService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/custom-fields")
public class CustomFieldController {

    private final CustomFieldService service;

     
    public CustomFieldController(CustomFieldService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomFieldDTO> getAllCustomFields() {
        return service.getAllCustomFields();
    }

    @GetMapping("/{id}")
    public Optional<CustomFieldDTO> getCustomFieldById(@PathVariable Integer id) {
        return service.getCustomFieldById(id);
    }

    @PostMapping
    public CustomFieldDTO saveCustomField(@RequestBody CustomFieldDTO dto) {
        return service.saveCustomField(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomField(@PathVariable Integer id) {
        service.deleteCustomField(id);
    }
}
