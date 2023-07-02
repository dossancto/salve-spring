package com.api.parkingcontroll.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ParkingSpotController
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController {

    // final ParkingSpotService parkingSpotService;

    // public ParkingSpotController(ParkingSpotService parkingSpotService){
    //     this.parkingSpotService = parkingSpotService;
    // }

    // @PostMapping 
    // public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDTO parkingSpotDTO){
    //     var parkingStopModel = new ParkingSpot(); 
    //     BeanUtils.copyProperties(parkingSpotDTO, parkingStopModel);
        
    //     // Automaticly set registration date, using the date in server.
    //     parkingStopModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));

    //     return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkingStopModel));

    // }
   
	@GetMapping("/")
	public String index(){
		return "Hello World";
	}
}