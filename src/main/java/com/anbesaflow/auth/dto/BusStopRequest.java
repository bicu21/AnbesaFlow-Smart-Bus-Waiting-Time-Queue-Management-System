package com.anbesaflow.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusStopRequest {
    private String name;
    private Double latitude;
    private Double longitude;
}
