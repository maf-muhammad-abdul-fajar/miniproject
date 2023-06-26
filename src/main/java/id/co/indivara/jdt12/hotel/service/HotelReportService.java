package id.co.indivara.jdt12.hotel.service;

import id.co.indivara.jdt12.hotel.entity.HotelReport;
import id.co.indivara.jdt12.hotel.entity.ReservationRoom;
import id.co.indivara.jdt12.hotel.repository.CreateReservationRepository;
import id.co.indivara.jdt12.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class HotelReportService {
    @Autowired
    CreateReservationRepository createReservationRepository;
    @Autowired
    HotelRepository hotelRepository;
    public List<HotelReport> getAllReport(){
        return hotelRepository.findAll();
    }

    public HotelReport statusRoomFinish(HotelReport hotelReport) throws Exception{
        ReservationRoom reserRoom = createReservationRepository.findById(hotelReport.getReservationId()).orElseThrow(()->new Exception("Tidak Ada Reservation"));
        reserRoom.setRoomStatus(ReservationRoom.RoomStatus.FINISH);
        createReservationRepository.save(reserRoom);
        Instant finish = Instant.now();
        hotelReport.setReservationRoom(reserRoom);
        hotelReport.setTglKeluar(finish);
        hotelRepository.save(hotelReport);
        return hotelReport;
    }
}
