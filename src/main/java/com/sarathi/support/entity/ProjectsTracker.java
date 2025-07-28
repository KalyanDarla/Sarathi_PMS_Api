package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "projects_trackers", schema = "public", indexes = {
        @Index(name = "projects_trackers_unique", columnList = "project_id, tracker_id", unique = true),
        @Index(name = "projects_trackers_project_id", columnList = "project_id")
})
public class ProjectsTracker {
    @Column(name = "project_id", nullable = false)
    private Integer projectId;
    @Id
    @Column(name = "tracker_id", nullable = false)
    private Integer trackerId;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }

}