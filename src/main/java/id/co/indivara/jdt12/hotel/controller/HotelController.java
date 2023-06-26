package id.co.indivara.jdt12.hotel.controller;

import id.co.indivara.jdt12.hotel.entity.HotelReport;
import id.co.indivara.jdt12.hotel.service.HotelReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
    @Autowired
    HotelReportService hotelReportService;
    @GetMapping("/report")
    public List<HotelReport> getAllReport(){
        return hotelReportService.getAllReport();
    }
    @PostMapping("/report")
    public HotelReport reservationReport (@RequestBody HotelReport hotelReport) throws Exception{
        return hotelReportService.statusRoomFinish(hotelReport);
    }
}
