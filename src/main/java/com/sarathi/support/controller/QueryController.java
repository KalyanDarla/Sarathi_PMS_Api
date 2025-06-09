package com.sarathi.support.controller;

import com.sarathi.support.dto.QueryDTO;
import com.sarathi.support.service.QueryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/queries")
public class QueryController {

    private final QueryService service;

     
    public QueryController(QueryService service) {
        this.service = service;
    }

    @GetMapping
    public List<QueryDTO> getAllQueries() {
        return service.getAllQueries();
    }

    @GetMapping("/{id}")
    public Optional<QueryDTO> getQueryById(@PathVariable Integer id) {
        return service.getQueryById(id);
    }

    @PostMapping
    public QueryDTO saveQuery(@RequestBody QueryDTO dto) {
        return service.saveQuery(dto);
    }

    @PutMapping("/{id}")
    public QueryDTO updateQuery(@PathVariable Integer id, @RequestBody QueryDTO dto) {
        return service.updateQuery(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteQuery(@PathVariable Integer id) {
        service.deleteQuery(id);
    }
}

