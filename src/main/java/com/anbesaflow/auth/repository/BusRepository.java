package com.anbesaflow.auth.repository;

import com.anbesaflow.auth.entity.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
    Optional<Bus> findByPlateNumber(String plateNumber);
    Page<Bus> findByStatus(String status, Pageable pageable);
}
