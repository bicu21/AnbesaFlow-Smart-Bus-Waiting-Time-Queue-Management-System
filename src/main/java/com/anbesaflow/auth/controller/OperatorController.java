package com.anbesaflow.auth.controller;

import com.anbesaflow.auth.entity.ArrivalLog;
import com.anbesaflow.auth.entity.Bus;
import com.anbesaflow.auth.service.ArrivalLogService;
import com.anbesaflow.auth.service.BusService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

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

        // TEMP FIX: we don't have recordArrival(), so we return a placeholder response
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Arrival endpoint received for bus " + busPlate + " (service method not implemented yet)",
                "data", busPlate
        ));
    }

    @PostMapping("/bus-departures")
    public ResponseEntity<Map<String, Object>> recordDeparture(@RequestBody Map<String, String> request) {

        String busPlate = request.getOrDefault("busPlate", "");

        // TEMP FIX: same issue, avoid calling missing service method
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Departure endpoint received for bus " + busPlate + " (service method not implemented yet)",
                "data", busPlate
        ));
    }

   @PutMapping("/bus-status")
public ResponseEntity<Map<String, Object>> updateBusStatus(@RequestBody Map<String, String> request) {

    String busPlate = request.getOrDefault("busPlate", "");
    String status = request.getOrDefault("status", "ACTIVE");

    Bus bus = busService.getAllBuses(null, Pageable.unpaged())
            .getContent()
            .stream()
            .filter(b -> b.getPlateNumber().equals(busPlate))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Bus not found: " + busPlate));

    Bus updatedBus = new Bus(
            bus.getId(),
            bus.getPlateNumber(),
            bus.getCapacity(),
            status
    );

    Bus saved = busService.updateBus(bus.getId(), updatedBus);

    return ResponseEntity.ok(Map.of(
            "status", "success",
            "message", "Bus " + busPlate + " status updated to: " + status,
            "data", saved
    ));
}
}