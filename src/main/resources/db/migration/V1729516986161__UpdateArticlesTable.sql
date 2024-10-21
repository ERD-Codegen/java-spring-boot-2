-- Add new columns and relationships to the articles table
ALTER TABLE articles
ADD COLUMN title VARCHAR(255) NOT NULL,
ADD COLUMN body TEXT NOT NULL,
ADD COLUMN status VARCHAR(50) NOT NULL,
ADD COLUMN user_id BIGINT NOT NULL,
ADD COLUMN category_id BIGINT NOT NULL,
ADD CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users (id),
ADD CONSTRAINT fk_category FOREIGN KEY (category_id) REFERENCES categories (id);