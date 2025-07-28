package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "import_items", schema = "public")
public class ImportItem {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "import_id", nullable = false)
    private Integer importId;

    @Column(name = "\"position\"", nullable = false)
    private Integer position;

    @Column(name = "obj_id")
    private Integer objId;

    @Column(name = "message")
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImportId() {
        return importId;
    }

    public void setImportId(Integer importId) {
        this.importId = importId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getObjId() {
        return objId;
    }

    public void setObjId(Integer objId) {
        this.objId = objId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}