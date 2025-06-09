package  com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "settings", schema = "public", indexes = {
        @Index(name = "index_settings_on_name", columnList = "name")
})
public class Setting {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;


    @Column(name = "value")
    private String value;

    @Column(name = "updated_on")
    private Instant updatedOn;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Instant getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Instant updatedOn) {
        this.updatedOn = updatedOn;
    }

}