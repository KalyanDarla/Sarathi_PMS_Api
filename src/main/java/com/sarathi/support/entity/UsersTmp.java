package  com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users_tmp", schema = "public")
public class UsersTmp {
    @Id
    @Column(name = "id")
    private Integer id;


    @Column(name = "login")
    private String login;

    @Column(name = "hashed_password", length = 40)
    private String hashedPassword;

    @Column(name = "firstname", length = 30)
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "admin")
    private Boolean admin;

    @Column(name = "status")
    private Integer status;

    @Column(name = "last_login_on")
    private Instant lastLoginOn;

    @Column(name = "language", length = 5)
    private String language;

    @Column(name = "auth_source_id")
    private Integer authSourceId;

    @Column(name = "created_on")
    private Instant createdOn;

    @Column(name = "updated_on")
    private Instant updatedOn;


    @Column(name = "type")
    private String type;


    @Column(name = "identity_url")
    private String identityUrl;


    @Column(name = "mail_notification")
    private String mailNotification;

    @Column(name = "salt", length = 64)
    private String salt;

    @Column(name = "must_change_passwd")
    private Boolean mustChangePasswd;

    @Column(name = "passwd_changed_on")
    private Instant passwdChangedOn;

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

    public Instant getLastLoginOn() {
        return lastLoginOn;
    }

    public void setLastLoginOn(Instant lastLoginOn) {
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

    public Instant getPasswdChangedOn() {
        return passwdChangedOn;
    }

    public void setPasswdChangedOn(Instant passwdChangedOn) {
        this.passwdChangedOn = passwdChangedOn;
    }

}