package com.sarathi.support.service;

import com.sarathi.support.dto.EmailAddressDTO;
import com.sarathi.support.entity.EmailAddress;
import com.sarathi.support.repository.EmailAddressRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmailAddressService {

    private final EmailAddressRepository repository;

     
    public EmailAddressService(EmailAddressRepository repository) {
        this.repository = repository;
    }

    public List<EmailAddressDTO> getAllEmailAddresses() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<EmailAddressDTO> getEmailAddressById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public EmailAddressDTO saveEmailAddress(EmailAddressDTO dto) {
        EmailAddress emailAddress = convertToEntity(dto);
        emailAddress.setCreatedOn(Instant.now());
        emailAddress.setUpdatedOn(Instant.now());
        EmailAddress savedEmailAddress = repository.save(emailAddress);
        return convertToDTO(savedEmailAddress);
    }

    public EmailAddressDTO updateEmailAddress(Integer id, EmailAddressDTO dto) {
        Optional<EmailAddress> existingEmailOpt = repository.findById(id);
        if (existingEmailOpt.isPresent()) {
            EmailAddress existingEmail = existingEmailOpt.get();
            existingEmail.setUserId(dto.getUserId());
            existingEmail.setAddress(dto.getAddress());
            existingEmail.setIsDefault(dto.getIsDefault());
            existingEmail.setNotify(dto.getNotify());
            existingEmail.setUpdatedOn(Instant.now());
            EmailAddress updatedEmail = repository.save(existingEmail);
            return convertToDTO(updatedEmail);
        } else {
            throw new RuntimeException("Email Address with ID " + id + " not found.");
        }
    }

    public void deleteEmailAddress(Integer id) {
        repository.deleteById(id);
    }

    private EmailAddressDTO convertToDTO(EmailAddress emailAddress) {
        return new EmailAddressDTO(
                emailAddress.getId(),
                emailAddress.getUserId(),
                emailAddress.getAddress(),
                emailAddress.getIsDefault(),
                emailAddress.getNotify(),
                emailAddress.getCreatedOn(),
                emailAddress.getUpdatedOn()
        );
    }

    private EmailAddress convertToEntity(EmailAddressDTO dto) {
        EmailAddress emailAddress = new EmailAddress();
        emailAddress.setId(dto.getId());
        emailAddress.setUserId(dto.getUserId());
        emailAddress.setAddress(dto.getAddress());
        emailAddress.setIsDefault(dto.getIsDefault());
        emailAddress.setNotify(dto.getNotify());
        emailAddress.setCreatedOn(dto.getCreatedOn());
        emailAddress.setUpdatedOn(dto.getUpdatedOn());
        return emailAddress;
    }
}
