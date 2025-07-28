package com.sarathi.support.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "attachments", schema = "public", indexes = {
        @Index(name = "index_attachments_on_container_id_and_container_type", columnList = "container_id, container_type"),
        @Index(name = "index_attachments_on_disk_filename", columnList = "disk_filename"),
        @Index(name = "index_attachments_on_author_id", columnList = "author_id"),
        @Index(name = "index_attachments_on_created_on", columnList = "created_on")
})
public class Attachment {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "container_id")
    private Integer containerId;

    @Column(name = "container_type", length = 30)
    private String containerType;

     @Column(name = "filename", nullable = false)
    private String filename;

     @Column(name = "disk_filename", nullable = false)
    private String diskFilename;

    @Column(name = "filesize", nullable = false)
    private Long filesize;

     @Column(name = "content_type")
    private String contentType;

    @Column(name = "digest", nullable = false, length = 64)
    private String digest;

    @Column(name = "downloads", nullable = false)
    private Integer downloads;

    @Column(name = "author_id", nullable = false)
    private Integer authorId;

    @Column(name = "created_on")
    private Instant createdOn;

     @Column(name = "description")
    private String description;

     @Column(name = "disk_directory")
    private String diskDirectory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContainerId() {
        return containerId;
    }

    public void setContainerId(Integer containerId) {
        this.containerId = containerId;
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDiskFilename() {
        return diskFilename;
    }

    public void setDiskFilename(String diskFilename) {
        this.diskFilename = diskFilename;
    }

    public Long getFilesize() {
        return filesize;
    }

    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiskDirectory() {
        return diskDirectory;
    }

    public void setDiskDirectory(String diskDirectory) {
        this.diskDirectory = diskDirectory;
    }

}