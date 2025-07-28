package com.sarathi.support.dto;

public class CustomFieldDTO {
    private Integer id;
    private String type;
    private String name;
    private String fieldFormat;
    private String possibleValues;
    private String regexp;
    private Integer minLength;
    private Integer maxLength;
    private Boolean isRequired;
    private Boolean isForAll;
    private Boolean isFilter;
    private Integer position;
    private Boolean searchable;
    private String defaultValue;
    private Boolean editable;
    private Boolean visible;
    private Boolean multiple;
    private String formatStore;
    private String description;

    public CustomFieldDTO() {}

    public CustomFieldDTO(Integer id, String type, String name, String fieldFormat, String possibleValues, String regexp,
                          Integer minLength, Integer maxLength, Boolean isRequired, Boolean isForAll, Boolean isFilter, Integer position,
                          Boolean searchable, String defaultValue, Boolean editable, Boolean visible, Boolean multiple, String formatStore, String description) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.fieldFormat = fieldFormat;
        this.possibleValues = possibleValues;
        this.regexp = regexp;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.isRequired = isRequired;
        this.isForAll = isForAll;
        this.isFilter = isFilter;
        this.position = position;
        this.searchable = searchable;
        this.defaultValue = defaultValue;
        this.editable = editable;
        this.visible = visible;
        this.multiple = multiple;
        this.formatStore = formatStore;
        this.description = description;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFieldFormat() {
		return fieldFormat;
	}

	public void setFieldFormat(String fieldFormat) {
		this.fieldFormat = fieldFormat;
	}

	public String getPossibleValues() {
		return possibleValues;
	}

	public void setPossibleValues(String possibleValues) {
		this.possibleValues = possibleValues;
	}

	public String getRegexp() {
		return regexp;
	}

	public void setRegexp(String regexp) {
		this.regexp = regexp;
	}

	public Integer getMinLength() {
		return minLength;
	}

	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}

	public Integer getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}

	public Boolean getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}

	public Boolean getIsForAll() {
		return isForAll;
	}

	public void setIsForAll(Boolean isForAll) {
		this.isForAll = isForAll;
	}

	public Boolean getIsFilter() {
		return isFilter;
	}

	public void setIsFilter(Boolean isFilter) {
		this.isFilter = isFilter;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Boolean getSearchable() {
		return searchable;
	}

	public void setSearchable(Boolean searchable) {
		this.searchable = searchable;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public Boolean getEditable() {
		return editable;
	}

	public void setEditable(Boolean editable) {
		this.editable = editable;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public Boolean getMultiple() {
		return multiple;
	}

	public void setMultiple(Boolean multiple) {
		this.multiple = multiple;
	}

	public String getFormatStore() {
		return formatStore;
	}

	public void setFormatStore(String formatStore) {
		this.formatStore = formatStore;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
    

 }
