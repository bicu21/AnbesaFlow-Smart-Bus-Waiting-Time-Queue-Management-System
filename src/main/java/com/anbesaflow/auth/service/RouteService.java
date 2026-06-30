package com.anbesaflow.auth.service;

import com.anbesaflow.auth.entity.Route;
import com.anbesaflow.auth.repository.RouteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    private final RouteRepository routeRepository;

    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public Route createRoute(String routeCode, String description) {
        Route route = new Route(routeCode, description);
        return routeRepository.save(route);
    }

    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }
}
