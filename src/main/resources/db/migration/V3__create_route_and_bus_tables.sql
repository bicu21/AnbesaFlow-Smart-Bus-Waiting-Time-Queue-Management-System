CREATE TABLE IF NOT EXISTS routes (
    id BIGSERIAL PRIMARY KEY,
    route_code VARCHAR(50) NOT NULL UNIQUE,
    description VARCHAR(200) NOT NULL,
    active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS bus_stops (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    location_description VARCHAR(255),
    latitude NUMERIC(10, 7),
    longitude NUMERIC(10, 7),
    route_id BIGINT,
    active BOOLEAN NOT NULL DEFAULT TRUE,
    CONSTRAINT fk_bus_stop_route
        FOREIGN KEY(route_id)
        REFERENCES routes(id)
        ON DELETE SET NULL
);

CREATE TABLE IF NOT EXISTS buses (
    id BIGSERIAL PRIMARY KEY,
    plate_number VARCHAR(30) NOT NULL UNIQUE,
    status VARCHAR(20) NOT NULL DEFAULT 'ACTIVE',
    capacity INTEGER NOT NULL DEFAULT 50,
    route_id BIGINT NOT NULL,
    CONSTRAINT fk_bus_route
        FOREIGN KEY(route_id)
        REFERENCES routes(id)
        ON DELETE CASCADE
);
