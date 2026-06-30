package com.anbesaflow.auth.service;

import com.anbesaflow.auth.entity.BusStop;
import com.anbesaflow.auth.entity.Route;
import com.anbesaflow.auth.repository.BusStopRepository;
import com.anbesaflow.auth.repository.RouteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusStopService {

    private final BusStopRepository busStopRepository;
    private final RouteRepository routeRepository;

    public BusStopService(BusStopRepository busStopRepository, RouteRepository routeRepository) {
        this.busStopRepository = busStopRepository;
        this.routeRepository = routeRepository;
    }

    public BusStop createBusStop(String name, String locationDescription, Long routeId) {
        Route route = routeId != null ? routeRepository.findById(routeId).orElse(null) : null;
        BusStop stop = new BusStop(name, locationDescription, null, null, route);
        return busStopRepository.save(stop);
    }

    public List<BusStop> getAllBusStops() {
        return busStopRepository.findAll();
    }
}
