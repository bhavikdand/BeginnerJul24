package parkinglot;

import parkinglot.controllers.TicketController;
import parkinglot.dtos.GenerateTicketRequestDto;
import parkinglot.dtos.GenerateTicketResponseDto;
import parkinglot.models.*;
import parkinglot.repositories.*;
import parkinglot.services.TicketService;
import parkinglot.services.TicketServiceImpl;
import parkinglot.services.VehicleService;
import parkinglot.services.VehicleServiceImpl;
import parkinglot.strategy.NearestAvailableStrategy;
import parkinglot.strategy.SpotAssignStrategy;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRunner {
    public static void main(String[] args) {

        Gate gate1 = new Gate();
        gate1.setId(1);
        gate1.setGateType(GateType.ENTRY);
        gate1.setCurrentOperator(new Operator());

        Map<Integer, Gate> map = new TreeMap(){{
            put(1, gate1);
        }};
        GateRepository gateRepository = new GateRepository(map);
        Floor floor = new Floor();
        floor.setGates(Arrays.asList(gate1));
        Spot spot1 = new Spot();
        spot1.setId(1);
        spot1.setType(VehicleType.CAR);

        Spot spot2 = new Spot();
        spot2.setId(2);
        spot2.setType(VehicleType.CAR);
        floor.setSpots(Arrays.asList(spot1, spot2));
        floor.setStatus(FloorStatus.OPERATIONAL);
        floor.setId(1);

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress("Koramangala, Bangalore");
        parkingLot.setFloors(Arrays.asList(floor));
        parkingLot.setId(1);

        Map<Integer, ParkingLot> parkingLotMap = new TreeMap(){{
            put(parkingLot.getId(), parkingLot);
        }};

        ParkingLotRepository parkingLotRepository = new ParkingLotRepository(parkingLotMap);

        VehicleRepository vehicleRepository = new VehicleRepositoryImpl();
        VehicleService vehicleService = new VehicleServiceImpl(vehicleRepository);
        TicketRepository ticketRepository = new TicketRepository();
        SpotAssignStrategy strategy = new NearestAvailableStrategy();
        TicketService ticketService = new TicketServiceImpl(vehicleService, parkingLotRepository, strategy, ticketRepository, gateRepository);

        TicketController ticketController = new TicketController(ticketService);

        GenerateTicketRequestDto requestDto = new GenerateTicketRequestDto();
        requestDto.setVehicleType(VehicleType.CAR);
        requestDto.setRegistrationNumber("KA 01 0101");
        requestDto.setGateId(gate1.getId());

        GenerateTicketResponseDto responseDto = ticketController.generateTicket(requestDto);
        System.out.println("DEBUG");

    }
}
