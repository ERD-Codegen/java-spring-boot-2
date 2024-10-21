package io.github.raeperd.realworld.domain.article.tag;

import io.github.raeperd.realworld.domain.article.Article;
import io.github.raeperd.realworld.domain.tag.Tag;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "article_tags")
public class ArticleTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id", nullable = false)
    private Article article;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id", nullable = false)
    private Tag tag;

    // Getters and setters omitted for brevity
}