package io.github.raeperd.realworld.domain.user;

import javax.persistence.*;

@Entity
@Table(name = "1234567890123456789012345678901abcd")
public class FollowRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "followee_id", nullable = false)
    private User followee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "follower_id", nullable = false)
    private User follower;

    // Constructors, getters, and setters
}