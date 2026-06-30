package com.anbesaflow.auth.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anbesaflow.auth.dto.QueueStatusResponse;
import com.anbesaflow.auth.entity.QueueEntry;
import com.anbesaflow.auth.entity.User;
import com.anbesaflow.auth.exception.QueueNotFoundException;
import com.anbesaflow.auth.repository.QueueEntryRepository;
import com.anbesaflow.auth.repository.UserRepository;
import com.anbesaflow.auth.security.CustomUserDetails;

@Service
public class QueueService {

    private final QueueEntryRepository queueRepository;
    private final UserRepository userRepository;

    public QueueService(QueueEntryRepository queueRepository,
                        UserRepository userRepository) {
        this.queueRepository = queueRepository;
        this.userRepository = userRepository;
    }

    private User currentUser() {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        CustomUserDetails userDetails =
                (CustomUserDetails) authentication.getPrincipal();

        return userRepository.findById(userDetails.getId())
                .orElseThrow(() ->
                        new RuntimeException("User not found"));
    }
    @Transactional
public QueueStatusResponse joinQueue(String busStop) {

    User user = currentUser();

    if(queueRepository.existsByUser(user)){
        throw new RuntimeException("User already joined a queue.");
    }

    long total = queueRepository.countByBusStop(busStop);

    QueueEntry entry = new QueueEntry();

    entry.setBusStop(busStop);
    entry.setUser(user);
    entry.setJoinedAt(LocalDateTime.now());
    entry.setPosition((int) total + 1);

    queueRepository.save(entry);

    return new QueueStatusResponse(
            busStop,
            entry.getPosition(),
            entry.getPosition()-1,
            total+1
    );
}
@Transactional(readOnly = true)
public QueueStatusResponse getStatus() {

    User user = currentUser();

    QueueEntry entry = queueRepository.findByUser(user)
            .orElseThrow(() ->
                    new QueueNotFoundException("Queue entry not found"));

    long total =
            queueRepository.countByBusStop(entry.getBusStop());

    return new QueueStatusResponse(

            entry.getBusStop(),

            entry.getPosition(),

            entry.getPosition()-1,

            total
    );
}
@Transactional
public void leaveQueue(){

    User user = currentUser();

    QueueEntry entry = queueRepository.findByUser(user)
            .orElseThrow(() ->
                    new QueueNotFoundException("Queue entry not found"));

    String stop = entry.getBusStop();

    int removedPosition = entry.getPosition();

    queueRepository.delete(entry);

    List<QueueEntry> queue =
            queueRepository.findByBusStopOrderByPositionAsc(stop);

    for(QueueEntry q : queue){

        if(q.getPosition() > removedPosition){

            q.setPosition(q.getPosition()-1);

            queueRepository.save(q);

        }
    }
}
@Transactional(readOnly = true)
public int getEstimatedWaitingTime(){

    QueueEntry entry =
            queueRepository.findByUser(currentUser())
            .orElseThrow(() ->
                    new QueueNotFoundException("Queue entry not found"));

    final int BUS_CAPACITY = 10;

    final int ARRIVAL_INTERVAL = 10;

    int busesNeeded =
            (int)Math.ceil((double)entry.getPosition()/BUS_CAPACITY);

    return busesNeeded * ARRIVAL_INTERVAL;
}}