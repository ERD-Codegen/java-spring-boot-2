CREATE TABLE IF NOT EXISTS `tg9h_v2w_l5k_b6r_uo_q1z_ym_nx_s8c_jp_kf_r4i_wz_l7d_aa0t` (
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `followee_id` BIGINT NOT NULL,
  `follower_id` BIGINT NOT NULL,
  FOREIGN KEY (`followee_id`) REFERENCES `users`(`id`),
  FOREIGN KEY (`follower_id`) REFERENCES `users`(`id`)
);