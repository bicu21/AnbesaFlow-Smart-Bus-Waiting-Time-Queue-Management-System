package com.anbesaflow.auth.repository;
import com.anbesaflow.auth.entity.ArrivalLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ArrivalLogRepository
extends JpaRepository<ArrivalLog,Long>{

List<ArrivalLog>
findByStatus(
String status
);

}