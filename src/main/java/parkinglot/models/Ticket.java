package parkinglot.models;

import java.util.Date;

public class Ticket {
    private int id;
    private Gate gate;
    private Date entryTime;
    private Vehicle vehicle;
    private Spot assignedSpot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Spot getAssignedSpot() {
        return assignedSpot;
    }

    public void setAssignedSpot(Spot assignedSpot) {
        this.assignedSpot = assignedSpot;
    }
}
