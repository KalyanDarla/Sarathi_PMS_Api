package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "auth_sources", schema = "public", indexes = {
        @Index(name = "index_auth_sources_on_id_and_type", columnList = "id, type")
})
public class AuthSource {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "type", nullable = false, length = 30)
    private String type;

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @Column(name = "host", length = 60)
    private String host;

    @Column(name = "port")
    private Integer port;

     @Column(name = "account")
    private String account;

    @Column(name = "account_password")
    private String accountPassword;

    @Column(name = "base_dn")
    private String baseDn;

    @Column(name = "attr_login", length = 30)
    private String attrLogin;

    @Column(name = "attr_firstname", length = 30)
    private String attrFirstname;

    @Column(name = "attr_lastname", length = 30)
    private String attrLastname;

    @Column(name = "attr_mail", length = 30)
    private String attrMail;

    @Column(name = "onthefly_register", nullable = false)
    private Boolean ontheflyRegister = false;

    @Column(name = "tls", nullable = false)
    private Boolean tls = false;

     @Column(name = "filter")
    private String filter;

    @Column(name = "timeout")
    private Integer timeout;

    @Column(name = "verify_peer", nullable = false)
    private Boolean verifyPeer = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public String getBaseDn() {
        return baseDn;
    }

    public void setBaseDn(String baseDn) {
        this.baseDn = baseDn;
    }

    public String getAttrLogin() {
        return attrLogin;
    }

    public void setAttrLogin(String attrLogin) {
        this.attrLogin = attrLogin;
    }

    public String getAttrFirstname() {
        return attrFirstname;
    }

    public void setAttrFirstname(String attrFirstname) {
        this.attrFirstname = attrFirstname;
    }

    public String getAttrLastname() {
        return attrLastname;
    }

    public void setAttrLastname(String attrLastname) {
        this.attrLastname = attrLastname;
    }

    public String getAttrMail() {
        return attrMail;
    }

    public void setAttrMail(String attrMail) {
        this.attrMail = attrMail;
    }

    public Boolean getOntheflyRegister() {
        return ontheflyRegister;
    }

    public void setOntheflyRegister(Boolean ontheflyRegister) {
        this.ontheflyRegister = ontheflyRegister;
    }

    public Boolean getTls() {
        return tls;
    }

    public void setTls(Boolean tls) {
        this.tls = tls;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Boolean getVerifyPeer() {
        return verifyPeer;
    }

    public void setVerifyPeer(Boolean verifyPeer) {
        this.verifyPeer = verifyPeer;
    }

}