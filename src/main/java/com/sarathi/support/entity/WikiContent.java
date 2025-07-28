package  com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "wiki_contents", schema = "public", indexes = {
        @Index(name = "wiki_contents_page_id", columnList = "page_id"),
        @Index(name = "index_wiki_contents_on_author_id", columnList = "author_id")
})
public class WikiContent {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "page_id", nullable = false)
    private Integer pageId;

    @Column(name = "author_id")
    private Integer authorId;


    @Column(name = "text")
    private String text;

    @Column(name = "comments", length = 1024)
    private String comments;

    @Column(name = "updated_on", nullable = false)
    private Instant updatedOn;

    @Column(name = "version", nullable = false)
    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Instant getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Instant updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}