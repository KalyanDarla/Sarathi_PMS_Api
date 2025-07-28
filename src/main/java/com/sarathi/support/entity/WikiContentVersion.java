package  com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "wiki_content_versions", schema = "public", indexes = {
        @Index(name = "wiki_content_versions_wcid", columnList = "wiki_content_id"),
        @Index(name = "index_wiki_content_versions_on_updated_on", columnList = "updated_on")
})
public class WikiContentVersion {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "wiki_content_id", nullable = false)
    private Integer wikiContentId;

    @Column(name = "page_id", nullable = false)
    private Integer pageId;

    @Column(name = "author_id")
    private Integer authorId;

    @Column(name = "data")
    private byte[] data;

    @Column(name = "compression", length = 6)
    private String compression;

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

    public Integer getWikiContentId() {
        return wikiContentId;
    }

    public void setWikiContentId(Integer wikiContentId) {
        this.wikiContentId = wikiContentId;
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

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getCompression() {
        return compression;
    }

    public void setCompression(String compression) {
        this.compression = compression;
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