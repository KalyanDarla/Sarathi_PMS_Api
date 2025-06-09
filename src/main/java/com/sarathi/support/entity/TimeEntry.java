package  com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "time_entries", schema = "public", indexes = {
        @Index(name = "time_entries_project_id", columnList = "project_id"),
        @Index(name = "index_time_entries_on_user_id", columnList = "user_id"),
        @Index(name = "time_entries_issue_id", columnList = "issue_id"),
        @Index(name = "index_time_entries_on_activity_id", columnList = "activity_id"),
        @Index(name = "index_time_entries_on_created_on", columnList = "created_on")
})
public class TimeEntry {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "project_id", nullable = false)
    private Integer projectId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "issue_id")
    private Integer issueId;

    @Column(name = "hours", nullable = false)
    private Double hours;

    @Column(name = "comments", length = 1024)
    private String comments;

    @Column(name = "activity_id", nullable = false)
    private Integer activityId;

    @Column(name = "spent_on", nullable = false)
    private LocalDate spentOn;

    @Column(name = "tyear", nullable = false)
    private Integer tyear;

    @Column(name = "tmonth", nullable = false)
    private Integer tmonth;

    @Column(name = "tweek", nullable = false)
    private Integer tweek;

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

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public LocalDate getSpentOn() {
        return spentOn;
    }

    public void setSpentOn(LocalDate spentOn) {
        this.spentOn = spentOn;
    }

    public Integer getTyear() {
        return tyear;
    }

    public void setTyear(Integer tyear) {
        this.tyear = tyear;
    }

    public Integer getTmonth() {
        return tmonth;
    }

    public void setTmonth(Integer tmonth) {
        this.tmonth = tmonth;
    }

    public Integer getTweek() {
        return tweek;
    }

    public void setTweek(Integer tweek) {
        this.tweek = tweek;
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