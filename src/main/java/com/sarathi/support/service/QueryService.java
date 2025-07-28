package com.sarathi.support.service;

import com.sarathi.support.dto.QueryDTO;
import com.sarathi.support.entity.Query;
import com.sarathi.support.repository.QueryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QueryService {

    private final QueryRepository repository;

     
    public QueryService(QueryRepository repository) {
        this.repository = repository;
    }

    public List<QueryDTO> getAllQueries() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<QueryDTO> getQueryById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public QueryDTO saveQuery(QueryDTO dto) {
        Query query = convertToEntity(dto);
        Query savedQuery = repository.save(query);
        return convertToDTO(savedQuery);
    }

    public QueryDTO updateQuery(Integer id, QueryDTO dto) {
        Optional<Query> existingQueryOpt = repository.findById(id);
        if (existingQueryOpt.isPresent()) {
            Query existingQuery = existingQueryOpt.get();
            existingQuery.setProjectId(dto.getProjectId());
            existingQuery.setName(dto.getName());
            existingQuery.setFilters(dto.getFilters());
            existingQuery.setUserId(dto.getUserId());
            existingQuery.setColumnNames(dto.getColumnNames());
            existingQuery.setSortCriteria(dto.getSortCriteria());
            existingQuery.setGroupBy(dto.getGroupBy());
            existingQuery.setType(dto.getType());
            existingQuery.setVisibility(dto.getVisibility());
            existingQuery.setOptions(dto.getOptions());

            Query updatedQuery = repository.save(existingQuery);
            return convertToDTO(updatedQuery);
        } else {
            throw new RuntimeException("Query with ID " + id + " not found.");
        }
    }

    public void deleteQuery(Integer id) {
        repository.deleteById(id);
    }

    private QueryDTO convertToDTO(Query query) {
        return new QueryDTO(
                query.getId(),
                query.getProjectId(),
                query.getName(),
                query.getFilters(),
                query.getUserId(),
                query.getColumnNames(),
                query.getSortCriteria(),
                query.getGroupBy(),
                query.getType(),
                query.getVisibility(),
                query.getOptions()
        );
    }

    private Query convertToEntity(QueryDTO dto) {
        Query query = new Query();
        query.setId(dto.getId());
        query.setProjectId(dto.getProjectId());
        query.setName(dto.getName());
        query.setFilters(dto.getFilters());
        query.setUserId(dto.getUserId());
        query.setColumnNames(dto.getColumnNames());
        query.setSortCriteria(dto.getSortCriteria());
        query.setGroupBy(dto.getGroupBy());
        query.setType(dto.getType());
        query.setVisibility(dto.getVisibility());
        query.setOptions(dto.getOptions());
        return query;
    }
}

