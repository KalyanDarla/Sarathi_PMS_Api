package com.sarathi.support.dto;

import java.sql.Timestamp;
import java.time.Instant;

public class UserDTO {
    private Integer id;
    private String login;
    private String hashedPassword;
    private String firstname;
    private String lastname;
    private Boolean admin;
    private Integer status;
    private Timestamp lastLoginOn;
    private String language;
    private Integer authSourceId;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private String type;
    private String identityUrl;
    private String mailNotification;
    private String salt;
    private Boolean mustChangePasswd;
    private Timestamp passwdChangedOn;

    public UserDTO() {}

    public UserDTO(Integer id, String login, String hashedPassword, String firstname, String lastname, Boolean admin,
                   Integer status, Timestamp lastLoginOn, String language, Integer authSourceId, Timestamp createdOn, Timestamp updatedOn,
                   String type, String identityUrl, String mailNotification, String salt, Boolean mustChangePasswd, Timestamp passwdChangedOn) {
        this.id = id;
        this.login = login;
        this.hashedPassword = hashedPassword;
        this.firstname = firstname;
        this.lastname = lastname;
        this.admin = admin;
        this.status = status;
        this.lastLoginOn = lastLoginOn;
        this.language = language;
        this.authSourceId = authSourceId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.type = type;
        this.identityUrl = identityUrl;
        this.mailNotification = mailNotification;
        this.salt = salt;
        this.mustChangePasswd = mustChangePasswd;
        this.passwdChangedOn = passwdChangedOn;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Timestamp getLastLoginOn() {
		return lastLoginOn;
	}

	public void setLastLoginOn(Timestamp lastLoginOn) {
		this.lastLoginOn = lastLoginOn;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getAuthSourceId() {
		return authSourceId;
	}

	public void setAuthSourceId(Integer authSourceId) {
		this.authSourceId = authSourceId;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIdentityUrl() {
		return identityUrl;
	}

	public void setIdentityUrl(String identityUrl) {
		this.identityUrl = identityUrl;
	}

	public String getMailNotification() {
		return mailNotification;
	}

	public void setMailNotification(String mailNotification) {
		this.mailNotification = mailNotification;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Boolean getMustChangePasswd() {
		return mustChangePasswd;
	}

	public void setMustChangePasswd(Boolean mustChangePasswd) {
		this.mustChangePasswd = mustChangePasswd;
	}

	public Timestamp getPasswdChangedOn() {
		return passwdChangedOn;
	}

	public void setPasswdChangedOn(Timestamp passwdChangedOn) {
		this.passwdChangedOn = passwdChangedOn;
	}

 }

