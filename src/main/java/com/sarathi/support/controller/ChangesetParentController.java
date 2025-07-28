package com.sarathi.support.controller;

import com.sarathi.support.dto.ChangesetParentDTO;
import com.sarathi.support.service.ChangesetParentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/changeset-parents")
public class ChangesetParentController {

    private final ChangesetParentService service;

     
    public ChangesetParentController(ChangesetParentService service) {
        this.service = service;
    }

    @GetMapping
    public List<ChangesetParentDTO> getAllChangesetParents() {
        return service.getAllChangesetParents();
    }

    @GetMapping("/{id}")
    public Optional<ChangesetParentDTO> getChangesetParentById(@PathVariable Integer id) {
        return service.getChangesetParentById(id);
    }

    @PostMapping
    public ChangesetParentDTO saveChangesetParent(@RequestBody ChangesetParentDTO dto) {
        return service.saveChangesetParent(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteChangesetParent(@PathVariable Integer id) {
        service.deleteChangesetParent(id);
    }
}
