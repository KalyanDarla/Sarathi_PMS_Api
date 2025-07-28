package com.sarathi.support.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarathi.support.dto.NicHeadDTO;
import com.sarathi.support.entity.NicHead;
import com.sarathi.support.service.NicHeadService;

@RestController
@RequestMapping("/nicheads")
public class NicHeadController {

    @Autowired
    private NicHeadService service;

    @GetMapping
    public List<NicHeadDTO> getAll() {
        return service.getAll();   
    }


    @GetMapping("/{id}")
    public ResponseEntity<NicHead> getById(@PathVariable Long id) {
        NicHead head = service.getById(id);
        return head != null ? ResponseEntity.ok(head) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public NicHead create(@RequestBody NicHead nicHead) {
        return service.create(nicHead);
    }

    @PutMapping("/{id}")
    public ResponseEntity<NicHead> update(@PathVariable Long id, @RequestBody NicHead nicHead) {
        NicHead updated = service.update(id, nicHead);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

