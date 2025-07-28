package com.sarathi.support.controller;

import com.sarathi.support.dto.EmailAddressDTO;
import com.sarathi.support.service.EmailAddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/email-addresses")
public class EmailAddressController {

    private final EmailAddressService service;

     
    public EmailAddressController(EmailAddressService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmailAddressDTO> getAllEmailAddresses() {
        return service.getAllEmailAddresses();
    }

    @GetMapping("/{id}")
    public Optional<EmailAddressDTO> getEmailAddressById(@PathVariable Integer id) {
        return service.getEmailAddressById(id);
    }

    @PostMapping
    public EmailAddressDTO saveEmailAddress(@RequestBody EmailAddressDTO dto) {
        return service.saveEmailAddress(dto);
    }

    @PutMapping("/{id}")
    public EmailAddressDTO updateEmailAddress(@PathVariable Integer id, @RequestBody EmailAddressDTO dto) {
        return service.updateEmailAddress(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteEmailAddress(@PathVariable Integer id) {
        service.deleteEmailAddress(id);
    }
}
