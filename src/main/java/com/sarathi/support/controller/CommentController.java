package com.sarathi.support.controller;

import com.sarathi.support.dto.CommentDTO;
import com.sarathi.support.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private final CommentService service;

     
    public CommentController(CommentService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommentDTO> getAllComments() {
        return service.getAllComments();
    }

    
    @GetMapping("/getCommentsByIssueId")
    public List<CommentDTO> getAllCommentsByIssueId(@PathVariable Integer commentId) {
        return service.getCommentById(commentId);
    }
    
    @GetMapping("/{id}")
    public  List<CommentDTO> getCommentById(@PathVariable Integer id) {
        return service.getCommentById(id);
    }

    @PostMapping
    public CommentDTO saveComment(@RequestBody CommentDTO dto) {
        return service.saveComment(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Integer id) {
        service.deleteComment(id);
    }
}
