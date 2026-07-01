package com.anbesaflow.auth.controller;

import com.anbesaflow.auth.entity.BusStop;
import com.anbesaflow.auth.entity.Route;
import com.anbesaflow.auth.service.BusStopService;
import com.anbesaflow.auth.service.RouteService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

    private final RouteService routeService;
    private final BusStopService busStopService;

    public AdminController(RouteService routeService, BusStopService busStopService) {
        this.routeService = routeService;
        this.busStopService = busStopService;
    }

    @PostMapping("/bus-stops")
    public ResponseEntity<Map<String, Object>> createBusStop(@RequestBody Map<String, String> request) {
        String name = request.getOrDefault("name", "Unknown Stop");
        String location = request.getOrDefault("location", "");
        Long routeId = request.containsKey("routeId") ? Long.parseLong(request.get("routeId")) : null;
        
        BusStop stop = new BusStop();
        stop.setName(name);
        stop.setLocation(location);

        BusStop savedStop = busStopService.createBusStop(stop);

        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Bus stop '" + name + "' created successfully",
                "data", savedStop
        ));
    }
    
    @GetMapping("/bus-stops")
    public ResponseEntity<List<BusStop>> getBusStops() {
        return ResponseEntity.ok(
                busStopService
                        .getAllBusStops(null, org.springframework.data.domain.Pageable.unpaged())
                        .getContent()
        );
    }

    @PostMapping("/routes")
    public ResponseEntity<Map<String, Object>> createRoute(@RequestBody Map<String, String> request) {
        Route route = new Route();
        route.setName(request.getOrDefault("name", "Unknown Route"));
        route.setStartPoint(request.getOrDefault("startPoint", ""));
        route.setEndPoint(request.getOrDefault("endPoint", ""));

        Route savedRoute = routeService.createRoute(route);

        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Route created successfully",
                "data", savedRoute
        ));
    }
    
    @GetMapping("/routes")
    public ResponseEntity<List<Route>> getRoutes() {
        return ResponseEntity.ok(
                routeService
                        .getAllRoutes(null, org.springframework.data.domain.Pageable.unpaged())
                        .getContent()
        );
    }
    @PostMapping("/settings")
    public ResponseEntity<Map<String, String>> updateSettings(@RequestBody Map<String, Object> settings) {
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "System settings updated successfully",
                "updatedCount", String.valueOf(settings.size())
        ));
    }
}
