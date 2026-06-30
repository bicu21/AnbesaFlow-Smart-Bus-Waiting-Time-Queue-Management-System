-- Seed some dummy users (password is 'password' encoded with BCrypt)
INSERT INTO users (name, email, password, role) VALUES 
('Admin User', 'admin@anbesaflow.com', '$2a$10$XJ28aM9/W0M1p5O43YfV/.yH8/pI24oF8L4uB5lM2r.tZ.M/o/M8q', 'ADMIN'),
('Operator User', 'operator@anbesaflow.com', '$2a$10$XJ28aM9/W0M1p5O43YfV/.yH8/pI24oF8L4uB5lM2r.tZ.M/o/M8q', 'OPERATOR'),
('Passenger One', 'passenger1@anbesaflow.com', '$2a$10$XJ28aM9/W0M1p5O43YfV/.yH8/pI24oF8L4uB5lM2r.tZ.M/o/M8q', 'PASSENGER')
ON CONFLICT (email) DO NOTHING;

-- Seed Routes
INSERT INTO routes (route_code, description, active) VALUES 
('R47', 'Megenagna to Bole', TRUE),
('R12', 'Piassa to Arat Kilo', TRUE)
ON CONFLICT (route_code) DO NOTHING;

-- We need to get the IDs of the routes we just inserted to insert bus stops and buses.
-- To keep it simple and idempotent, we use subqueries.

-- Seed Bus Stops
INSERT INTO bus_stops (name, location_description, route_id, active) 
SELECT 'Megenagna Station', 'Main terminal at Megenagna', id, TRUE FROM routes WHERE route_code = 'R47'
WHERE NOT EXISTS (SELECT 1 FROM bus_stops WHERE name = 'Megenagna Station');

INSERT INTO bus_stops (name, location_description, route_id, active) 
SELECT 'Bole Station', 'Terminal near Bole Airport', id, TRUE FROM routes WHERE route_code = 'R47'
WHERE NOT EXISTS (SELECT 1 FROM bus_stops WHERE name = 'Bole Station');

INSERT INTO bus_stops (name, location_description, route_id, active) 
SELECT 'Piassa Station', 'Main terminal at Piassa', id, TRUE FROM routes WHERE route_code = 'R12'
WHERE NOT EXISTS (SELECT 1 FROM bus_stops WHERE name = 'Piassa Station');

-- Seed Buses
INSERT INTO buses (plate_number, status, capacity, route_id) 
SELECT 'AA-1001', 'ACTIVE', 60, id FROM routes WHERE route_code = 'R47'
ON CONFLICT (plate_number) DO NOTHING;

INSERT INTO buses (plate_number, status, capacity, route_id) 
SELECT 'AA-1002', 'ACTIVE', 50, id FROM routes WHERE route_code = 'R12'
ON CONFLICT (plate_number) DO NOTHING;
