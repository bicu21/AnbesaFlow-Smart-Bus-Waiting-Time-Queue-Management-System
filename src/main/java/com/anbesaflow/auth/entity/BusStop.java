package com.anbesaflow.auth.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="bus_stops")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusStop {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String location;
}