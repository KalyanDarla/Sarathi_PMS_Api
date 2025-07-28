package com.sarathi.support.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarathi.support.dto.CategoryDTO;
import com.sarathi.support.repository.CategoryRepository;
@Service
public class CategoryService {
	

    @Autowired
    private CategoryRepository categoryRepository;

	public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll().stream().map(category -> {
            CategoryDTO dto = new CategoryDTO();
            dto.setId(category.getId());
            dto.setCategoryName(category.getCategoryName());
            return dto;
        }).collect(Collectors.toList());
    }
}
