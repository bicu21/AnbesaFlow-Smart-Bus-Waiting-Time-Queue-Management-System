package com.anbesaflow.auth.repository;

import com.anbesaflow.auth.entity.Route;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
    Page<Route> findByNameContainingIgnoreCaseOrStartPointContainingIgnoreCaseOrEndPointContainingIgnoreCase(
            String name, String startPoint, String endPoint, Pageable pageable);
}
