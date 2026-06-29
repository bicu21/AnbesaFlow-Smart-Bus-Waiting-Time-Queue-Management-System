package com.anbesaflow.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/passenger")
@PreAuthorize("hasRole('PASSENGER')")
public class PassengerController {

    @GetMapping("/waiting-times")
    public ResponseEntity<Map<String, Object>> getWaitingTimes(@RequestParam String stopId) {
        return ResponseEntity.ok(Map.of(
                "stopId", stopId,
                "estimatedWaitTimeMinutes", 15,
                "nextBusArrival", "10:15 AM"
        ));
    }

    @PostMapping("/queues/join")
    public ResponseEntity<Map<String, String>> joinQueue(@RequestBody Map<String, String> request) {
        String stopId = request.getOrDefault("stopId", "N/A");
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Successfully joined queue at Stop " + stopId,
                "queueId", "Q-9912"
        ));
    }

    @GetMapping("/queues/position")
    public ResponseEntity<Map<String, Object>> checkQueuePosition(@RequestParam String queueId) {
        return ResponseEntity.ok(Map.of(
                "queueId", queueId,
                "positionInQueue", 4,
                "estimatedTimeToBoardMinutes", 8
        ));
    }

    @GetMapping("/buses/availability")
    public ResponseEntity<Map<String, Object>> checkBusAvailability(@RequestParam String routeId) {
        return ResponseEntity.ok(Map.of(
                "routeId", routeId,
                "activeBusesOnRoute", 3,
                "status", "NORMAL_SERVICE"
        ));
    }
}
