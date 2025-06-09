package com.sarathi.support.service;

import com.sarathi.support.dto.CommentDTO;
import com.sarathi.support.entity.Comment;
import com.sarathi.support.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CommentService {

    private final CommentRepository repository;

     
    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public List<CommentDTO> getAllComments() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<CommentDTO> getCommentById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public CommentDTO saveComment(CommentDTO dto) {
        Comment comment = convertToEntity(dto);
        Comment savedComment = repository.save(comment);
        return convertToDTO(savedComment);
    }

    public void deleteComment(Integer id) {
        repository.deleteById(id);
    }

    private CommentDTO convertToDTO(Comment comment) {
        return new CommentDTO(
                comment.getId(),
                comment.getCommentedType(),
                comment.getCommentedId(),
                comment.getAuthorId(),
                comment.getContent(),
                comment.getCreatedOn(),
                comment.getUpdatedOn()
        );
    }

    private Comment convertToEntity(CommentDTO dto) {
        Comment comment = new Comment();
        comment.setId(dto.getId());
        comment.setCommentedType(dto.getCommentedType());
        comment.setCommentedId(dto.getCommentedId());
        comment.setAuthorId(dto.getAuthorId());
        comment.setContent(dto.getContent());
        comment.setCreatedOn(dto.getCreatedOn());
        comment.setUpdatedOn(dto.getUpdatedOn());
        return comment;
    }
}
