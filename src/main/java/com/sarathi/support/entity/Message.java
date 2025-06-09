package com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "messages", schema = "public", indexes = {
        @Index(name = "messages_board_id", columnList = "board_id"),
        @Index(name = "messages_parent_id", columnList = "parent_id"),
        @Index(name = "index_messages_on_author_id", columnList = "author_id"),
        @Index(name = "index_messages_on_last_reply_id", columnList = "last_reply_id"),
        @Index(name = "index_messages_on_created_on", columnList = "created_on")
})
public class Message {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "board_id", nullable = false)
    private Integer boardId;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "content")
    private String content;

    @Column(name = "author_id")
    private Integer authorId;

    @Column(name = "replies_count", nullable = false)
    private Integer repliesCount;

    @Column(name = "last_reply_id")
    private Integer lastReplyId;

    @Column(name = "created_on", nullable = false)
    private Instant createdOn;

    @Column(name = "updated_on", nullable = false)
    private Instant updatedOn;

    @Column(name = "locked")
    private Boolean locked;

    @Column(name = "sticky")
    private Integer sticky;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getRepliesCount() {
        return repliesCount;
    }

    public void setRepliesCount(Integer repliesCount) {
        this.repliesCount = repliesCount;
    }

    public Integer getLastReplyId() {
        return lastReplyId;
    }

    public void setLastReplyId(Integer lastReplyId) {
        this.lastReplyId = lastReplyId;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public Instant getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Instant updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Integer getSticky() {
        return sticky;
    }

    public void setSticky(Integer sticky) {
        this.sticky = sticky;
    }

}