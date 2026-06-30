package com.anbesaflow.auth.repository;
import com.anbesaflow.auth.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository
extends JpaRepository<Bus,Long>{

List<Bus> findByStatus(String status);

boolean existsByPlateNumber(String plateNumber);

}