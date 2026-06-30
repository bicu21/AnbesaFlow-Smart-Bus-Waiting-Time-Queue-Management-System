-- Megenagna Station (R47)
INSERT INTO bus_stops (name, location, route_id)
SELECT 'Megenagna Station', 'Main terminal at Megenagna', r.id
FROM routes r
WHERE r.route_code = 'R47'
AND NOT EXISTS (
    SELECT 1 FROM bus_stops bs WHERE bs.name = 'Megenagna Station'
);

-- Bole Station (R47)
INSERT INTO bus_stops (name, location, route_id)
SELECT 'Bole Station', 'Terminal near Bole Airport', r.id
FROM routes r
WHERE r.route_code = 'R47'
AND NOT EXISTS (
    SELECT 1 FROM bus_stops bs WHERE bs.name = 'Bole Station'
);

-- Piassa Station (R12)
INSERT INTO bus_stops (name, location, route_id)
SELECT 'Piassa Station', 'Main terminal at Piassa', r.id
FROM routes r
WHERE r.route_code = 'R12'
AND NOT EXISTS (
    SELECT 1 FROM bus_stops bs WHERE bs.name = 'Piassa Station'
);