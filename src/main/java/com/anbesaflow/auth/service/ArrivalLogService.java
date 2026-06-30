package com.anbesaflow.auth.service;

import com.anbesaflow.auth.entity.ArrivalLog;
import com.anbesaflow.auth.entity.Bus;
import com.anbesaflow.auth.entity.BusStop;
import com.anbesaflow.auth.repository.ArrivalLogRepository;
import com.anbesaflow.auth.repository.BusRepository;
import com.anbesaflow.auth.repository.BusStopRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ArrivalLogService {

    private final ArrivalLogRepository arrivalLogRepository;
    private final BusRepository busRepository;
    private final BusStopRepository busStopRepository;

    public ArrivalLogService(ArrivalLogRepository arrivalLogRepository, BusRepository busRepository, BusStopRepository busStopRepository) {
        this.arrivalLogRepository = arrivalLogRepository;
        this.busRepository = busRepository;
        this.busStopRepository = busStopRepository;
    }

    public ArrivalLog recordArrival(String plateNumber, Long busStopId) {
        Bus bus = busRepository.findByPlateNumber(plateNumber)
                .orElseThrow(() -> new IllegalArgumentException("Bus not found"));
        BusStop stop = busStopRepository.findById(busStopId)
                .orElseThrow(() -> new IllegalArgumentException("Bus stop not found"));

        ArrivalLog log = new ArrivalLog(bus, stop, LocalDateTime.now());
        return arrivalLogRepository.save(log);
    }

    public ArrivalLog recordDeparture(String plateNumber, Long busStopId) {
        // Find the most recent arrival for this bus at this stop
        Bus bus = busRepository.findByPlateNumber(plateNumber)
                .orElseThrow(() -> new IllegalArgumentException("Bus not found"));
        
        List<ArrivalLog> logs = arrivalLogRepository.findByBusIdOrderByArrivalTimeDesc(bus.getId());
        
        for (ArrivalLog log : logs) {
            if (log.getBusStop().getId().equals(busStopId) && log.getDepartureTime() == null) {
                log.setDepartureTime(LocalDateTime.now());
                return arrivalLogRepository.save(log);
            }
        }
        throw new IllegalArgumentException("No recent arrival found to record departure");
    }
}
