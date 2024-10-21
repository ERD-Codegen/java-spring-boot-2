CREATE TABLE IF NOT EXISTS article_tags
(
    id          BIGSERIAL PRIMARY KEY,
    article_id  BIGINT NOT NULL,
    tag_id      BIGINT NOT NULL,
    CONSTRAINT fk_article_tags_article FOREIGN KEY (article_id) REFERENCES articles (id) ON DELETE CASCADE,
    CONSTRAINT fk_article_tags_tag FOREIGN KEY (tag_id) REFERENCES tags (id) ON DELETE CASCADE
);