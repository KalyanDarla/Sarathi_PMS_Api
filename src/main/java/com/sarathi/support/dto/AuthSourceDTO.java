package com.sarathi.support.dto;

public class AuthSourceDTO {
	private Integer id;
	private String type;
	private String name;
	private String host;
	private Integer port;
	private String account;
	private String accountPassword;
	private String baseDn;
	private String attrLogin;
	private String attrFirstname;
	private String attrLastname;
	private String attrMail;
	private Boolean ontheflyRegister;
	private Boolean tls;
	private String filter;
	private Integer timeout;
	private Boolean verifyPeer;

	public AuthSourceDTO() {
	}

	public AuthSourceDTO(Integer id, String type, String name, String host, Integer port, String account,
			String accountPassword, String baseDn, String attrLogin, String attrFirstname, String attrLastname,
			String attrMail, Boolean ontheflyRegister, Boolean tls, String filter, Integer timeout,
			Boolean verifyPeer) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.host = host;
		this.port = port;
		this.account = account;
		this.accountPassword = accountPassword;
		this.baseDn = baseDn;
		this.attrLogin = attrLogin;
		this.attrFirstname = attrFirstname;
		this.attrLastname = attrLastname;
		this.attrMail = attrMail;
		this.ontheflyRegister = ontheflyRegister;
		this.tls = tls;
		this.filter = filter;
		this.timeout = timeout;
		this.verifyPeer = verifyPeer;
	}

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
