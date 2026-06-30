CREATE TABLE queue_entries (

    id BIGSERIAL PRIMARY KEY,

    position INTEGER NOT NULL,

    joined_at TIMESTAMP NOT NULL,

    bus_stop VARCHAR(100) NOT NULL,

    user_id BIGINT NOT NULL UNIQUE,

    CONSTRAINT fk_queue_user
        FOREIGN KEY(user_id)
        REFERENCES users(id)
        ON DELETE CASCADE
);

CREATE INDEX idx_queue_bus_stop
ON queue_entries(bus_stop);

CREATE INDEX idx_queue_position
ON queue_entries(position);