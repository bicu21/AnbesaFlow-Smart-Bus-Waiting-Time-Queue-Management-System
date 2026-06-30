package com.anbesaflow.auth.controller;

import com.anbesaflow.auth.dto.JoinQueueRequest;
import com.anbesaflow.auth.dto.QueueStatusResponse;
import com.anbesaflow.auth.dto.WaitingTimeResponse;
import com.anbesaflow.auth.service.QueueService;
import com.anbesaflow.auth.service.WaitingTimeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/queue")
public class QueueController {

    private final QueueService queueService;

    private final WaitingTimeService waitingService;

    public QueueController(QueueService queueService,
                           WaitingTimeService waitingService) {

        this.queueService = queueService;
        this.waitingService = waitingService;
    }

    @PostMapping("/join")
    public ResponseEntity<QueueStatusResponse> join(
            @RequestBody JoinQueueRequest request){

        return ResponseEntity.ok(
                queueService.joinQueue(request.getBusStop())
        );
    }

    @DeleteMapping("/leave")
    public ResponseEntity<String> leave(){

        queueService.leaveQueue();

        return ResponseEntity.ok("Queue left successfully.");
    }

    @GetMapping("/status")
    public ResponseEntity<QueueStatusResponse> status(){

        return ResponseEntity.ok(
                queueService.getStatus()
        );
    }

    @GetMapping("/position")
    public ResponseEntity<QueueStatusResponse> position(){

        return ResponseEntity.ok(
                queueService.getStatus()
        );
    }

    @GetMapping("/waiting-time")
    public ResponseEntity<WaitingTimeResponse> waitingTime(){

        return ResponseEntity.ok(
                waitingService.getWaitingTime()
        );
    }

}