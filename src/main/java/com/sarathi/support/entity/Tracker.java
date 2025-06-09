package  com.sarathi.support.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trackers", schema = "public")
public class Tracker {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "is_in_chlog", nullable = false)
    private Boolean isInChlog = false;

    @Column(name = "\"position\"")
    private Integer position;

    @Column(name = "is_in_roadmap", nullable = false)
    private Boolean isInRoadmap = false;

    @Column(name = "fields_bits")
    private Integer fieldsBits;

    @Column(name = "default_status_id")
    private Integer defaultStatusId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsInChlog() {
        return isInChlog;
    }

    public void setIsInChlog(Boolean isInChlog) {
        this.isInChlog = isInChlog;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getIsInRoadmap() {
        return isInRoadmap;
    }

    public void setIsInRoadmap(Boolean isInRoadmap) {
        this.isInRoadmap = isInRoadmap;
    }

    public Integer getFieldsBits() {
        return fieldsBits;
    }

    public void setFieldsBits(Integer fieldsBits) {
        this.fieldsBits = fieldsBits;
    }

    public Integer getDefaultStatusId() {
        return defaultStatusId;
    }

    public void setDefaultStatusId(Integer defaultStatusId) {
        this.defaultStatusId = defaultStatusId;
    }

}