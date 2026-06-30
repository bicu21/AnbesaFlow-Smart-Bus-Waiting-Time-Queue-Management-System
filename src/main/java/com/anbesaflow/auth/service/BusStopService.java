package com.anbesaflow.auth.service;

import com.anbesaflow.auth.dto.BusStopRequest;
import com.anbesaflow.auth.dto.BusStopResponse;

import java.util.List;

public interface BusStopService {

    BusStopResponse create(
            BusStopRequest request
    );

    List<BusStopResponse> getAll();

    BusStopResponse update(
            Long id,
            BusStopRequest request
    );

    void delete(
            Long id
    );

}