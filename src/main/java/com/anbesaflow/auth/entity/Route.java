package com.anbesaflow.auth.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Represents a transit route (corridor) in the AnbesaFlow network.
 * One Route serves many Buses.
 */
@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Human-readable route code, e.g. "Route 47 – Megenagna to Bole" */
    @Column(nullable = false, unique = true, length = 50)
    private String routeCode;

    @Column(nullable = false, length = 200)
    private String description;

    @Column(nullable = false)
    private boolean active = true;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // ── Constructors ──────────────────────────────────────────────────────────

    public Route() {}

    public Route(String routeCode, String description) {
        this.routeCode   = routeCode;
        this.description = description;
    }

    // ── Getters & Setters ─────────────────────────────────────────────────────

    public Long getId()                      { return id; }
    public void setId(Long id)               { this.id = id; }

    public String getRouteCode()             { return routeCode; }
    public void setRouteCode(String r)       { this.routeCode = r; }

    public String getDescription()           { return description; }
    public void setDescription(String d)     { this.description = d; }

    public boolean isActive()                { return active; }
    public void setActive(boolean active)    { this.active = active; }

    public LocalDateTime getCreatedAt()      { return createdAt; }
}
