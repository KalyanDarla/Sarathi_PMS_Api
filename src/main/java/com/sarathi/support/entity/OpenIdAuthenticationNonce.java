package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "open_id_authentication_nonces", schema = "public")
public class OpenIdAuthenticationNonce {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "\"timestamp\"", nullable = false)
    private Integer timestamp;

    @Column(name = "server_url")
    private String serverUrl;

    @Column(name = "salt", nullable = false)
    private String salt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

}