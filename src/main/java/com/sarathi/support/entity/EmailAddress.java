package com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "email_addresses", schema = "public", indexes = {
        @Index(name = "index_email_addresses_on_user_id", columnList = "user_id")
})
public class EmailAddress {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "is_default", nullable = false)
    private Boolean isDefault = false;

    @Column(name = "notify", nullable = false)
    private Boolean notify = false;

    @Column(name = "created_on", nullable = false)
    private Instant createdOn;

    @Column(name = "updated_on", nullable = false)
    private Instant updatedOn;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getNotify() {
        return notify;
    }

    public void setNotify(Boolean notify) {
        this.notify = notify;
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

}