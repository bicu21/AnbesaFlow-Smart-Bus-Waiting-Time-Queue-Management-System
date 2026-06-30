-- =========================
-- USERS SEED
-- =========================
INSERT INTO users (name, email, password, role) VALUES 
('Admin User', 'admin@anbesaflow.com', '$2a$10$XJ28aM9/W0M1p5O43YfV/.yH8/pI24oF8L4uB5lM2r.tZ.M/o/M8q', 'ADMIN'),
('Operator User', 'operator@anbesaflow.com', '$2a$10$XJ28aM9/W0M1p5O43YfV/.yH8/pI24oF8L4uB5lM2r.tZ.M/o/M8q', 'OPERATOR'),
('Passenger One', 'passenger1@anbesaflow.com', '$2a$10$XJ28aM9/W0M1p5O43YfV/.yH8/pI24oF8L4uB5lM2r.tZ.M/o/M8q', 'PASSENGER')
ON CONFLICT (email) DO NOTHING;

-- =========================
-- ROUTES SEED
-- =========================
INSERT INTO routes (route_code, description, active) VALUES 
('R47', 'Megenagna to Bole', TRUE),
('R12', 'Piassa to Arat Kilo', TRUE)
ON CONFLICT (route_code) DO NOTHING;

-- =========================
-- BUS STOPS SEED (FIXED)
-- =========================

INSERT INTO bus_stops (name, location, route_id)
SELECT
    'Megenagna Station',
    'Main terminal at Megenagna',
    r.id
FROM routes r
WHERE r.route_code = 'R47'
AND NOT EXISTS (
    SELECT 1 FROM bus_stops bs WHERE bs.name = 'Megenagna Station'
);

INSERT INTO bus_stops (name, location, route_id)
SELECT
    'Bole Station',
    'Terminal near Bole Airport',
    r.id
FROM routes r
WHERE r.route_code = 'R47'
AND NOT EXISTS (
    SELECT 1 FROM bus_stops bs WHERE bs.name = 'Bole Station'
);

INSERT INTO bus_stops (name, location, route_id)
SELECT
    'Piassa Station',
    'Main terminal at Piassa',
    r.id
FROM routes r
WHERE r.route_code = 'R12'
AND NOT EXISTS (
    SELECT 1 FROM bus_stops bs WHERE bs.name = 'Piassa Station'
);

-- =========================
-- BUSES SEED (FIXED)
-- =========================

INSERT INTO buses (plate_number, status, capacity) VALUES 
('AA-1001', 'ACTIVE', 60),
('AA-1002', 'ACTIVE', 50)
ON CONFLICT (plate_number) DO NOTHING;