package com.sarathi.support.controller;

import com.sarathi.support.dto.ViewCustomizeDTO;
import com.sarathi.support.service.ViewCustomizeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/view-customizes")
public class ViewCustomizeController {

    private final ViewCustomizeService service;

     
    public ViewCustomizeController(ViewCustomizeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ViewCustomizeDTO> getAllViewCustomizes() {
        return service.getAllViewCustomizes();
    }

    @GetMapping("/{id}")
    public Optional<ViewCustomizeDTO> getViewCustomizeById(@PathVariable Integer id) {
        return service.getViewCustomizeById(id);
    }

    @PostMapping("/save")
    public ViewCustomizeDTO saveViewCustomize(@RequestBody ViewCustomizeDTO dto) {
        return service.saveViewCustomize(dto);
    }

    @PutMapping("/{id}")
    public ViewCustomizeDTO updateViewCustomize(@PathVariable Integer id, @RequestBody ViewCustomizeDTO dto) {
        return service.updateViewCustomize(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteViewCustomize(@PathVariable Integer id) {
        service.deleteViewCustomize(id);
    }
}

