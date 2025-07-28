package  com.sarathi.support.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "wiki_redirects", schema = "public", indexes = {
        @Index(name = "wiki_redirects_wiki_id_title", columnList = "wiki_id, title"),
        @Index(name = "index_wiki_redirects_on_wiki_id", columnList = "wiki_id")
})
public class WikiRedirect {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "wiki_id", nullable = false)
    private Integer wikiId;


    @Column(name = "title")
    private String title;


    @Column(name = "redirects_to")
    private String redirectsTo;

    @Column(name = "created_on", nullable = false)
    private Instant createdOn;

    @Column(name = "redirects_to_wiki_id", nullable = false)
    private Integer redirectsToWikiId;

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

    public String getRedirectsTo() {
        return redirectsTo;
    }

    public void setRedirectsTo(String redirectsTo) {
        this.redirectsTo = redirectsTo;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getRedirectsToWikiId() {
        return redirectsToWikiId;
    }

    public void setRedirectsToWikiId(Integer redirectsToWikiId) {
        this.redirectsToWikiId = redirectsToWikiId;
    }

}