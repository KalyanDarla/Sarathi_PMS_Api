package com.sarathi.support.service;

import com.sarathi.support.dto.JournalDetailDTO;
import com.sarathi.support.entity.JournalDetail;
import com.sarathi.support.repository.JournalDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JournalDetailService {

    private final JournalDetailRepository repository;

     
    public JournalDetailService(JournalDetailRepository repository) {
        this.repository = repository;
    }

    public List<JournalDetailDTO> getAllJournalDetails() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<JournalDetailDTO> getJournalDetailById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public JournalDetailDTO saveJournalDetail(JournalDetailDTO dto) {
        JournalDetail journalDetail = convertToEntity(dto);
        JournalDetail savedJournalDetail = repository.save(journalDetail);
        return convertToDTO(savedJournalDetail);
    }

    public JournalDetailDTO updateJournalDetail(Integer id, JournalDetailDTO dto) {
        Optional<JournalDetail> existingDetailOpt = repository.findById(id);
        if (existingDetailOpt.isPresent()) {
            JournalDetail existingDetail = existingDetailOpt.get();
            existingDetail.setJournalId(dto.getJournalId());
            existingDetail.setProperty(dto.getProperty());
            existingDetail.setPropKey(dto.getPropKey());
            existingDetail.setOldValue(dto.getOldValue());
            existingDetail.setValue(dto.getValue());

            JournalDetail updatedDetail = repository.save(existingDetail);
            return convertToDTO(updatedDetail);
        } else {
            throw new RuntimeException("JournalDetail with ID " + id + " not found.");
        }
    }

    public void deleteJournalDetail(Integer id) {
        repository.deleteById(id);
    }

    private JournalDetailDTO convertToDTO(JournalDetail journalDetail) {
        return new JournalDetailDTO(
                journalDetail.getId(),
                journalDetail.getJournalId(),
                journalDetail.getProperty(),
                journalDetail.getPropKey(),
                journalDetail.getOldValue(),
                journalDetail.getValue()
        );
    }

    private JournalDetail convertToEntity(JournalDetailDTO dto) {
        JournalDetail journalDetail = new JournalDetail();
        journalDetail.setId(dto.getId());
        journalDetail.setJournalId(dto.getJournalId());
        journalDetail.setProperty(dto.getProperty());
        journalDetail.setPropKey(dto.getPropKey());
        journalDetail.setOldValue(dto.getOldValue());
        journalDetail.setValue(dto.getValue());
        return journalDetail;
    }
}

