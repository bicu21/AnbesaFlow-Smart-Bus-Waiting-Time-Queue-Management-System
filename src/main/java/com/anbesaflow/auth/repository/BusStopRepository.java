package com.anbesaflow.auth.repository;

import com.anbesaflow.auth.entity.BusStop;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BusStopRepository extends JpaRepository<BusStop, Long> {
    Optional<BusStop> findByName(String name);
    Page<BusStop> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
