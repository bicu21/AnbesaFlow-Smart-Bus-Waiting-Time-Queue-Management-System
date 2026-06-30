package com.anbesaflow.auth.dto;

import lombok.Builder;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
@Builder
public class ArrivalLogResponse {
    private Long id;
    private Long busId;
    private Long busStopId;
    private LocalDateTime arrivalTime;
    private String status; // e.g., DELAYED, ON_TIME
}
