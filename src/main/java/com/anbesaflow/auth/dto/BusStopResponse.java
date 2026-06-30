package com.anbesaflow.auth.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BusStopResponse {
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;
}
