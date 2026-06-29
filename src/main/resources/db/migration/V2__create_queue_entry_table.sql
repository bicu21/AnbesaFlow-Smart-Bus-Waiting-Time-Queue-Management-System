CREATE TABLE queue_entry (
    id BIGSERIAL PRIMARY KEY,
    position INT NOT NULL,
    joined_at TIMESTAMP NOT NULL,

    user_id BIGINT NOT NULL,
    bus_stop VARCHAR(100) NOT NULL,

    CONSTRAINT fk_queue_user FOREIGN KEY (user_id) REFERENCES users(id)
);