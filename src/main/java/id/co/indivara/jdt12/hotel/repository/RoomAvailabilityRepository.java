package id.co.indivara.jdt12.hotel.repository;

import id.co.indivara.jdt12.hotel.entity.RoomAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomAvailabilityRepository extends JpaRepository<RoomAvailability, Integer> {
}
