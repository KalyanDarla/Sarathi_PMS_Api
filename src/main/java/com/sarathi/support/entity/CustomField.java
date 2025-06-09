package com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "custom_fields", schema = "public", indexes = {
        @Index(name = "index_custom_fields_on_id_and_type", columnList = "id, type")
})
public class CustomField {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "type", nullable = false, length = 30)
    private String type;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "field_format", nullable = false, length = 30)
    private String fieldFormat;

    @Column(name = "possible_values")
    private String possibleValues;

    @Column(name = "regexp")
    private String regexp;

    @Column(name = "min_length")
    private Integer minLength;

    @Column(name = "max_length")
    private Integer maxLength;

    @Column(name = "is_required", nullable = false)
    private Boolean isRequired = false;

    @Column(name = "is_for_all", nullable = false)
    private Boolean isForAll = false;

    @Column(name = "is_filter", nullable = false)
    private Boolean isFilter = false;

    @Column(name = "\"position\"")
    private Integer position;

    @Column(name = "searchable")
    private Boolean searchable;

    @Column(name = "default_value")
    private String defaultValue;

    @Column(name = "editable")
    private Boolean editable;

    @Column(name = "visible", nullable = false)
    private Boolean visible = false;

    @Column(name = "multiple")
    private Boolean multiple;

    @Column(name = "format_store")
    private String formatStore;

    @Column(name = "description")
    private String description;

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