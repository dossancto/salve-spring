package com.api.parkingcontroll.services;
import org.springframework.stereotype.Service;

import com.api.parkingcontroll.models.ParkingSpotModel;
import com.api.parkingcontroll.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

/**
 * ParkingSpotService
 */
@Service
public class ParkingSpotService {

    final ParkingSpotRepository ParkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository ParkingSpotRepository){
        this.ParkingSpotRepository = ParkingSpotRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpot){
        return ParkingSpotRepository.save(parkingSpot);
    }
}