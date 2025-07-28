package com.sarathi.support.controller;

import com.sarathi.support.dto.WatcherDTO;
import com.sarathi.support.service.WatcherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/watchers")
public class WatcherController {

    private final WatcherService service;

     
    public WatcherController(WatcherService service) {
        this.service = service;
    }

    @GetMapping
    public List<WatcherDTO> getAllWatchers() {
        return service.getAllWatchers();
    }

    @GetMapping("/{id}")
    public Optional<WatcherDTO> getWatcherById(@PathVariable Integer id) {
        return service.getWatcherById(id);
    }

    @PostMapping
    public WatcherDTO saveWatcher(@RequestBody WatcherDTO dto) {
        return service.saveWatcher(dto);
    }

    @PutMapping("/{id}")
    public WatcherDTO updateWatcher(@PathVariable Integer id, @RequestBody WatcherDTO dto) {
        return service.updateWatcher(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteWatcher(@PathVariable Integer id) {
        service.deleteWatcher(id);
    }
}

