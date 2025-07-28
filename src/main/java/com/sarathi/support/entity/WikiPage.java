package  com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "wiki_pages", schema = "public", indexes = {
        @Index(name = "wiki_pages_wiki_id_title", columnList = "wiki_id, title"),
        @Index(name = "index_wiki_pages_on_wiki_id", columnList = "wiki_id"),
        @Index(name = "index_wiki_pages_on_parent_id", columnList = "parent_id")
})
public class WikiPage {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "wiki_id", nullable = false)
    private Integer wikiId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "created_on", nullable = false)
    private Instant createdOn;

    @Column(name = "protected", nullable = false)
    private Boolean protectedField = false;

    @Column(name = "parent_id")
    private Integer parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWikiId() {
        return wikiId;
    }

    public void setWikiId(Integer wikiId) {
        this.wikiId = wikiId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public Boolean getProtectedField() {
        return protectedField;
    }

    public void setProtectedField(Boolean protectedField) {
        this.protectedField = protectedField;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

}