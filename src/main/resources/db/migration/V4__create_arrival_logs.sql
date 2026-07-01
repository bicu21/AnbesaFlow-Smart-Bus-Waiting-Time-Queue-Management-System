-- V4: Create queue_entries and arrival_logs tables
-- Schema matches QueueEntry entity: id, position, joined_at, user_id (FK), bus_stop
CREATE TABLE queue_entries (
    id BIGSERIAL PRIMARY KEY,
    position INT NOT NULL,
    joined_at TIMESTAMP NOT NULL,
    user_id BIGINT NOT NULL,
    bus_stop VARCHAR(255) NOT NULL,
    CONSTRAINT fk_queue_user
        FOREIGN KEY (user_id) REFERENCES users(id)
        ON DELETE CASCADE
);

CREATE INDEX idx_queue_bus_stop ON queue_entries(bus_stop);
CREATE INDEX idx_queue_user ON queue_entries(user_id);

-- Schema matches ArrivalLog entity: id, bus_id (FK), bus_stop_id (FK), arrival_time, departure_time, status
CREATE TABLE arrival_logs (
    id BIGSERIAL PRIMARY KEY,
    bus_id BIGINT NOT NULL,
    bus_stop_id BIGINT NOT NULL,
    arrival_time TIMESTAMP,
    departure_time TIMESTAMP,
    status VARCHAR(50) NOT NULL,
    CONSTRAINT fk_arrival_bus
        FOREIGN KEY (bus_id) REFERENCES buses(id)
        ON DELETE CASCADE,
    CONSTRAINT fk_arrival_bus_stop
        FOREIGN KEY (bus_stop_id) REFERENCES bus_stops(id)
        ON DELETE CASCADE
);

CREATE INDEX idx_arrival_bus ON arrival_logs(bus_id);
CREATE INDEX idx_arrival_bus_stop ON arrival_logs(bus_stop_id);