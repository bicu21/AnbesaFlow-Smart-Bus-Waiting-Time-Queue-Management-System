package com.anbesaflow.auth.service;

import com.anbesaflow.auth.dto.RouteRequest;
import com.anbesaflow.auth.dto.RouteResponse;

import java.util.List;

public interface RouteService {

    RouteResponse create(
            RouteRequest request
    );

    List<RouteResponse> getAll();

    RouteResponse update(
            Long id,
            RouteRequest request
    );

    void delete(
            Long id
    );

}