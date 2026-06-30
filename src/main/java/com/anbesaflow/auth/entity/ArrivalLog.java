package com.anbesaflow.auth.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Records whenever a bus arrives at or departs from a stop.
 * Used to calculate historical travel times and predict future arrivals.
 */
@Entity
@Table(name = "arrival_logs")
public class ArrivalLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_id", nullable = false)
    private Bus bus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_stop_id", nullable = false)
    private BusStop busStop;

    @Column(nullable = false)
    private LocalDateTime arrivalTime;

    @Column
    private LocalDateTime departureTime;

    // ── Constructors ──────────────────────────────────────────────────────────

    public ArrivalLog() {}

    public ArrivalLog(Bus bus, BusStop busStop, LocalDateTime arrivalTime) {
        this.bus = bus;
        this.busStop = busStop;
        this.arrivalTime = arrivalTime;
    }

    // ── Getters & Setters ─────────────────────────────────────────────────────

    public Long getId()                                 { return id; }
    public void setId(Long id)                          { this.id = id; }

    public Bus getBus()                                 { return bus; }
    public void setBus(Bus bus)                         { this.bus = bus; }

    public BusStop getBusStop()                         { return busStop; }
    public void setBusStop(BusStop busStop)             { this.busStop = busStop; }

    public LocalDateTime getArrivalTime()               { return arrivalTime; }
    public void setArrivalTime(LocalDateTime arr)       { this.arrivalTime = arr; }

    public LocalDateTime getDepartureTime()             { return departureTime; }
    public void setDepartureTime(LocalDateTime dep)     { this.departureTime = dep; }
}
