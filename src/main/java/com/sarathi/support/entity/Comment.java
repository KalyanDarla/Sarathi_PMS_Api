package com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "comments", schema = "public", indexes = {
        @Index(name = "index_comments_on_commented_id_and_commented_type", columnList = "commented_id, commented_type"),
        @Index(name = "index_comments_on_author_id", columnList = "author_id")
})
public class Comment {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "commented_type", nullable = false, length = 30)
    private String commentedType;

    @Column(name = "commented_id", nullable = false)
    private Integer commentedId;

    @Column(name = "author_id", nullable = false)
    private Integer authorId;

    @Column(name = "content")
    private String content;

    @Column(name = "created_on", nullable = false)
    private Instant createdOn;

    @Column(name = "updated_on", nullable = false)
    private Instant updatedOn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentedType() {
        return commentedType;
    }

    public void setCommentedType(String commentedType) {
        this.commentedType = commentedType;
    }

    public Integer getCommentedId() {
        return commentedId;
    }

    public void setCommentedId(Integer commentedId) {
        this.commentedId = commentedId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

}