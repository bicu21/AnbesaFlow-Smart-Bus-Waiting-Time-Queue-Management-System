-- Seed system users (password is 'password' encoded with BCrypt)
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

-- Seed Bus Stops linked to matching routes
INSERT INTO bus_stops (name, location, route_id) 
SELECT 'Megenagna Station', 'Main terminal at Megenagna', id FROM routes WHERE route_code = 'R47'
WHERE NOT EXISTS (SELECT 1 FROM bus_stops WHERE name = 'Megenagna Station');

INSERT INTO bus_stops (name, location, route_id) 
SELECT 'Bole Station', 'Terminal near Bole Airport', id FROM routes WHERE route_code = 'R47'
WHERE NOT EXISTS (SELECT 1 FROM bus_stops WHERE name = 'Bole Station');

INSERT INTO bus_stops (name, location, route_id) 
SELECT 'Piassa Station', 'Main terminal at Piassa', id FROM routes WHERE route_code = 'R12'
WHERE NOT EXISTS (SELECT 1 FROM bus_stops WHERE name = 'Piassa Station');

-- Seed Fleet Buses
INSERT INTO buses (plate_number, status, capacity, route_id) 
SELECT 'AA-1001', 'ACTIVE', 60, id FROM routes WHERE route_code = 'R47'
ON CONFLICT (plate_number) DO NOTHING;

INSERT INTO buses (plate_number, status, capacity, route_id) 
SELECT 'AA-1002', 'ACTIVE', 50, id FROM routes WHERE route_code = 'R12'
ON CONFLICT (plate_number) DO NOTHING;