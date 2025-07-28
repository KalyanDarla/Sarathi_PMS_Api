package com.sarathi.support.dto;

public class ImportItemDTO {
    private Integer id;
    private Integer importId;
    private Integer position;
    private Integer objId;
    private String message;

    public ImportItemDTO() {}

    public ImportItemDTO(Integer id, Integer importId, Integer position, Integer objId, String message) {
        this.id = id;
        this.importId = importId;
        this.position = position;
        this.objId = objId;
        this.message = message;
    }

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
