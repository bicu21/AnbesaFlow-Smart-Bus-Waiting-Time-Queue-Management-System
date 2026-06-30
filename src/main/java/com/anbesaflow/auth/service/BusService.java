package com.anbesaflow.auth.service;

import com.anbesaflow.auth.dto.BusRequest;
import com.anbesaflow.auth.dto.BusResponse;

import java.util.List;

public interface BusService {

    BusResponse create(
            BusRequest request
    );

    List<BusResponse> getAll();

    BusResponse update(
            Long id,
            BusRequest request
    );

    void delete(
            Long id
    );

}