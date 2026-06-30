-- USERS
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL
);

-- ROUTES
CREATE TABLE routes (
    id SERIAL PRIMARY KEY,
    route_code VARCHAR(50) UNIQUE NOT NULL,
    description VARCHAR(255),
    end_point VARCHAR(255),
    active BOOLEAN DEFAULT TRUE
);

-- BUS STOPS
CREATE TABLE bus_stops (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(255),
    route_id INT NOT NULL,
    CONSTRAINT fk_bus_stops_route
        FOREIGN KEY (route_id) REFERENCES routes(id)
        ON DELETE CASCADE
);

-- BUSES
CREATE TABLE buses (
    id SERIAL PRIMARY KEY,
    plate_number VARCHAR(50) UNIQUE NOT NULL,
    status VARCHAR(20) NOT NULL,
    capacity INT NOT NULL,
    route_id INT NOT NULL,
    CONSTRAINT fk_buses_route
        FOREIGN KEY (route_id) REFERENCES routes(id)
        ON DELETE SET NULL
);