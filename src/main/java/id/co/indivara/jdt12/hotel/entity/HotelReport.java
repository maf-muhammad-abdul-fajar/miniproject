package id.co.indivara.jdt12.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "HotelReport")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelReport {
    @Id
    @Column(name = "report_id")
    private Integer reportId;
    @Column(name = "reservation_id")
    private Integer reservationId;
    @Column(name = "rooms")
    private Integer rooms;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservation_id",insertable = false, updatable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private ReservationRoom reservationRoom;
}
