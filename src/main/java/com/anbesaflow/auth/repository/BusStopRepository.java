package com.anbesaflow.auth.repository;

import com.anbesaflow.auth.entity.BusStop;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface BusStopRepository extends JpaRepository<BusStop, Long> {
    List<BusStop> findByRouteId(Long routeId);
    Optional<BusStop> findByName(String name);
}
