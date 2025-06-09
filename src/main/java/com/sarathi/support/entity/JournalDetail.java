package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "journal_details", schema = "public", indexes = {
        @Index(name = "journal_details_journal_id", columnList = "journal_id")
})
public class JournalDetail {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "journal_id", nullable = false)
    private Integer journalId;

    @Column(name = "property", nullable = false, length = 30)
    private String property;

    @Column(name = "prop_key", nullable = false, length = 30)
    private String propKey;

    @Column(name = "old_value")
    private String oldValue;

    @Column(name = "value")
    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJournalId() {
        return journalId;
    }

    public void setJournalId(Integer journalId) {
        this.journalId = journalId;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getPropKey() {
        return propKey;
    }

    public void setPropKey(String propKey) {
        this.propKey = propKey;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}