-- V5: Seed initial AnbesaFlow data

-- Seed users (passwords are BCrypt hash of 'password123')
INSERT INTO users (name, email, password, role) VALUES
('Admin User',     'admin@anbesaflow.com',      '$2a$10$XJ28aM9/W0M1p5O43YfV/.yH8/pI24oF8L4uB5lM2r.tZ.M/o/M8q', 'ADMIN'),
('Operator User',  'operator@anbesaflow.com',   '$2a$10$XJ28aM9/W0M1p5O43YfV/.yH8/pI24oF8L4uB5lM2r.tZ.M/o/M8q', 'OPERATOR'),
('Passenger One',  'passenger1@anbesaflow.com', '$2a$10$XJ28aM9/W0M1p5O43YfV/.yH8/pI24oF8L4uB5lM2r.tZ.M/o/M8q', 'PASSENGER')
ON CONFLICT (email) DO NOTHING;

-- Seed routes (schema: name, start_point, end_point)
INSERT INTO routes (name, start_point, end_point) VALUES
('R47 Megenagna-Bole',  'Megenagna', 'Bole Station'),
('R12 Piassa-Arat Kilo','Piassa',    'Arat Kilo Station')
ON CONFLICT DO NOTHING;

-- Seed bus stops (linked to routes by name)
INSERT INTO bus_stops (name, location, route_id)
SELECT 'Megenagna Station', 'Main terminal at Megenagna', r.id
FROM routes r WHERE r.name = 'R47 Megenagna-Bole'
AND NOT EXISTS (SELECT 1 FROM bus_stops bs WHERE bs.name = 'Megenagna Station');

INSERT INTO bus_stops (name, location, route_id)
SELECT 'Bole Station', 'Terminal near Bole Airport', r.id
FROM routes r WHERE r.name = 'R47 Megenagna-Bole'
AND NOT EXISTS (SELECT 1 FROM bus_stops bs WHERE bs.name = 'Bole Station');

INSERT INTO bus_stops (name, location, route_id)
SELECT 'Piassa Station', 'Main terminal at Piassa', r.id
FROM routes r WHERE r.name = 'R12 Piassa-Arat Kilo'
AND NOT EXISTS (SELECT 1 FROM bus_stops bs WHERE bs.name = 'Piassa Station');

INSERT INTO bus_stops (name, location, route_id)
SELECT 'Arat Kilo Station', 'Terminal at Arat Kilo', r.id
FROM routes r WHERE r.name = 'R12 Piassa-Arat Kilo'
AND NOT EXISTS (SELECT 1 FROM bus_stops bs WHERE bs.name = 'Arat Kilo Station');

-- Seed buses (linked to routes by name)
INSERT INTO buses (plate_number, status, capacity, route_id)
SELECT 'AA-1001', 'ACTIVE', 60, r.id
FROM routes r WHERE r.name = 'R47 Megenagna-Bole'
ON CONFLICT (plate_number) DO NOTHING;

INSERT INTO buses (plate_number, status, capacity, route_id)
SELECT 'AA-1002', 'ACTIVE', 50, r.id
FROM routes r WHERE r.name = 'R12 Piassa-Arat Kilo'
ON CONFLICT (plate_number) DO NOTHING;