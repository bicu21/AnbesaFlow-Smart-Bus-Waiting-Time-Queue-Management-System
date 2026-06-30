package com.anbesaflow.auth.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name="arrival_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArrivalLog {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="bus_id")
    private Bus bus;

    @ManyToOne
    @JoinColumn(name="bus_stop_id")
    private BusStop busStop;

    private LocalDateTime arrivalTime;

    private LocalDateTime departureTime;

    private String status;
}