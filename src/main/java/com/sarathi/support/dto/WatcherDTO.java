package com.sarathi.support.dto;

public class WatcherDTO {
    private Integer id;
    private String watchableType;
    private Integer watchableId;
    private Integer userId;

    public WatcherDTO() {}

    public WatcherDTO(Integer id, String watchableType, Integer watchableId, Integer userId) {
        this.id = id;
        this.watchableType = watchableType;
        this.watchableId = watchableId;
        this.userId = userId;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWatchableType() {
		return watchableType;
	}

	public void setWatchableType(String watchableType) {
		this.watchableType = watchableType;
	}

	public Integer getWatchableId() {
		return watchableId;
	}

	public void setWatchableId(Integer watchableId) {
		this.watchableId = watchableId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

 }

