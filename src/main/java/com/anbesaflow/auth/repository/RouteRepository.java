package com.anbesaflow.auth.repository;
import com.anbesaflow.auth.entity.Route;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RouteRepository
extends JpaRepository<Route,Long>{

List<Route> findByNameContainingIgnoreCase(
String name
);

}