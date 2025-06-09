package  com.sarathi.support.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "view_customizes", schema = "public")
public class ViewCustomize {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;


    @Column(name = "path_pattern", nullable = false)
    private String pathPattern;

     @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "is_enabled", nullable = false)
    private Boolean isEnabled = false;

    @Column(name = "is_private", nullable = false)
    private Boolean isPrivate = false;

    @Column(name = "author_id", nullable = false)
    private Integer authorId;


    @Column(name = "insertion_position", nullable = false)
    private String insertionPosition;


    @Column(name = "customize_type", nullable = false)
    private String customizeType;


    @Column(name = "comments")
    private String comments;

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