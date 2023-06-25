package id.co.indivara.jdt12.hotel.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "ReservationRoom")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ReservationRoom {
    @Id
    @Column(name = "reservation_id")
    private Integer reservationId;

    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "room_id")
    private Integer roomId;
    @Column(name = "checkIn")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Instant checkIn;
    @Column(name = "checkout")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Instant checkout;
    @Column(name = "status")
    private RoomStatus roomStatus;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id",insertable = false, updatable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Room room;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id",insertable = false,updatable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Customer customer;
    public enum RoomStatus{
        BOOKED,
        ON_GOING,
        FINISH
    }
}
