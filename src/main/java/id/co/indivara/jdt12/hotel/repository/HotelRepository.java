package id.co.indivara.jdt12.hotel.repository;

import id.co.indivara.jdt12.hotel.entity.HotelReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelReport,Integer> {
}
