CREATE INDEX idx_routes_code ON routes(route_code);
CREATE INDEX idx_buses_plate ON buses(plate_number);
CREATE INDEX idx_bus_stops_route ON bus_stops(route_id);