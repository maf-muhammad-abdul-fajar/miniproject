package id.co.indivara.jdt12.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Reserves")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservasi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBooking;//fk
    private String tglCheckIn;
    private String tglCheckOut;
}
