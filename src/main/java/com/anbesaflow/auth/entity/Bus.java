package com.anbesaflow.auth.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="buses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false,unique=true)
    private String plateNumber;

    @Column(nullable=false)
    private Integer capacity;

    @Column(nullable=false)
    private String status;
}