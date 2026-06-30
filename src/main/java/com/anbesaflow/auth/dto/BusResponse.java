package com.anbesaflow.auth.dto;
import lombok.Builder;
import lombok.Getter;
@Getter
@Builder
public class BusResponse{

Long id;

String plateNumber;

Integer capacity;

String status;

}
