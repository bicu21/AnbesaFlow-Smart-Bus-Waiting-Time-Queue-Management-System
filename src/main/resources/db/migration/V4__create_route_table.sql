CREATE TABLE routes (

    id BIGSERIAL PRIMARY KEY,

    name VARCHAR(150) NOT NULL,

    start_point VARCHAR(100) NOT NULL,

    end_point VARCHAR(100) NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE INDEX idx_route_name
ON routes(name);