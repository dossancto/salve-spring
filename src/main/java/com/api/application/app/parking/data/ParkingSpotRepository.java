package com.api.application.app.parking.data;

import com.api.application.app.parking.entities.ParkingSpot;

public interface ParkingSpotRepository {
    ParkingSpot create(ParkingSpot parkingSpot);
}