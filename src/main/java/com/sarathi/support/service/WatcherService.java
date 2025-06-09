package com.sarathi.support.service;

import com.sarathi.support.dto.WatcherDTO;
import com.sarathi.support.entity.Watcher;
import com.sarathi.support.repository.WatcherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WatcherService {

    private final WatcherRepository repository;

     
    public WatcherService(WatcherRepository repository) {
        this.repository = repository;
    }

    public List<WatcherDTO> getAllWatchers() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<WatcherDTO> getWatcherById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public WatcherDTO saveWatcher(WatcherDTO dto) {
        Watcher watcher = convertToEntity(dto);
        Watcher savedWatcher = repository.save(watcher);
        return convertToDTO(savedWatcher);
    }

    public WatcherDTO updateWatcher(Integer id, WatcherDTO dto) {
        Optional<Watcher> existingWatcherOpt = repository.findById(id);
        if (existingWatcherOpt.isPresent()) {
            Watcher existingWatcher = existingWatcherOpt.get();
            existingWatcher.setWatchableType(dto.getWatchableType());
            existingWatcher.setWatchableId(dto.getWatchableId());
            existingWatcher.setUserId(dto.getUserId());

            Watcher updatedWatcher = repository.save(existingWatcher);
            return convertToDTO(updatedWatcher);
        } else {
            throw new RuntimeException("Watcher with ID " + id + " not found.");
        }
    }

    public void deleteWatcher(Integer id) {
        repository.deleteById(id);
    }

    private WatcherDTO convertToDTO(Watcher watcher) {
        return new WatcherDTO(
                watcher.getId(),
                watcher.getWatchableType(),
                watcher.getWatchableId(),
                watcher.getUserId()
        );
    }

    private Watcher convertToEntity(WatcherDTO dto) {
        Watcher watcher = new Watcher();
        watcher.setId(dto.getId());
        watcher.setWatchableType(dto.getWatchableType());
        watcher.setWatchableId(dto.getWatchableId());
        watcher.setUserId(dto.getUserId());
        return watcher;
    }
}
