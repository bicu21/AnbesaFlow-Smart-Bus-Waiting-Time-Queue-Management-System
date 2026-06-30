package com.anbesaflow.auth.dto;

public class QueueStatusResponse {

    private String busStop;
    private int position;
    private int peopleAhead;
    private long totalInQueue;

    public QueueStatusResponse() {
    }

    public QueueStatusResponse(String busStop, int position, int peopleAhead, long totalInQueue) {
        this.busStop = busStop;
        this.position = position;
        this.peopleAhead = peopleAhead;
        this.totalInQueue = totalInQueue;
    }

    public String getBusStop() {
        return busStop;
    }

    public int getPosition() {
        return position;
    }

    public int getPeopleAhead() {
        return peopleAhead;
    }

    public long getTotalInQueue() {
        return totalInQueue;
    }
}