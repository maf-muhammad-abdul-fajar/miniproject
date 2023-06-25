package id.co.indivara.jdt12.hotel.controller;

import id.co.indivara.jdt12.hotel.entity.ReservationRoom;
import id.co.indivara.jdt12.hotel.service.CreateReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
    @Autowired
    CreateReservationService createReservationService;
    @PostMapping("/reservation")
    public ReservationRoom creatReservation(@RequestBody ReservationRoom reservationRoom) throws Exception{
        return createReservationService.createReservation(reservationRoom);
    }
}
