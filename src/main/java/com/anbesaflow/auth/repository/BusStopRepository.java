package com.anbesaflow.auth.repository;
import com.anbesaflow.auth.entity.Route;
import com.anbesaflow.auth.entity.BusStop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BusStopRepository
extends JpaRepository<BusStop,Long>{

List<BusStop>
findByNameContainingIgnoreCase(
String name
);

}