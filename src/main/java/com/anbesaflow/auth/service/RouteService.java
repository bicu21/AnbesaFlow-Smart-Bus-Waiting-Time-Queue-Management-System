package com.anbesaflow.auth.service;

import com.anbesaflow.auth.entity.Route;
import com.anbesaflow.auth.exception.ResourceNotFoundException;
import com.anbesaflow.auth.repository.RouteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RouteService {

    private final RouteRepository routeRepository;

    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public Route createRoute(Route route) {
        return routeRepository.save(route);
    }

    @Transactional(readOnly = true)
    public Page<Route> getAllRoutes(String search, Pageable pageable) {
        if (search != null && !search.isBlank()) {
            return routeRepository.findByNameContainingIgnoreCaseOrStartPointContainingIgnoreCaseOrEndPointContainingIgnoreCase(
                    search, search, search, pageable);
        }
        return routeRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Route getRouteById(Long id) {
        return routeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Route not found with id: " + id));
    }

    public Route updateRoute(Long id, Route updatedRoute) {
        Route existingRoute = getRouteById(id);
        existingRoute.setName(updatedRoute.getName());
        existingRoute.setStartPoint(updatedRoute.getStartPoint());
        existingRoute.setEndPoint(updatedRoute.getEndPoint());
        return routeRepository.save(existingRoute);
    }

    public void deleteRoute(Long id) {
        Route route = getRouteById(id);
        routeRepository.delete(route);
    }
}