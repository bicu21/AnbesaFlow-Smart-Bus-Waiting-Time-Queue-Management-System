package com.anbesaflow.auth.controller;

import com.anbesaflow.auth.entity.BusStop;
import com.anbesaflow.auth.service.BusStopService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bus-stops")
public class BusStopController {

    private final BusStopService busStopService;

    public BusStopController(BusStopService busStopService) {
        this.busStopService = busStopService;
    }

    @PostMapping
    public ResponseEntity<BusStop> createBusStop(@RequestBody BusStop busStop) {
        return new ResponseEntity<>(busStopService.createBusStop(busStop), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<BusStop>> getAllBusStops(
            @RequestParam(required = false) String search,
            Pageable pageable) {
        return ResponseEntity.ok(busStopService.getAllBusStops(search, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BusStop> getBusStopById(@PathVariable Long id) {
        return ResponseEntity.ok(busStopService.getBusStopById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BusStop> updateBusStop(@PathVariable Long id, @RequestBody BusStop busStop) {
        return ResponseEntity.ok(busStopService.updateBusStop(id, busStop));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBusStop(@PathVariable Long id) {
        busStopService.deleteBusStop(id);
        return ResponseEntity.noContent().build();
    }
}