package com.sarathi.support.dto;

public class BoardDTO {
    private Integer id;
    private Integer projectId;
    private String name;
    private String description;
    private Integer position;
    private Integer topicsCount;
    private Integer messagesCount;
    private Integer lastMessageId;
    private Integer parentId;

    public BoardDTO() {}

    public BoardDTO(Integer id, Integer projectId, String name, String description, Integer position, Integer topicsCount, Integer messagesCount, Integer lastMessageId, Integer parentId) {
        this.id = id;
        this.projectId = projectId;
        this.name = name;
        this.description = description;
        this.position = position;
        this.topicsCount = topicsCount;
        this.messagesCount = messagesCount;
        this.lastMessageId = lastMessageId;
        this.parentId = parentId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Integer getTopicsCount() {
		return topicsCount;
	}

	public void setTopicsCount(Integer topicsCount) {
		this.topicsCount = topicsCount;
	}

	public Integer getMessagesCount() {
		return messagesCount;
	}

	public void setMessagesCount(Integer messagesCount) {
		this.messagesCount = messagesCount;
	}

	public Integer getLastMessageId() {
		return lastMessageId;
	}

	public void setLastMessageId(Integer lastMessageId) {
		this.lastMessageId = lastMessageId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
 
}
