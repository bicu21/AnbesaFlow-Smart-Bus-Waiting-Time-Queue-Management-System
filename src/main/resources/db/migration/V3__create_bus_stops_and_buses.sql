-- Create bus_stops matching your Java entity fields (name, location)
CREATE TABLE IF NOT EXISTS bus_stops (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(120) NOT NULL,
    location VARCHAR(255) NOT NULL,
    route_id BIGINT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_bus_stop_route
        FOREIGN KEY(route_id)
        REFERENCES routes(id)
        ON DELETE SET NULL
);

-- Create buses table
CREATE TABLE IF NOT EXISTS buses (
    id BIGSERIAL PRIMARY KEY,
    plate_number VARCHAR(50) NOT NULL UNIQUE,
    capacity INTEGER NOT NULL CHECK (capacity > 0),
    status VARCHAR(50) NOT NULL DEFAULT 'ACTIVE',
    route_id BIGINT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_bus_route
        FOREIGN KEY(route_id)
        REFERENCES routes(id)
        ON DELETE CASCADE
);

CREATE INDEX IF NOT EXISTS idx_bus_status ON buses(status);
CREATE INDEX IF NOT EXISTS idx_bus_plate ON buses(plate_number);