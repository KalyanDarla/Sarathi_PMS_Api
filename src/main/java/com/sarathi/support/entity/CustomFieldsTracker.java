package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "custom_fields_trackers", schema = "public", indexes = {
        @Index(name = "index_custom_fields_trackers_on_custom_field_id_and_tracker_id", columnList = "custom_field_id, tracker_id", unique = true)
})
public class CustomFieldsTracker {
    @Id
    @Column(name = "custom_field_id", nullable = false)
    private Integer customFieldId;

    @Column(name = "tracker_id", nullable = false)
    private Integer trackerId;

    public Integer getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(Integer customFieldId) {
        this.customFieldId = customFieldId;
    }

    public Integer getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }

}