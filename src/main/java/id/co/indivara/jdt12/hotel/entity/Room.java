package id.co.indivara.jdt12.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "rooms")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Room {
    @Id
    @Column(name = "room_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roomId;

    @Column(name = "room_number")
    private Integer roomNumber;
    @Column(name = "room_type")
    private String roomType;
    @Column(name = "price")
    private Integer price;
    @Column(name = "description")
    private String description;

}
