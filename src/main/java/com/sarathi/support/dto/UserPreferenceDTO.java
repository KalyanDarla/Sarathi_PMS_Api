package com.sarathi.support.dto;

public class UserPreferenceDTO {
    private Integer id;
    private Integer userId;
    private String others;
    private Boolean hideMail;
    private String timeZone;

    public UserPreferenceDTO() {}

    public UserPreferenceDTO(Integer id, Integer userId, String others, Boolean hideMail, String timeZone) {
        this.id = id;
        this.userId = userId;
        this.others = others;
        this.hideMail = hideMail;
        this.timeZone = timeZone;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public Boolean getHideMail() {
		return hideMail;
	}

	public void setHideMail(Boolean hideMail) {
		this.hideMail = hideMail;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

 }
