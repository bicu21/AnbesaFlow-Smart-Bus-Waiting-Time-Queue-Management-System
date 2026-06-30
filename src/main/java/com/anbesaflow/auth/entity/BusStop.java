package com.anbesaflow.auth.entity;

import jakarta.persistence.*;

/**
 * Represents a physical bus stop location in the AnbesaFlow network.
 * One BusStop can have many QueueEntries and many ArrivalLogs.
 */
@Entity
@Table(name = "bus_stops")
public class BusStop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(length = 255)
    private String locationDescription;

    @Column(precision = 10, scale = 7)
    private Double latitude;

    @Column(precision = 10, scale = 7)
    private Double longitude;

    /** The transit route this stop belongs to */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id")
    private Route route;

    @Column(nullable = false)
    private boolean active = true;

    // ── Constructors ──────────────────────────────────────────────────────────

    public BusStop() {}

    public BusStop(String name, String locationDescription, Double latitude,
                   Double longitude, Route route) {
        this.name                = name;
        this.locationDescription = locationDescription;
        this.latitude            = latitude;
        this.longitude           = longitude;
        this.route               = route;
    }

    // ── Getters & Setters ─────────────────────────────────────────────────────

    public Long getId()                               { return id; }
    public void setId(Long id)                        { this.id = id; }

    public String getName()                           { return name; }
    public void setName(String name)                  { this.name = name; }

    public String getLocationDescription()            { return locationDescription; }
    public void setLocationDescription(String loc)    { this.locationDescription = loc; }

    public Double getLatitude()                       { return latitude; }
    public void setLatitude(Double lat)               { this.latitude = lat; }

    public Double getLongitude()                      { return longitude; }
    public void setLongitude(Double lon)              { this.longitude = lon; }

    public Route getRoute()                           { return route; }
    public void setRoute(Route route)                 { this.route = route; }

    public boolean isActive()                         { return active; }
    public void setActive(boolean active)             { this.active = active; }
}
