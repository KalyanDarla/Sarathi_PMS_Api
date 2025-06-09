package com.sarathi.support.dto;

import java.time.Instant;

public class RepositoriesDTO {
    private Integer id;
    private Integer projectId;
    private String url;
    private String login;
    private String password;
    private String rootUrl;
    private String type;
    private String pathEncoding;
    private String logEncoding;
    private String extraInfo;
    private String identifier;
    private Boolean isDefault;
    private Instant createdOn;

    public RepositoriesDTO() {}

    public RepositoriesDTO(Integer id, Integer projectId, String url, String login, String password, String rootUrl, String type,
                         String pathEncoding, String logEncoding, String extraInfo, String identifier, Boolean isDefault, Instant createdOn) {
        this.id = id;
        this.projectId = projectId;
        this.url = url;
        this.login = login;
        this.password = password;
        this.rootUrl = rootUrl;
        this.type = type;
        this.pathEncoding = pathEncoding;
        this.logEncoding = logEncoding;
        this.extraInfo = extraInfo;
        this.identifier = identifier;
        this.isDefault = isDefault;
        this.createdOn = createdOn;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRootUrl() {
		return rootUrl;
	}

	public void setRootUrl(String rootUrl) {
		this.rootUrl = rootUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPathEncoding() {
		return pathEncoding;
	}

	public void setPathEncoding(String pathEncoding) {
		this.pathEncoding = pathEncoding;
	}

	public String getLogEncoding() {
		return logEncoding;
	}

	public void setLogEncoding(String logEncoding) {
		this.logEncoding = logEncoding;
	}

	public String getExtraInfo() {
		return extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

 }
