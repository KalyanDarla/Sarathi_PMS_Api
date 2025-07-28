package com.sarathi.support.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarathi.support.dto.StateMasterDTO;
import com.sarathi.support.entity.StateMaster;
import com.sarathi.support.repository.StateMasterRepository;

@Service
public class StateMasterService {

    @Autowired
    private StateMasterRepository repository;

    public List<StateMasterDTO> getAllStateDTOs() {
        return repository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    private StateMasterDTO toDTO(StateMaster state) {
        StateMasterDTO dto = new StateMasterDTO();
        dto.setId(state.getId());
        dto.setName(state.getName());
        return dto;
    }


    public Optional<StateMaster> getStateById(Short id) {
        return repository.findById(id);
    }

    public StateMaster saveState(StateMaster state) {
        return repository.save(state);
    }

    public void deleteStateById(Short id) {
        repository.deleteById(id);
    }
}

