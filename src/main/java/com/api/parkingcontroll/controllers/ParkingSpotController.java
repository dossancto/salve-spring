package com.api.parkingcontroll.controllers;

import com.api.parkingcontroll.dto.ParkingSpotDTO;
import com.api.parkingcontroll.models.ParkingSpotModel;
import com.api.parkingcontroll.services.ParkingSpotService;
import jakarta.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





/**
 * ParkingSpotController
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController {

    final ParkingSpotService parkingSpotService;

    public ParkingSpotController(ParkingSpotService parkingSpotService){
        this.parkingSpotService = parkingSpotService;
    }

    @PostMapping 
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDTO parkingSpotDTO){
        var parkingStopModel = new ParkingSpotModel(); 
        BeanUtils.copyProperties(parkingSpotDTO, parkingStopModel);
        
        // Automaticly set registration date, using the date in server.
        parkingStopModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));

        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkingStopModel));
    }

	@GetMapping("/")
    public ResponseEntity<List<ParkingSpotModel>> getAllParkingSpot(){
        return ResponseEntity.status(HttpStatus.OK).body(parkingSpotService.getAll());
    } 

	@GetMapping("/{id}")
    public ResponseEntity<Object> getParkingSpot(@PathVariable(value = "id") UUID id){
        var parkingSpot0 = parkingSpotService.get(id);

        if(!parkingSpot0.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking Spot not found not found");
        }

        return ResponseEntity.status(HttpStatus.OK).body(parkingSpot0.get());
    } 
   
}