package com.anbesaflow.auth.service;

import com.anbesaflow.auth.dto.ArrivalLogRequest;
import com.anbesaflow.auth.dto.ArrivalLogResponse;

import java.util.List;

public interface ArrivalLogService {

    ArrivalLogResponse create(
            ArrivalLogRequest request
    );

    List<ArrivalLogResponse> getAll();

    ArrivalLogResponse update(
            Long id,
            ArrivalLogRequest request
    );

    void delete(
            Long id
    );

}