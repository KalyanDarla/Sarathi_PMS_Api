package com.sarathi.support.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarathi.support.dto.NicHeadDTO;
import com.sarathi.support.entity.NicHead;
import com.sarathi.support.repository.NicHeadRepository;

@Service
public class NicHeadService {

    @Autowired
    private NicHeadRepository repository;

    public List<NicHeadDTO> getAll() {
        return repository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public NicHeadDTO toDTO(NicHead entity) {
        NicHeadDTO dto = new NicHeadDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        // map other fields as needed
        return dto;
    }

    public NicHead getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public NicHead create(NicHead nicHead) {
        return repository.save(nicHead);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public NicHead update(Long id, NicHead updated) {
        NicHead existing = getById(id);
        if (existing != null) {
            existing.setName(updated.getName());
            existing.setDesignation(updated.getDesignation());
            existing.setCreatedon(updated.getCreatedon());
            existing.setCreatedtime(updated.getCreatedtime());
            existing.setUpdatedon(updated.getUpdatedon());
            existing.setUpdatedtime(updated.getUpdatedtime());
            return repository.save(existing);
        }
        return null;
    }
}

