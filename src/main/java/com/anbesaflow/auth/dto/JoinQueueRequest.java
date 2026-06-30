package com.anbesaflow.auth.dto;
import jakarta.validation.constraints.NotBlank;

public class JoinQueueRequest {
    
    @NotBlank(message = "Bus stop is required")
    private String busStop;

    public JoinQueueRequest() {
    }

    public String getBusStop() {
        return busStop;
    }

    public void setBusStop(String busStop) {
        this.busStop = busStop;
    }
}