package com.anbesaflow.auth.controller;

import com.anbesaflow.auth.entity.Bus;
import com.anbesaflow.auth.service.BusService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/buses")
public class BusController {

    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @PostMapping
    public ResponseEntity<Bus> createBus(@RequestBody Bus bus) {
        return new ResponseEntity<>(busService.createBus(bus), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<Bus>> getAllBuses(
            @RequestParam(required = false) String status,
            Pageable pageable) {
        return ResponseEntity.ok(busService.getAllBuses(status, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bus> getBusById(@PathVariable Long id) {
        return ResponseEntity.ok(busService.getBusById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bus> updateBus(@PathVariable Long id, @RequestBody Bus bus) {
        return ResponseEntity.ok(busService.updateBus(id, bus));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBus(@PathVariable Long id) {
        busService.deleteBus(id);
        return ResponseEntity.noContent().build();
    }
}