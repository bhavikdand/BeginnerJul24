package parkinglot.strategy;

import parkinglot.exceptions.NoSpotAvailableException;
import parkinglot.models.Floor;
import parkinglot.models.Spot;
import parkinglot.models.VehicleType;

import java.util.List;

public interface SpotAssignStrategy {
    public Spot findAvailableSpot(List<Floor> floors, VehicleType type) throws NoSpotAvailableException;
}
