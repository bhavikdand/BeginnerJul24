package parkinglot.services;

import parkinglot.exceptions.NoSpotAvailableException;
import parkinglot.models.*;
import parkinglot.repositories.GateRepository;
import parkinglot.repositories.ParkingLotRepository;
import parkinglot.repositories.TicketRepository;
import parkinglot.repositories.VehicleRepository;
import parkinglot.strategy.SpotAssignStrategy;

import java.util.Date;

public class TicketServiceImpl implements TicketService{

    private VehicleService vehicleService;
    private ParkingLotRepository parkingLotRepository;
    private SpotAssignStrategy spotAssignStrategy;
    private TicketRepository ticketRepository;
    private GateRepository gateRepository;

    public TicketServiceImpl(VehicleService vehicleService, ParkingLotRepository parkingLotRepository, SpotAssignStrategy spotAssignStrategy, TicketRepository ticketRepository, GateRepository gateRepository) {
        this.vehicleService = vehicleService;
        this.parkingLotRepository = parkingLotRepository;
        this.spotAssignStrategy = spotAssignStrategy;
        this.ticketRepository = ticketRepository;
        this.gateRepository = gateRepository;
    }

    @Override
    public Ticket generateTicket(String registration, int gateId, VehicleType vehicleType) throws NoSpotAvailableException {
        /*
        Step #1: Create or get the vehicle
        Step #2: Get the parking lot object via gateId
        Step #3: Find the spot for parking, if nothing available, then throw an exception
        Else take the spot and assign it to the vehicle
        Step #4: Create the ticket and return it
         */
        Vehicle vehicle = vehicleService.createOrGet(registration, vehicleType);
        ParkingLot parkingLot = parkingLotRepository.getByGateId(gateId);
        Spot spot = this.spotAssignStrategy.findAvailableSpot(parkingLot.getFloors(), vehicleType);
        spot.setVehicle(vehicle);
        Gate gate = this.gateRepository.getGateById(gateId);

        return ticketRepository.insertTicket(gate, new Date(), spot, vehicle);
    }
}
