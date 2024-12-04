package parkinglot.services;

import parkinglot.models.Vehicle;
import parkinglot.models.VehicleType;
import parkinglot.repositories.VehicleRepository;

public class VehicleServiceImpl implements VehicleService{

    private VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle createOrGet(String registrationNumber, VehicleType type) {
        return vehicleRepository.createOrGet(registrationNumber, type);
    }
}
