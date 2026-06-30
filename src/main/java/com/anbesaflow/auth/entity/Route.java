package com.anbesaflow.auth.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="routes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Route {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String startPoint;

    private String endPoint;
}