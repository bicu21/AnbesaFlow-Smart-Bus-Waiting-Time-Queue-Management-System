package com.anbesaflow.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RouteRequest {
    private String routeNumber;
    private String startLocation;
    private String endLocation;
    private Double distanceKm;
}
