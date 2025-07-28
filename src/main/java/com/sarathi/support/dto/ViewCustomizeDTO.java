package com.sarathi.support.dto;

public class ViewCustomizeDTO {
    private Integer id;
    private String pathPattern;
    private String code;
    private Boolean isEnabled;
    private Boolean isPrivate;
    private Integer authorId;
    private String insertionPosition;
    private String customizeType;
    private String comments;

    public ViewCustomizeDTO() {}

    public ViewCustomizeDTO(Integer id, String pathPattern, String code, Boolean isEnabled, Boolean isPrivate, Integer authorId, 
                            String insertionPosition, String customizeType, String comments) {
        this.id = id;
        this.pathPattern = pathPattern;
        this.code = code;
        this.isEnabled = isEnabled;
        this.isPrivate = isPrivate;
        this.authorId = authorId;
        this.insertionPosition = insertionPosition;
        this.customizeType = customizeType;
        this.comments = comments;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPathPattern() {
		return pathPattern;
	}

	public void setPathPattern(String pathPattern) {
		this.pathPattern = pathPattern;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Boolean getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getInsertionPosition() {
		return insertionPosition;
	}

	public void setInsertionPosition(String insertionPosition) {
		this.insertionPosition = insertionPosition;
	}

	public String getCustomizeType() {
		return customizeType;
	}

	public void setCustomizeType(String customizeType) {
		this.customizeType = customizeType;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

 }

