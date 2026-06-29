package com.anbesaflow.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/operator")
@PreAuthorize("hasRole('OPERATOR')")
public class OperatorController {

    @PostMapping("/bus-arrivals")
    public ResponseEntity<Map<String, String>> recordArrival(@RequestBody Map<String, String> request) {
        String busId = request.getOrDefault("busId", "N/A");
        String stopId = request.getOrDefault("stopId", "N/A");
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Arrival for Bus " + busId + " at Stop " + stopId + " has been recorded."
        ));
    }

    @PostMapping("/bus-departures")
    public ResponseEntity<Map<String, String>> recordDeparture(@RequestBody Map<String, String> request) {
        String busId = request.getOrDefault("busId", "N/A");
        String stopId = request.getOrDefault("stopId", "N/A");
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Departure for Bus " + busId + " from Stop " + stopId + " has been recorded."
        ));
    }

    @PutMapping("/bus-status")
    public ResponseEntity<Map<String, String>> updateBusStatus(@RequestBody Map<String, String> request) {
        String busId = request.getOrDefault("busId", "N/A");
        String status = request.getOrDefault("status", "ACTIVE");
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Bus " + busId + " status updated to: " + status
        ));
    }
}
