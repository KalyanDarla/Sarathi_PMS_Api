package com.sarathi.support.service;

import com.sarathi.support.dto.TokenDTO;
import com.sarathi.support.entity.Token;
import com.sarathi.support.repository.TokenRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TokenService {

    private final TokenRepository repository;

     
    public TokenService(TokenRepository repository) {
        this.repository = repository;
    }

    public List<TokenDTO> getAllTokens() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<TokenDTO> getTokenById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public TokenDTO saveToken(TokenDTO dto) {
        Token token = convertToEntity(dto);
        token.setCreatedOn(Instant.now());
        token.setUpdatedOn(Instant.now());
        Token savedToken = repository.save(token);
        return convertToDTO(savedToken);
    }

    public TokenDTO updateToken(Integer id, TokenDTO dto) {
        Optional<Token> existingTokenOpt = repository.findById(id);
        if (existingTokenOpt.isPresent()) {
            Token existingToken = existingTokenOpt.get();
            existingToken.setUserId(dto.getUserId());
            existingToken.setAction(dto.getAction());
            existingToken.setValue(dto.getValue());
            existingToken.setUpdatedOn(Instant.now());

            Token updatedToken = repository.save(existingToken);
            return convertToDTO(updatedToken);
        } else {
            throw new RuntimeException("Token with ID " + id + " not found.");
        }
    }

    public void deleteToken(Integer id) {
        repository.deleteById(id);
    }

    private TokenDTO convertToDTO(Token token) {
        return new TokenDTO(
                token.getId(),
                token.getUserId(),
                token.getAction(),
                token.getValue(),
                token.getCreatedOn(),
                token.getUpdatedOn()
        );
    }

    private Token convertToEntity(TokenDTO dto) {
        Token token = new Token();
        token.setId(dto.getId());
        token.setUserId(dto.getUserId());
        token.setAction(dto.getAction());
        token.setValue(dto.getValue());
        token.setCreatedOn(dto.getCreatedOn());
        token.setUpdatedOn(dto.getUpdatedOn());
        return token;
    }
}

