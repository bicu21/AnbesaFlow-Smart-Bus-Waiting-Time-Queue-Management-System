package com.anbesaflow.auth.dto;

public class JoinQueueRequest {

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