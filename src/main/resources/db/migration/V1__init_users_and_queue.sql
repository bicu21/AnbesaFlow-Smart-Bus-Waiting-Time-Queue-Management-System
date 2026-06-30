-- Create users table for AnbesaFlow Authentication
CREATE TABLE IF NOT EXISTS users (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);

CREATE INDEX IF NOT EXISTS idx_users_email ON users(email);

-- Create passenger queue entries table
CREATE TABLE IF NOT EXISTS queue_entries (
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

CREATE INDEX IF NOT EXISTS idx_queue_bus_stop ON queue_entries(bus_stop);
CREATE INDEX IF NOT EXISTS idx_queue_position ON queue_entries(position);