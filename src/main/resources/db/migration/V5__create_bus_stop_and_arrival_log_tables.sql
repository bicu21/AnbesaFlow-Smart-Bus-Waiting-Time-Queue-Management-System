CREATE TABLE bus_stops (

    id BIGSERIAL PRIMARY KEY,

    name VARCHAR(120) NOT NULL,

    location VARCHAR(255) NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE arrival_logs (

    id BIGSERIAL PRIMARY KEY,

    bus_id BIGINT NOT NULL,

    bus_stop_id BIGINT NOT NULL,

    arrival_time TIMESTAMP,

    departure_time TIMESTAMP,

    status VARCHAR(50) NOT NULL,

    CONSTRAINT fk_arrival_bus
        FOREIGN KEY (bus_id)
        REFERENCES buses(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_arrival_stop
        FOREIGN KEY (bus_stop_id)
        REFERENCES bus_stops(id)
        ON DELETE CASCADE
);

CREATE INDEX idx_arrival_bus
ON arrival_logs(bus_id);

CREATE INDEX idx_arrival_stop
ON arrival_logs(bus_stop_id);