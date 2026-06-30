package com.anbesaflow.auth.entity;

import jakarta.persistence.*;

/**
 * Represents an individual bus vehicle registered in the AnbesaFlow system.
 * One Route can have many Buses.
 * One Bus can have many ArrivalLogs.
 */
@Entity
@Table(name = "buses")
public class Bus {

    public enum BusStatus {
        ACTIVE, DELAYED, OUT_OF_SERVICE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Plate number or fleet identifier, e.g. "AA-1234" */
    @Column(nullable = false, unique = true, length = 30)
    private String plateNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private BusStatus status = BusStatus.ACTIVE;

    /** Seating / standing capacity — used in waiting-time estimation */
    @Column(nullable = false)
    private Integer capacity = 50;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id", nullable = false)
    private Route route;

    // ── Constructors ──────────────────────────────────────────────────────────

    public Bus() {}

    public Bus(String plateNumber, Integer capacity, Route route) {
        this.plateNumber = plateNumber;
        this.capacity    = capacity;
        this.route       = route;
    }

    // ── Getters & Setters ─────────────────────────────────────────────────────

    public Long getId()                           { return id; }
    public void setId(Long id)                    { this.id = id; }

    public String getPlateNumber()                { return plateNumber; }
    public void setPlateNumber(String p)          { this.plateNumber = p; }

    public BusStatus getStatus()                  { return status; }
    public void setStatus(BusStatus s)            { this.status = s; }

    public Integer getCapacity()                  { return capacity; }
    public void setCapacity(Integer c)            { this.capacity = c; }

    public Route getRoute()                       { return route; }
    public void setRoute(Route route)             { this.route = route; }
}
