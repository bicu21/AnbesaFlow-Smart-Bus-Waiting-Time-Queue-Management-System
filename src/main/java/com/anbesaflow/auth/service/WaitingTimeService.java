package com.anbesaflow.auth.service;

import org.springframework.stereotype.Service;

import com.anbesaflow.auth.dto.WaitingTimeResponse;

@Service
public class WaitingTimeService {

    private final QueueService queueService;

    public WaitingTimeService(QueueService queueService) {
        this.queueService = queueService;
    }

    public WaitingTimeResponse getWaitingTime(){

        return new WaitingTimeResponse(
                queueService.getEstimatedWaitingTime()
        );
    }

}