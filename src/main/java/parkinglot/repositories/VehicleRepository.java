package parkinglot.repositories;

import parkinglot.models.Vehicle;
import parkinglot.models.VehicleType;

public interface VehicleRepository {

    public Vehicle createOrGet(String registrationNumber, VehicleType type);
}
