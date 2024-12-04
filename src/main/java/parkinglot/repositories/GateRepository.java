package parkinglot.repositories;

import parkinglot.models.Gate;

import java.util.Map;
import java.util.TreeMap;

public class GateRepository {

    private Map<Integer, Gate> map;

    public GateRepository() {
        map = new TreeMap<>();
    }

    public GateRepository(Map<Integer, Gate> map){
        this.map = map;
    }

    public Gate getGateById(int gateId){
        return map.get(gateId);
    }
}
