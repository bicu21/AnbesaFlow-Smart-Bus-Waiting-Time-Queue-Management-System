package com.anbesaflow.auth.controller;

import com.anbesaflow.auth.entity.ArrivalLog;
import com.anbesaflow.auth.service.ArrivalLogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/arrival-logs")
public class ArrivalLogController {

    private final ArrivalLogService arrivalLogService;

    public ArrivalLogController(ArrivalLogService arrivalLogService) {
        this.arrivalLogService = arrivalLogService;
    }

    @PostMapping
    public ResponseEntity<ArrivalLog> logArrival(@RequestBody ArrivalLog arrivalLog) {
        return new ResponseEntity<>(arrivalLogService.logArrival(arrivalLog), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<ArrivalLog>> getArrivalLogs(
            @RequestParam(required = false) Long busId,
            @RequestParam(required = false) Long busStopId,
            Pageable pageable) {
        return ResponseEntity.ok(arrivalLogService.getArrivalLogs(busId, busStopId, pageable));
    }
}