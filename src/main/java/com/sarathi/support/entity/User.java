package  com.sarathi.support.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "users", schema = "public", indexes = {
        @Index(name = "index_users_on_id_and_type", columnList = "id, type"),
        @Index(name = "index_users_on_auth_source_id", columnList = "auth_source_id"),
        @Index(name = "index_users_on_type", columnList = "type")
})
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "hashed_password", nullable = false)
    private String hashedPassword;

    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "admin", nullable = false)
    private Boolean admin = false;

    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "last_login_on")
    private Timestamp lastLoginOn;

    @Column(name = "language")
    private String language;

    @Column(name = "auth_source_id")
    private Integer authSourceId;

    @Column(name = "created_on",columnDefinition = "TIMESTAMP")
    private Timestamp createdOn;

    @Column(name = "updated_on")
    private Timestamp updatedOn;

    @Column(name = "type")
    private String type;

    @Column(name = "identity_url")
    private String identityUrl;

    @Column(name = "mail_notification", nullable = false)
    private String mailNotification;

    @Column(name = "salt" )
    private String salt;

    @Column(name = "must_change_passwd", nullable = false)
    private Boolean mustChangePasswd = false;

    @Column(name = "passwd_changed_on")
    private Timestamp passwdChangedOn;

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