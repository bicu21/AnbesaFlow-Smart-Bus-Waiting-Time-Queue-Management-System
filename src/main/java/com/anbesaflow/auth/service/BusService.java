package com.anbesaflow.auth.service;

import com.anbesaflow.auth.entity.Bus;
import com.anbesaflow.auth.exception.ResourceNotFoundException;
import com.anbesaflow.auth.repository.BusRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BusService {

    private final BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public Bus createBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Transactional(readOnly = true)
    public Page<Bus> getAllBuses(String status, Pageable pageable) {
        if (status != null && !status.isBlank()) {
            return busRepository.findByStatus(status, pageable);
        }
        return busRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Bus getBusById(Long id) {
        return busRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bus not found with id: " + id));
    }

    public Bus updateBus(Long id, Bus updatedBus) {
        Bus existingBus = getBusById(id);
        existingBus.setPlateNumber(updatedBus.getPlateNumber());
        existingBus.setCapacity(updatedBus.getCapacity());
        existingBus.setStatus(updatedBus.getStatus());
        // Preserve route association if provided
        if (updatedBus.getRoute() != null) {
            existingBus.setRoute(updatedBus.getRoute());
        }
        return busRepository.save(existingBus);
    }

    public void deleteBus(Long id) {
        Bus bus = getBusById(id);
        busRepository.delete(bus);
    }
}
