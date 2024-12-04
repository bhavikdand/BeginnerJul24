package parkinglot.services;

import parkinglot.models.Vehicle;
import parkinglot.models.VehicleType;

public interface VehicleService {

    public Vehicle createOrGet(String registrationNumber, VehicleType type);
}
