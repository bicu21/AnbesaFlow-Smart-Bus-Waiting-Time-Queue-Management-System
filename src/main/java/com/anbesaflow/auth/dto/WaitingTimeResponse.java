package com.anbesaflow.auth.dto;

public class WaitingTimeResponse {

    private int estimatedMinutes;

    public WaitingTimeResponse() {
    }

    public WaitingTimeResponse(int estimatedMinutes) {
        this.estimatedMinutes = estimatedMinutes;
    }

    public int getEstimatedMinutes() {
        return estimatedMinutes;
    }
}