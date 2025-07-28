package com.sarathi.support.service;

import com.sarathi.support.dto.OpenIdAuthenticationNonceDTO;
import com.sarathi.support.entity.OpenIdAuthenticationNonce;
import com.sarathi.support.repository.OpenIdAuthenticationNonceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OpenIdAuthenticationNonceService {

    private final OpenIdAuthenticationNonceRepository repository;

     
    public OpenIdAuthenticationNonceService(OpenIdAuthenticationNonceRepository repository) {
        this.repository = repository;
    }

    public List<OpenIdAuthenticationNonceDTO> getAllNonces() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<OpenIdAuthenticationNonceDTO> getNonceById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public OpenIdAuthenticationNonceDTO saveNonce(OpenIdAuthenticationNonceDTO dto) {
        OpenIdAuthenticationNonce nonce = convertToEntity(dto);
        OpenIdAuthenticationNonce savedNonce = repository.save(nonce);
        return convertToDTO(savedNonce);
    }

    public OpenIdAuthenticationNonceDTO updateNonce(Integer id, OpenIdAuthenticationNonceDTO dto) {
        Optional<OpenIdAuthenticationNonce> existingNonceOpt = repository.findById(id);
        if (existingNonceOpt.isPresent()) {
            OpenIdAuthenticationNonce existingNonce = existingNonceOpt.get();
            existingNonce.setTimestamp(dto.getTimestamp());
            existingNonce.setServerUrl(dto.getServerUrl());
            existingNonce.setSalt(dto.getSalt());

            OpenIdAuthenticationNonce updatedNonce = repository.save(existingNonce);
            return convertToDTO(updatedNonce);
        } else {
            throw new RuntimeException("OpenIdAuthenticationNonce with ID " + id + " not found.");
        }
    }

    public void deleteNonce(Integer id) {
        repository.deleteById(id);
    }

    private OpenIdAuthenticationNonceDTO convertToDTO(OpenIdAuthenticationNonce nonce) {
        return new OpenIdAuthenticationNonceDTO(
                nonce.getId(),
                nonce.getTimestamp(),
                nonce.getServerUrl(),
                nonce.getSalt()
        );
    }

    private OpenIdAuthenticationNonce convertToEntity(OpenIdAuthenticationNonceDTO dto) {
        OpenIdAuthenticationNonce nonce = new OpenIdAuthenticationNonce();
        nonce.setId(dto.getId());
        nonce.setTimestamp(dto.getTimestamp());
        nonce.setServerUrl(dto.getServerUrl());
        nonce.setSalt(dto.getSalt());
        return nonce;
    }
}

