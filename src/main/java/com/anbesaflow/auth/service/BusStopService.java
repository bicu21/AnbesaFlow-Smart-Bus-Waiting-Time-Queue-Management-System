package com.anbesaflow.auth.service;

import com.anbesaflow.auth.entity.BusStop;
import com.anbesaflow.auth.exception.ResourceNotFoundException;
import com.anbesaflow.auth.repository.BusStopRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BusStopService {

    private final BusStopRepository busStopRepository;

    public BusStopService(BusStopRepository busStopRepository) {
        this.busStopRepository = busStopRepository;
    }

    public BusStop createBusStop(BusStop busStop) {
        return busStopRepository.save(busStop);
    }

    @Transactional(readOnly = true)
    public Page<BusStop> getAllBusStops(String search, Pageable pageable) {
        if (search != null && !search.isBlank()) {
            return busStopRepository.findByNameContainingIgnoreCase(search, pageable);
        }
        return busStopRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public BusStop getBusStopById(Long id) {
        return busStopRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bus Stop not found with id: " + id));
    }

    public BusStop updateBusStop(Long id, BusStop updatedBusStop) {
        BusStop existingStop = getBusStopById(id);
        existingStop.setName(updatedBusStop.getName());
        existingStop.setLocation(updatedBusStop.getLocation());
        return busStopRepository.save(existingStop);
    }

    public void deleteBusStop(Long id) {
        BusStop busStop = getBusStopById(id);
        busStopRepository.delete(busStop);
    }
}
