package com.api.parkingcontroll.services;
import com.api.parkingcontroll.models.ParkingSpotModel;
import com.api.parkingcontroll.repositories.ParkingSpotRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;





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

    public List<ParkingSpotModel> getAll(){
        return ParkingSpotRepository.findAll();
    }

    public Optional<ParkingSpotModel> get(UUID id){
         return ParkingSpotRepository.findById(id);
    }
}