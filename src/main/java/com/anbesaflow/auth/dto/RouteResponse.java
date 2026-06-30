package com.anbesaflow.auth.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RouteResponse {
    private Long id;
    private String routeNumber;
    private String startLocation;
    private String endLocation;
    private Double distanceKm;
}
