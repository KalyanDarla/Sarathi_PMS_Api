package  com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_preferences", schema = "public", indexes = {
        @Index(name = "index_user_preferences_on_user_id", columnList = "user_id")
})
public class UserPreference {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "others")
    private String others;

    @Column(name = "hide_mail")
    private Boolean hideMail;

    @Column(name = "time_zone")
    private String timeZone;

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