-- V2: Create routes table
-- Schema matches Route entity: id (BIGSERIAL), name, start_point, end_point, created_at
CREATE TABLE routes (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    start_point VARCHAR(100) NOT NULL,
    end_point VARCHAR(100) NOT NULL,
    created_at TIMESTAMP
);

CREATE INDEX idx_routes_name ON routes(name);