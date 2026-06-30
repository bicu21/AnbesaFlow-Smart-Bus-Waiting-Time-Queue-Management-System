CREATE TABLE IF NOT EXISTS arrival_logs (
    id BIGSERIAL PRIMARY KEY,
    bus_id BIGINT NOT NULL,
    bus_stop_id BIGINT NOT NULL,
    arrival_time TIMESTAMP NOT NULL,
    departure_time TIMESTAMP,
    CONSTRAINT fk_arrival_log_bus
        FOREIGN KEY(bus_id)
        REFERENCES buses(id)
        ON DELETE CASCADE,
    CONSTRAINT fk_arrival_log_bus_stop
        FOREIGN KEY(bus_stop_id)
        REFERENCES bus_stops(id)
        ON DELETE CASCADE
);
