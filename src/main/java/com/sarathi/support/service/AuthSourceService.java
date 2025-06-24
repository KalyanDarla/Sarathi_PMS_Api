package com.sarathi.support.service;

import com.sarathi.support.dto.AuthSourceDTO;
import com.sarathi.support.dto.LoginRequestDTO;
import com.sarathi.support.dto.UserResponseDto;
import com.sarathi.support.entity.AuthSource;
import com.sarathi.support.entity.User;
import com.sarathi.support.exception.InvalidCredentialsException;
import com.sarathi.support.repository.AuthSourceRepository;
import com.sarathi.support.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AuthSourceService {

    private final AuthSourceRepository repository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

     public AuthSourceService(AuthSourceRepository repository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
         this.userRepository = userRepository;
         this.passwordEncoder = passwordEncoder;
     }

    public List<AuthSourceDTO> getAllAuthSources() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<AuthSourceDTO> getAuthSourceById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public AuthSourceDTO saveAuthSource(AuthSourceDTO dto) {
        AuthSource authSource = convertToEntity(dto);
        AuthSource savedAuthSource = repository.save(authSource);
        return convertToDTO(savedAuthSource);
    }

    public void deleteAuthSource(Integer id) {
        repository.deleteById(id);
    }

    private AuthSourceDTO convertToDTO(AuthSource authSource) {
        return new AuthSourceDTO(
                authSource.getId(),
                authSource.getType(),
                authSource.getName(),
                authSource.getHost(),
                authSource.getPort(),
                authSource.getAccount(),
                authSource.getAccountPassword(),
                authSource.getBaseDn(),
                authSource.getAttrLogin(),
                authSource.getAttrFirstname(),
                authSource.getAttrLastname(),
                authSource.getAttrMail(),
                authSource.getOntheflyRegister(),
                authSource.getTls(),
                authSource.getFilter(),
                authSource.getTimeout(),
                authSource.getVerifyPeer()
        );
    }

    private AuthSource convertToEntity(AuthSourceDTO dto) {
        AuthSource authSource = new AuthSource();
        authSource.setId(dto.getId());
        authSource.setType(dto.getType());
        authSource.setName(dto.getName());
        authSource.setHost(dto.getHost());
        authSource.setPort(dto.getPort());
        authSource.setAccount(dto.getAccount());
        authSource.setAccountPassword(dto.getAccountPassword());
        authSource.setBaseDn(dto.getBaseDn());
        authSource.setAttrLogin(dto.getAttrLogin());
        authSource.setAttrFirstname(dto.getAttrFirstname());
        authSource.setAttrLastname(dto.getAttrLastname());
        authSource.setAttrMail(dto.getAttrMail());
        authSource.setOntheflyRegister(dto.getOntheflyRegister());
        authSource.setTls(dto.getTls());
        authSource.setFilter(dto.getFilter());
        authSource.setTimeout(dto.getTimeout());
        authSource.setVerifyPeer(dto.getVerifyPeer());
        return authSource;
    }

    public UserResponseDto authenticateUser(LoginRequestDTO loginDTO) {
        UserResponseDto userResponseDto = new UserResponseDto();
        Optional<User> user = userRepository.findByLogin(loginDTO.getUsername());
        if (user.isPresent()) {
            userResponseDto.setUserId(user.get().getId());
            userResponseDto.setUsername(user.get().getLogin());
             return userResponseDto;
        }
        throw new InvalidCredentialsException("Invalid username or password");
    }
}
