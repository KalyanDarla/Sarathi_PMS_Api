package com.sarathi.support.dto;

public class QueryDTO {
    private Integer id;
    private Integer projectId;
    private String name;
    private String filters;
    private Integer userId;
    private String columnNames;
    private String sortCriteria;
    private String groupBy;
    private String type;
    private Integer visibility;
    private String options;

    public QueryDTO() {}

    public QueryDTO(Integer id, Integer projectId, String name, String filters, Integer userId, String columnNames,
                    String sortCriteria, String groupBy, String type, Integer visibility, String options) {
        this.id = id;
        this.projectId = projectId;
        this.name = name;
        this.filters = filters;
        this.userId = userId;
        this.columnNames = columnNames;
        this.sortCriteria = sortCriteria;
        this.groupBy = groupBy;
        this.type = type;
        this.visibility = visibility;
        this.options = options;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFilters() {
		return filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getColumnNames() {
		return columnNames;
	}

	public void setColumnNames(String columnNames) {
		this.columnNames = columnNames;
	}

	public String getSortCriteria() {
		return sortCriteria;
	}

	public void setSortCriteria(String sortCriteria) {
		this.sortCriteria = sortCriteria;
	}

	public String getGroupBy() {
		return groupBy;
	}

	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getVisibility() {
		return visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

 }

