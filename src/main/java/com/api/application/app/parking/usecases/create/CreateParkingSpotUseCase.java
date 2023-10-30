package com.api.application.app.parking.usecases.create;

import com.api.application.app.parking.data.ParkingSpotRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.api.application.app.parking.entities.ParkingSpot;

@Service
public class CreateParkingSpotUseCase {

    private final ParkingSpotRepository _parkingSpotRepository;

    public CreateParkingSpotUseCase(ParkingSpotRepository parkingSpotRepository)
    {
        _parkingSpotRepository = parkingSpotRepository;
    }
    
    public void execute(CreateParkingSpotDto parkingSpotDto)
    {
        var parkingStopModel = new ParkingSpot(); 
        BeanUtils.copyProperties(parkingSpotDto, parkingStopModel);

        parkingStopModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));

        _parkingSpotRepository

        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkingStopModel));
    }
}
