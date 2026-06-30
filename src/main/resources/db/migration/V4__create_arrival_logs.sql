CREATE TABLE IF NOT EXISTS arrival_logs (
    id BIGSERIAL PRIMARY KEY,
    bus_id BIGINT NOT NULL,
    bus_stop_id BIGINT NOT NULL,
    arrival_time TIMESTAMP,
    departure_time TIMESTAMP,
    status VARCHAR(50) NOT NULL DEFAULT 'ACTIVE',
    CONSTRAINT fk_arrival_bus
        FOREIGN KEY (bus_id)
        REFERENCES buses(id)
        ON DELETE CASCADE,
    CONSTRAINT fk_arrival_stop
        FOREIGN KEY (bus_stop_id)
        REFERENCES bus_stops(id)
        ON DELETE CASCADE
);

CREATE INDEX IF NOT EXISTS idx_arrival_bus ON arrival_logs(bus_id);
CREATE INDEX IF NOT EXISTS idx_arrival_stop ON arrival_logs(bus_stop_id);