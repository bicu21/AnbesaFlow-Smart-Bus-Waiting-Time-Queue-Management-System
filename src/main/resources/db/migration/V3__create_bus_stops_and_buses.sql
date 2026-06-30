-- USERS
INSERT INTO users (name, email, password, role) VALUES
('Admin User', 'admin@anbesaflow.com', '$2a$10$XJ28aM9/W0M1p5O43YfV/.yH8/pI24oF8L4uB5lM2r.tZ.M/o/M8q', 'ADMIN'),
('Operator User', 'operator@anbesaflow.com', '$2a$10$XJ28aM9/W0M1p5O43YfV/.yH8/pI24oF8L4uB5lM2r.tZ.M/o/M8q', 'OPERATOR'),
('Passenger One', 'passenger1@anbesaflow.com', '$2a$10$XJ28aM9/W0M1p5O43YfV/.yH8/pI24oF8L4uB5lM2r.tZ.M/o/M8q', 'PASSENGER')
ON CONFLICT (email) DO NOTHING;

-- ROUTES
INSERT INTO routes (route_code, description, end_point, active) VALUES
('R47', 'Megenagna to Bole', 'Bole Station', TRUE),
('R12', 'Piassa to Arat Kilo', 'Arat Kilo Station', TRUE)
ON CONFLICT (route_code) DO NOTHING;