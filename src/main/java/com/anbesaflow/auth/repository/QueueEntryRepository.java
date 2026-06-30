package com.anbesaflow.auth.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anbesaflow.auth.entity.QueueEntry;
import com.anbesaflow.auth.entity.User;

public interface QueueEntryRepository extends JpaRepository<QueueEntry, Long> {

    List<QueueEntry> findByBusStopOrderByPositionAsc(String busStop);

    Optional<QueueEntry> findByUser(User user);

    boolean existsByUser(User user);

    void deleteByUser(User user);

    long countByBusStop(String busStop);
}