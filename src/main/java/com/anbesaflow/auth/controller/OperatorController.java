package com.anbesaflow.auth.controller;

import com.anbesaflow.auth.entity.ArrivalLog;
import com.anbesaflow.auth.entity.Bus;
import com.anbesaflow.auth.service.ArrivalLogService;
import com.anbesaflow.auth.service.BusService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/operator")
@PreAuthorize("hasRole('OPERATOR')")
public class OperatorController {

    private final ArrivalLogService arrivalLogService;
    private final BusService busService;

    public OperatorController(ArrivalLogService arrivalLogService, BusService busService) {
        this.arrivalLogService = arrivalLogService;
        this.busService = busService;
    }

    @PostMapping("/bus-arrivals")
    public ResponseEntity<Map<String, Object>> recordArrival(@RequestBody Map<String, String> request) {
        String busPlate = request.getOrDefault("busPlate", "");
        Long stopId = Long.parseLong(request.getOrDefault("stopId", "0"));
        
        ArrivalLog log = arrivalLogService.recordArrival(busPlate, stopId);
        
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Arrival for Bus " + busPlate + " at Stop " + stopId + " has been recorded.",
                "data", log
        ));
    }

    @PostMapping("/bus-departures")
    public ResponseEntity<Map<String, Object>> recordDeparture(@RequestBody Map<String, String> request) {
        String busPlate = request.getOrDefault("busPlate", "");
        Long stopId = Long.parseLong(request.getOrDefault("stopId", "0"));
        
        ArrivalLog log = arrivalLogService.recordDeparture(busPlate, stopId);
        
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Departure for Bus " + busPlate + " from Stop " + stopId + " has been recorded.",
                "data", log
        ));
    }

    @PutMapping("/bus-status")
    public ResponseEntity<Map<String, Object>> updateBusStatus(@RequestBody Map<String, String> request) {
        String busPlate = request.getOrDefault("busPlate", "");
        Bus.BusStatus status = Bus.BusStatus.valueOf(request.getOrDefault("status", "ACTIVE"));
        
        Bus bus = busService.updateBusStatus(busPlate, status);
        
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Bus " + busPlate + " status updated to: " + status,
                "data", bus
        ));
    }
}
