package  com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "watchers", schema = "public", indexes = {
        @Index(name = "index_watchers_on_watchable_id_and_watchable_type", columnList = "watchable_id, watchable_type"),
        @Index(name = "watchers_user_id_type", columnList = "user_id, watchable_type"),
        @Index(name = "index_watchers_on_user_id", columnList = "user_id")
})
public class Watcher {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;


    @Column(name = "watchable_type", nullable = false)
    private String watchableType;

    @Column(name = "watchable_id", nullable = false)
    private Integer watchableId;

    @Column(name = "user_id")
    private Integer userId;

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