package com.anbesaflow.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

    @PostMapping("/bus-stops")
    public ResponseEntity<Map<String, String>> createBusStop(@RequestBody Map<String, String> request) {
        String name = request.getOrDefault("name", "Unknown Stop");
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Bus stop '" + name + "' created successfully"
        ));
    }

    @PostMapping("/routes")
    public ResponseEntity<Map<String, String>> createRoute(@RequestBody Map<String, String> request) {
        String routeCode = request.getOrDefault("routeCode", "Unknown Route");
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Route '" + routeCode + "' created successfully"
        ));
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
