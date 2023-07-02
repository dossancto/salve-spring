package com.api.parkingcontroll.repositories;

import com.api.parkingcontroll.models.ParkingSpotModel;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ParkingSpotRepository
 */
@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
}