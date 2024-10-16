package com.debnath.RideSafe.Repository;

import com.debnath.RideSafe.Entity.RideRequest;
import com.debnath.RideSafe.Enum.RideStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {
    List<RideRequest> findByStatus(RideStatus status);
}
