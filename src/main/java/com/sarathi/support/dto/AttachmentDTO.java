package com.sarathi.support.dto;

import java.time.Instant;
 
public class AttachmentDTO {
	private Integer id;
	private Integer containerId;
	private String containerType;
	private String filename;
	private String diskFilename;
	private Long filesize;
	private String contentType;
	private String digest;
	private Integer downloads;
	private Integer authorId;
	private Instant createdOn;
	private String description;
	private String diskDirectory;

	public AttachmentDTO() {
	}

	public AttachmentDTO(Integer id, Integer containerId, String containerType, String filename, String diskFilename,
			Long filesize, String contentType, String digest, Integer downloads, Integer authorId, Instant createdOn,
			String description, String diskDirectory) {
		this.id = id;
		this.containerId = containerId;
		this.containerType = containerType;
		this.filename = filename;
		this.diskFilename = diskFilename;
		this.filesize = filesize;
		this.contentType = contentType;
		this.digest = digest;
		this.downloads = downloads;
		this.authorId = authorId;
		this.createdOn = createdOn;
		this.description = description;
		this.diskDirectory = diskDirectory;
	}

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
