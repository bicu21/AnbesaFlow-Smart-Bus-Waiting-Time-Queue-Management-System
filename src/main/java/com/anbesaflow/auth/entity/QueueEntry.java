package com.anbesaflow.auth.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "queue_entries")
public class QueueEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer position;

    @Column(nullable =false)
    private LocalDateTime joinedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String busStop;

    public QueueEntry() {
    }

    public QueueEntry(Long id,
                      Integer position,
                      LocalDateTime joinedAt,
                      User user,
                      String busStop) {
        this.id = id;
        this.position = position;
        this.joinedAt = joinedAt;
        this.user = user;
        this.busStop = busStop;
    }

    public Long getId() {
        return id;
    }

    public Integer getPosition() {
        return position;
    }

    public LocalDateTime getJoinedAt() {
        return joinedAt;
    }

    public User getUser() {
        return user;
    }

    public String getBusStop() {
        return busStop;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public void setJoinedAt(LocalDateTime joinedAt) {
        this.joinedAt = joinedAt;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBusStop(String busStop) {
        this.busStop = busStop;
    }
}