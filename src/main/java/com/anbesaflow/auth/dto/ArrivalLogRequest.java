package com.anbesaflow.auth.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class ArrivalLogRequest {
    private Long busId;
    private Long busStopId;
    private LocalDateTime arrivalTime;
}
