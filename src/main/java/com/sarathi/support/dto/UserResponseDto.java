package com.sarathi.support.dto;

public class UserResponseDto {
    private Integer userId;
    private String username;

    public UserResponseDto(Integer userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public UserResponseDto() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
