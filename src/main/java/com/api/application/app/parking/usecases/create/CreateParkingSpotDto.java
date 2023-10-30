package com.api.application.app.parking.usecases.create;

public record CreateParkingSpotDto(String parkingSpotNumber, String licensePlateCar, String brandCar, String modelCar, String colorCar, String responsibleName, String apartment, String block) { }