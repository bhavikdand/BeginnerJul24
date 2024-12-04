package parkinglot.repositories;

import parkinglot.models.*;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    private Map<Integer, Ticket> map;

    public TicketRepository() {
        map = new TreeMap<>();
    }

    public Ticket insertTicket(Gate gate, Date entryTime, Spot assignedSpot, Vehicle vehicle){
        Ticket ticket = new Ticket();
        ticket.setGate(gate);
        ticket.setAssignedSpot(assignedSpot);
        ticket.setEntryTime(entryTime);
        ticket.setVehicle(vehicle);
        ticket.setId(map.size() + 1);
        map.put(ticket.getId(), ticket);
        return ticket;
    }
}
