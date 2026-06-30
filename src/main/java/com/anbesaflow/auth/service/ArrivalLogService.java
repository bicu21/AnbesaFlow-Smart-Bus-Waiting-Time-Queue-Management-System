package com.anbesaflow.auth.service;

import com.anbesaflow.auth.entity.ArrivalLog;
import com.anbesaflow.auth.repository.ArrivalLogRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArrivalLogService {

    private final ArrivalLogRepository arrivalLogRepository;

    public ArrivalLogService(ArrivalLogRepository arrivalLogRepository) {
        this.arrivalLogRepository = arrivalLogRepository;
    }

    public ArrivalLog logArrival(ArrivalLog arrivalLog) {
        return arrivalLogRepository.save(arrivalLog);
    }

    @Transactional(readOnly = true)
    public Page<ArrivalLog> getArrivalLogs(Long busId, Long busStopId, Pageable pageable) {
        if (busId != null) {
            return arrivalLogRepository.findByBusId(busId, pageable);
        } else if (busStopId != null) {
            return arrivalLogRepository.findByBusStopId(busStopId, pageable);
        }
        return arrivalLogRepository.findAll(pageable);
    }
}
