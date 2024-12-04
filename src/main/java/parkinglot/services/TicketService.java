package parkinglot.services;

import parkinglot.exceptions.NoSpotAvailableException;
import parkinglot.models.Ticket;
import parkinglot.models.VehicleType;

public interface TicketService {
    public Ticket generateTicket(String registration, int gateId, VehicleType vehicleType) throws NoSpotAvailableException;
}
