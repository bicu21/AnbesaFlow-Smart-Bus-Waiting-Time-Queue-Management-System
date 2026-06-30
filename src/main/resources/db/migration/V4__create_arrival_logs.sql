INSERT INTO buses (plate_number, status, capacity, route_id)
SELECT 'AA-1001', 'ACTIVE', 60, id FROM routes WHERE route_code = 'R47'
ON CONFLICT (plate_number) DO NOTHING;

INSERT INTO buses (plate_number, status, capacity, route_id)
SELECT 'AA-1002', 'ACTIVE', 50, id FROM routes WHERE route_code = 'R12'
ON CONFLICT (plate_number) DO NOTHING;