package com.sarathi.support.service;

import com.sarathi.support.dto.BoardDTO;
import com.sarathi.support.entity.Board;
import com.sarathi.support.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BoardService {

    private final BoardRepository repository;

     public BoardService(BoardRepository repository) {
        this.repository = repository;
    }

    public List<BoardDTO> getAllBoards() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<BoardDTO> getBoardById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public BoardDTO saveBoard(BoardDTO dto) {
        Board board = convertToEntity(dto);
        Board savedBoard = repository.save(board);
        return convertToDTO(savedBoard);
    }

    public void deleteBoard(Integer id) {
        repository.deleteById(id);
    }

    private BoardDTO convertToDTO(Board board) {
        return new BoardDTO(
                board.getId(),
                board.getProjectId(),
                board.getName(),
                board.getDescription(),
                board.getPosition(),
                board.getTopicsCount(),
                board.getMessagesCount(),
                board.getLastMessageId(),
                board.getParentId()
        );
    }

    private Board convertToEntity(BoardDTO dto) {
        Board board = new Board();
        board.setId(dto.getId());
        board.setProjectId(dto.getProjectId());
        board.setName(dto.getName());
        board.setDescription(dto.getDescription());
        board.setPosition(dto.getPosition());
        board.setTopicsCount(dto.getTopicsCount());
        board.setMessagesCount(dto.getMessagesCount());
        board.setLastMessageId(dto.getLastMessageId());
        board.setParentId(dto.getParentId());
        return board;
    }
}
