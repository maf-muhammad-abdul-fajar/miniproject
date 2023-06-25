package id.co.indivara.jdt12.hotel.repository;

import id.co.indivara.jdt12.hotel.entity.ReservationRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CreateReservationRepository extends JpaRepository<ReservationRoom,Integer> {

    @Query(value = "SELECT \n" +
            "(CASE WHEN r.status <> 2 THEN 'no' ELSE 'yes' END) AS result\n" +
            "FROM rooms r\n" +
            "WHERE\n" +
            "r.room_id = :roomId \n" +
            "LIMIT 1",nativeQuery = true)
    String findRoomAvailbility(@Param("roomId") Integer roomId);
}
