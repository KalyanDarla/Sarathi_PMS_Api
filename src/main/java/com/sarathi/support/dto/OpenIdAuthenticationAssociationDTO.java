package com.sarathi.support.dto;

public class OpenIdAuthenticationAssociationDTO {
    private Integer id;
    private Integer issued;
    private Integer lifetime;
    private String handle;
    private String assocType;
    private byte[] serverUrl;
    private byte[] secret;

    public OpenIdAuthenticationAssociationDTO() {}

    public OpenIdAuthenticationAssociationDTO(Integer id, Integer issued, Integer lifetime, String handle, String assocType, byte[] serverUrl, byte[] secret) {
        this.id = id;
        this.issued = issued;
        this.lifetime = lifetime;
        this.handle = handle;
        this.assocType = assocType;
        this.serverUrl = serverUrl;
        this.secret = secret;
    }

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

