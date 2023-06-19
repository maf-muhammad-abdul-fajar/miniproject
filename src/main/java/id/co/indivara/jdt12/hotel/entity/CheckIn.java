package id.co.indivara.jdt12.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "checkins")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CheckIn {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer checkinId;
    private int reservasiId;//fk
    private boolean checkinRoom;
    private String tglCheckin;
}
