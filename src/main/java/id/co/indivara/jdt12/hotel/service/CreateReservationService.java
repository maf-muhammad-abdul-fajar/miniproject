package id.co.indivara.jdt12.hotel.service;

import id.co.indivara.jdt12.hotel.entity.Customer;
import id.co.indivara.jdt12.hotel.entity.ReservationRoom;
import id.co.indivara.jdt12.hotel.entity.Room;
import id.co.indivara.jdt12.hotel.repository.CreateReservationRepository;
import id.co.indivara.jdt12.hotel.repository.CustomerRepository;
import id.co.indivara.jdt12.hotel.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.Instant;
import java.util.Date;

@Service
public class CreateReservationService {
    @Autowired
    CreateReservationRepository createReservationRepository;
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    CustomerRepository customerRepository;

    @Transactional
    public ReservationRoom createReservation(ReservationRoom reservationRoom)throws Exception{
        Room rom = roomRepository.findById(reservationRoom.getRoomId()).orElseThrow(()->new Exception("Room Tidak DiTemukan"));
        String roomTersedia= createReservationRepository.findRoomAvailbility(rom.getRoomId());
        if (roomTersedia.equalsIgnoreCase("no") && roomTersedia !=null){
            throw new Exception("Room Tidak Tersedia");
        }
        Customer cus = customerRepository.findById(reservationRoom.getCustomerId()).orElseThrow(()->new Exception("Customer Tidak DiTemukan"));
        reservationRoom.setCustomer(cus);
        reservationRoom.setRoom(rom);
        reservationRoom.setCheckIn(reservationRoom.getCheckIn());
        reservationRoom.setCheckout(reservationRoom.getCheckout());
        if (Instant.now().isBefore(reservationRoom.getCheckIn())){
            reservationRoom.setRoomStatus(ReservationRoom.RoomStatus.BOOKED);
        }else {
            reservationRoom.setRoomStatus(ReservationRoom.RoomStatus.ON_GOING);
        }
        createReservationRepository.save(reservationRoom);
        return reservationRoom;
    }
//    public ReservationRoom statusRoomFinish(ReservationRoom reservationRoom) throws Exception{
//        Room rom = createReservationRepository.findById(reservationRoom.getReservationId()).orElseThrow(()-> new Exception("Reservation tidak tersedia")).getRoom();
//        String roomTersedia= createReservationRepository.findRoomAvailbility(rom.getRoomId());
//        if (roomTersedia.equalsIgnoreCase("yes") && roomTersedia !=null){
//            createReservationRepository.findAll();
//        }
//        return reservationRoom;

    }

