package com.sarathi.support.controller;

import com.sarathi.support.dto.BoardDTO;

import com.sarathi.support.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/boards")
public class BoardController {

    private final BoardService service;

     
    public BoardController(BoardService service) {
        this.service = service;
    }

    @GetMapping
    public List<BoardDTO> getAllBoards() {
        return service.getAllBoards();
    }

    @GetMapping("/{id}")
    public Optional<BoardDTO> getBoardById(@PathVariable Integer id) {
        return service.getBoardById(id);
    }

    @PostMapping
    public BoardDTO saveBoard(@RequestBody BoardDTO dto) {
        return service.saveBoard(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable Integer id) {
        service.deleteBoard(id);
    }
}
