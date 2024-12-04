package parkinglot.repositories;

import parkinglot.models.Floor;
import parkinglot.models.Gate;
import parkinglot.models.ParkingLot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {

    private Map<Integer, ParkingLot> map;

    public ParkingLotRepository(Map<Integer, ParkingLot> map) {
        this.map = map;
    }

    public ParkingLotRepository() {
        map = new TreeMap<>();
    }

    public ParkingLot getByGateId(int gateId){
        for (Map.Entry<Integer, ParkingLot> entry : map.entrySet()) {
            ParkingLot parkingLot = entry.getValue();
            for (Floor floor : parkingLot.getFloors()) {
                for (Gate gate : floor.getGates()) {
                    if(gate.getId() == gateId){
                        return parkingLot;
                    }
                }
            }
        }
        return null;
    }
}
