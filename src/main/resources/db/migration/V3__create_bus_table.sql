CREATE TABLE buses (

    id BIGSERIAL PRIMARY KEY,

    plate_number VARCHAR(50) NOT NULL UNIQUE,

    capacity INTEGER NOT NULL
        CHECK (capacity > 0),

    status VARCHAR(50) NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE INDEX idx_bus_status
ON buses(status);

CREATE INDEX idx_bus_plate
ON buses(plate_number);