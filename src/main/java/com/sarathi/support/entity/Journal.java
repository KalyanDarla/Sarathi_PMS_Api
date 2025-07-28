package com.sarathi.support.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "journals", schema = "public", indexes = {
        @Index(name = "journals_journalized_id", columnList = "journalized_id, journalized_type"),
        @Index(name = "index_journals_on_journalized_id", columnList = "journalized_id"),
        @Index(name = "index_journals_on_user_id", columnList = "user_id"),
        @Index(name = "index_journals_on_created_on", columnList = "created_on")
})
public class Journal {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "journalized_id", nullable = false)
    private Integer journalizedId;

    @Column(name = "journalized_type", nullable = false, length = 30)
    private String journalizedType;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "notes")
    private String notes;

    @Column(name = "created_on", nullable = false)
    private Timestamp createdOn;

    @Column(name = "private_notes", nullable = false)
    private Boolean privateNotes = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJournalizedId() {
        return journalizedId;
    }

    public void setJournalizedId(Integer journalizedId) {
        this.journalizedId = journalizedId;
    }

    public String getJournalizedType() {
        return journalizedType;
    }

    public void setJournalizedType(String journalizedType) {
        this.journalizedType = journalizedType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


    public Boolean getPrivateNotes() {
        return privateNotes;
    }

    public void setPrivateNotes(Boolean privateNotes) {
        this.privateNotes = privateNotes;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }
}