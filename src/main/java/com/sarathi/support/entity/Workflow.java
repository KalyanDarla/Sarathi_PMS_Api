package  com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "workflows", schema = "public", indexes = {
        @Index(name = "index_workflows_on_tracker_id", columnList = "tracker_id"),
        @Index(name = "index_workflows_on_old_status_id", columnList = "old_status_id"),
        @Index(name = "index_workflows_on_new_status_id", columnList = "new_status_id"),
        @Index(name = "wkfs_role_tracker_old_status", columnList = "role_id, tracker_id, old_status_id"),
        @Index(name = "index_workflows_on_role_id", columnList = "role_id")
})
public class Workflow {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "tracker_id", nullable = false)
    private Integer trackerId;

    @Column(name = "old_status_id", nullable = false)
    private Integer oldStatusId;

    @Column(name = "new_status_id", nullable = false)
    private Integer newStatusId;

    @Column(name = "role_id", nullable = false)
    private Integer roleId;

    @Column(name = "assignee", nullable = false)
    private Boolean assignee = false;

    @Column(name = "author", nullable = false)
    private Boolean author = false;

    @Column(name = "type", length = 30)
    private String type;

    @Column(name = "field_name", length = 30)
    private String fieldName;

    @Column(name = "rule", length = 30)
    private String rule;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }

    public Integer getOldStatusId() {
        return oldStatusId;
    }

    public void setOldStatusId(Integer oldStatusId) {
        this.oldStatusId = oldStatusId;
    }

    public Integer getNewStatusId() {
        return newStatusId;
    }

    public void setNewStatusId(Integer newStatusId) {
        this.newStatusId = newStatusId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Boolean getAssignee() {
        return assignee;
    }

    public void setAssignee(Boolean assignee) {
        this.assignee = assignee;
    }

    public Boolean getAuthor() {
        return author;
    }

    public void setAuthor(Boolean author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

}