package com.anbesaflow.auth.repository;

import com.anbesaflow.auth.entity.ArrivalLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ArrivalLogRepository extends JpaRepository<ArrivalLog, Long> {
    List<ArrivalLog> findByBusStopIdOrderByArrivalTimeDesc(Long busStopId);
    List<ArrivalLog> findByBusIdOrderByArrivalTimeDesc(Long busId);
}
