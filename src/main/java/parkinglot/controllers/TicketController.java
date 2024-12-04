package parkinglot.controllers;

import parkinglot.dtos.GenerateTicketRequestDto;
import parkinglot.dtos.GenerateTicketResponseDto;
import parkinglot.dtos.ResponseStatus;
import parkinglot.exceptions.NoSpotAvailableException;
import parkinglot.models.Ticket;
import parkinglot.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto){
        //Validation to be done on the DTO
        //If successful, then call the service
        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        try{
            Ticket ticket = ticketService.generateTicket(requestDto.getRegistrationNumber(), requestDto.getGateId(), requestDto.getVehicleType());
            responseDto.setStatus(ResponseStatus.SUCCESS);
            responseDto.setTicket(ticket);
        } catch (NoSpotAvailableException ex){
            responseDto.setStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
