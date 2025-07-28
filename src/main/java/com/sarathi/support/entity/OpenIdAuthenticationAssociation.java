package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "open_id_authentication_associations", schema = "public")
public class OpenIdAuthenticationAssociation {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "issued")
    private Integer issued;

    @Column(name = "lifetime")
    private Integer lifetime;

    @Column(name = "handle")
    private String handle;

    @Column(name = "assoc_type")
    private String assocType;

    @Column(name = "server_url")
    private byte[] serverUrl;

    @Column(name = "secret")
    private byte[] secret;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIssued() {
        return issued;
    }

    public void setIssued(Integer issued) {
        this.issued = issued;
    }

    public Integer getLifetime() {
        return lifetime;
    }

    public void setLifetime(Integer lifetime) {
        this.lifetime = lifetime;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getAssocType() {
        return assocType;
    }

    public void setAssocType(String assocType) {
        this.assocType = assocType;
    }

    public byte[] getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(byte[] serverUrl) {
        this.serverUrl = serverUrl;
    }

    public byte[] getSecret() {
        return secret;
    }

    public void setSecret(byte[] secret) {
        this.secret = secret;
    }

}