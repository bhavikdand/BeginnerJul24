package parkinglot.strategy;

import parkinglot.exceptions.NoSpotAvailableException;
import parkinglot.models.Floor;
import parkinglot.models.FloorStatus;
import parkinglot.models.Spot;
import parkinglot.models.VehicleType;

import java.util.List;

public class NearestAvailableStrategy implements SpotAssignStrategy{
    @Override
    public Spot findAvailableSpot(List<Floor> floors, VehicleType type) throws NoSpotAvailableException {
        for (Floor floor : floors) {
            if(floor.getStatus() == FloorStatus.OPERATIONAL) {
                for (Spot spot : floor.getSpots()) {
                    if (!spot.isOccupied() && spot.getType() == type) {
                        return spot;
                    }
                }
            }
        }

        throw new NoSpotAvailableException("No spots available, please try again");
    }
}
