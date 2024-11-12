package io.github.raeperd.realworld.domain.user;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
// The table name from the new code is used as it seems to be a newer version naming convention
@Table(name = "12345678_tg9h_v2w_l5k_b6r_uo_q1z_ym_nx_s8c_jp_kf_r4i_wz_l7d_aa0t")
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
    // Assuming constructors, getters, and setters are identical in both versions, they are not repeated here.
    // If there are differences, they should be merged here as well.
}
