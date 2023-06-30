package com.api.parkingcontroll.repository;

import com.api.parkingcontroll.models.ParkingSpot;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ParkingSpotRepository
 */
@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, UUID> {
}