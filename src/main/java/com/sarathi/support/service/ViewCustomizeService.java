package com.sarathi.support.service;

import com.sarathi.support.dto.ViewCustomizeDTO;
import com.sarathi.support.entity.ViewCustomize;
import com.sarathi.support.repository.ViewCustomizeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ViewCustomizeService {

    private final ViewCustomizeRepository repository;

     
    public ViewCustomizeService(ViewCustomizeRepository repository) {
        this.repository = repository;
    }

    public List<ViewCustomizeDTO> getAllViewCustomizes() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<ViewCustomizeDTO> getViewCustomizeById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public ViewCustomizeDTO saveViewCustomize(ViewCustomizeDTO dto) {
        ViewCustomize viewCustomize = convertToEntity(dto);
        ViewCustomize savedViewCustomize = repository.save(viewCustomize);
        return convertToDTO(savedViewCustomize);
    }

    public ViewCustomizeDTO updateViewCustomize(Integer id, ViewCustomizeDTO dto) {
        Optional<ViewCustomize> existingCustomizeOpt = repository.findById(id);
        if (existingCustomizeOpt.isPresent()) {
            ViewCustomize existingCustomize = existingCustomizeOpt.get();
            existingCustomize.setPathPattern(dto.getPathPattern());
            existingCustomize.setCode(dto.getCode());
            existingCustomize.setIsEnabled(dto.getIsEnabled());
            existingCustomize.setIsPrivate(dto.getIsPrivate());
            existingCustomize.setAuthorId(dto.getAuthorId());
            existingCustomize.setInsertionPosition(dto.getInsertionPosition());
            existingCustomize.setCustomizeType(dto.getCustomizeType());
            existingCustomize.setComments(dto.getComments());

            ViewCustomize updatedCustomize = repository.save(existingCustomize);
            return convertToDTO(updatedCustomize);
        } else {
            throw new RuntimeException("ViewCustomize with ID " + id + " not found.");
        }
    }

    public void deleteViewCustomize(Integer id) {
        repository.deleteById(id);
    }

    private ViewCustomizeDTO convertToDTO(ViewCustomize viewCustomize) {
        return new ViewCustomizeDTO(
                viewCustomize.getId(),
                viewCustomize.getPathPattern(),
                viewCustomize.getCode(),
                viewCustomize.getIsEnabled(),
                viewCustomize.getIsPrivate(),
                viewCustomize.getAuthorId(),
                viewCustomize.getInsertionPosition(),
                viewCustomize.getCustomizeType(),
                viewCustomize.getComments()
        );
    }

    private ViewCustomize convertToEntity(ViewCustomizeDTO dto) {
        ViewCustomize viewCustomize = new ViewCustomize();
        viewCustomize.setId(dto.getId());
        viewCustomize.setPathPattern(dto.getPathPattern());
        viewCustomize.setCode(dto.getCode());
        viewCustomize.setIsEnabled(dto.getIsEnabled());
        viewCustomize.setIsPrivate(dto.getIsPrivate());
        viewCustomize.setAuthorId(dto.getAuthorId());
        viewCustomize.setInsertionPosition(dto.getInsertionPosition());
        viewCustomize.setCustomizeType(dto.getCustomizeType());
        viewCustomize.setComments(dto.getComments());
        return viewCustomize;
    }
}
