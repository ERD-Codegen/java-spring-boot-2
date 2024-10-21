package io.github.raeperd.realworld.domain.article.tag;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.TemporalType.TIMESTAMP;

@Table(name = "tags")
@Entity
public class Tag {

    @GeneratedValue(strategy = IDENTITY)
    @Id
    private Long id;

    @Column(name = "value", unique = true, nullable = false)
    private String value;

    @Column(name = "created_at", nullable = false)
    @Temporal(TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at", nullable = false)
    @Temporal(TIMESTAMP)
    private Date updatedAt;

    public Tag(String value) {
        this.value = value;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    protected Tag() {
    }

    // Getters and setters for createdAt and updatedAt
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var tag = (Tag) o;
        return value.equals(tag.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
