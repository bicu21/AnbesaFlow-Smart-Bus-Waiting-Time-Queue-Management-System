package com.anbesaflow.auth.service;

import com.anbesaflow.auth.entity.Bus;
import com.anbesaflow.auth.entity.Route;
import com.anbesaflow.auth.repository.BusRepository;
import com.anbesaflow.auth.repository.RouteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {

    private final BusRepository busRepository;
    private final RouteRepository routeRepository;

    public BusService(BusRepository busRepository, RouteRepository routeRepository) {
        this.busRepository = busRepository;
        this.routeRepository = routeRepository;
    }

    public Bus createBus(String plateNumber, Integer capacity, Long routeId) {
        Route route = routeRepository.findById(routeId)
                .orElseThrow(() -> new IllegalArgumentException("Route not found"));
        Bus bus = new Bus(plateNumber, capacity, route);
        return busRepository.save(bus);
    }

    public Bus updateBusStatus(String plateNumber, Bus.BusStatus status) {
        Bus bus = busRepository.findByPlateNumber(plateNumber)
                .orElseThrow(() -> new IllegalArgumentException("Bus not found"));
        bus.setStatus(status);
        return busRepository.save(bus);
    }

    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }
}
