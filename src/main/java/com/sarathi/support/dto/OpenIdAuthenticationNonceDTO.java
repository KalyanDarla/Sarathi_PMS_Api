package com.sarathi.support.dto;

public class OpenIdAuthenticationNonceDTO {
    private Integer id;
    private Integer timestamp;
    private String serverUrl;
    private String salt;

    public OpenIdAuthenticationNonceDTO() {}

    public OpenIdAuthenticationNonceDTO(Integer id, Integer timestamp, String serverUrl, String salt) {
        this.id = id;
        this.timestamp = timestamp;
        this.serverUrl = serverUrl;
        this.salt = salt;
    }

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

