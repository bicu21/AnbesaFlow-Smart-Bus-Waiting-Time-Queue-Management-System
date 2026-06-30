package com.anbesaflow.auth.repository;

import com.anbesaflow.auth.entity.ArrivalLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArrivalLogRepository extends JpaRepository<ArrivalLog, Long> {
    Page<ArrivalLog> findByBusId(Long busId, Pageable pageable);
    Page<ArrivalLog> findByBusStopId(Long busStopId, Pageable pageable);
}