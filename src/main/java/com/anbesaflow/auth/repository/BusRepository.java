package com.anbesaflow.auth.repository;

import com.anbesaflow.auth.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface BusRepository extends JpaRepository<Bus, Long> {
    Optional<Bus> findByPlateNumber(String plateNumber);
    List<Bus> findByRouteIdAndStatus(Long routeId, Bus.BusStatus status);
}
