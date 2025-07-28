package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "issue_statuses", schema = "public", indexes = {
        @Index(name = "index_issue_statuses_on_is_closed", columnList = "is_closed"),
        @Index(name = "index_issue_statuses_on_position", columnList = "position")
})
public class IssueStatus {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "is_closed", nullable = false)
    private Boolean isClosed = false;

    @Column(name = "\"position\"")
    private Integer position;

    @Column(name = "default_done_ratio")
    private Integer defaultDoneRatio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getDefaultDoneRatio() {
        return defaultDoneRatio;
    }

    public void setDefaultDoneRatio(Integer defaultDoneRatio) {
        this.defaultDoneRatio = defaultDoneRatio;
    }

}