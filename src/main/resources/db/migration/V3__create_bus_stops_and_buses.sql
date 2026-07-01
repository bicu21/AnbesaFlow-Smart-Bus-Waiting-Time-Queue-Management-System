-- V3: Create bus_stops and buses tables
-- Schema matches BusStop entity: id (BIGSERIAL), name, location, route_id (FK), created_at
CREATE TABLE bus_stops (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(120) NOT NULL,
    location VARCHAR(255) NOT NULL,
    route_id BIGINT,
    created_at TIMESTAMP,
    CONSTRAINT fk_bus_stops_route
        FOREIGN KEY (route_id) REFERENCES routes(id)
        ON DELETE SET NULL
);

-- Schema matches Bus entity: id (BIGSERIAL), plate_number, capacity, status, route_id (FK), created_at
CREATE TABLE buses (
    id BIGSERIAL PRIMARY KEY,
    plate_number VARCHAR(50) UNIQUE NOT NULL,
    status VARCHAR(50) NOT NULL,
    capacity INT NOT NULL,
    route_id BIGINT,
    created_at TIMESTAMP,
    CONSTRAINT fk_buses_route
        FOREIGN KEY (route_id) REFERENCES routes(id)
        ON DELETE SET NULL
);

CREATE INDEX idx_buses_plate ON buses(plate_number);
CREATE INDEX idx_buses_status ON buses(status);
CREATE INDEX idx_bus_stops_route ON bus_stops(route_id);