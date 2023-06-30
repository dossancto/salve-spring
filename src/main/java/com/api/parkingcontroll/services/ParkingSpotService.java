package com.api.parkingcontroll.services;
import org.springframework.stereotype.Service;

import com.api.parkingcontroll.repository.ParkingSpotRepository;

/**
 * ParkingSpotService
 */
@Service
public class ParkingSpotService {

    final ParkingSpotRepository ParkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository ParkingSpotRepository){
        this.ParkingSpotRepository = ParkingSpotRepository;
    }
}