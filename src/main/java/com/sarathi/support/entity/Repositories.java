package com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "repositories", schema = "public", indexes = {
        @Index(name = "index_repositories_on_project_id", columnList = "project_id")
})
public class Repositories {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "project_id", nullable = false)
    private Integer projectId;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "login", length = 60)
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "root_url")
    private String rootUrl;

    @Column(name = "type")
    private String type;

    @Column(name = "path_encoding", length = 64)
    private String pathEncoding;

    @Column(name = "log_encoding", length = 64)
    private String logEncoding;

    @Column(name = "extra_info")
    private String extraInfo;

    @Column(name = "identifier")
    private String identifier;

    @Column(name = "is_default")
    private Boolean isDefault;

    @Column(name = "created_on")
    private Instant createdOn;

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