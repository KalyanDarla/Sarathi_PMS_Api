package com.sarathi.support.service;

import com.sarathi.support.dto.AttachmentDTO;

import com.sarathi.support.entity.Attachment;
import com.sarathi.support.repository.AttachmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AttachmentService {
    
    private final AttachmentRepository repository;

     
    public AttachmentService(AttachmentRepository repository) {
        this.repository = repository;
    }

    public List<AttachmentDTO> getAllAttachments() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<AttachmentDTO> getAttachmentById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public AttachmentDTO saveAttachment(AttachmentDTO dto) {
        Attachment attachment = convertToEntity(dto);
        Attachment savedAttachment = repository.save(attachment);
        return convertToDTO(savedAttachment);
    }

    public void deleteAttachment(Integer id) {
        repository.deleteById(id);
    }

    private AttachmentDTO convertToDTO(Attachment attachment) {
        return new AttachmentDTO(
                attachment.getId(),
                attachment.getContainerId(),
                attachment.getContainerType(),
                attachment.getFilename(),
                attachment.getDiskFilename(),
                attachment.getFilesize(),
                attachment.getContentType(),
                attachment.getDigest(),
                attachment.getDownloads(),
                attachment.getAuthorId(),
                attachment.getCreatedOn(),
                attachment.getDescription(),
                attachment.getDiskDirectory()
        );
    }

    private Attachment convertToEntity(AttachmentDTO dto) {
        Attachment attachment = new Attachment();
        attachment.setId(dto.getId());
        attachment.setContainerId(dto.getContainerId());
        attachment.setContainerType(dto.getContainerType());
        attachment.setFilename(dto.getFilename());
        attachment.setDiskFilename(dto.getDiskFilename());
        attachment.setFilesize(dto.getFilesize());
        attachment.setContentType(dto.getContentType());
        attachment.setDigest(dto.getDigest());
        attachment.setDownloads(dto.getDownloads());
        attachment.setAuthorId(dto.getAuthorId());
        attachment.setCreatedOn(dto.getCreatedOn());
        attachment.setDescription(dto.getDescription());
        attachment.setDiskDirectory(dto.getDiskDirectory());
        return attachment;
    }
}
