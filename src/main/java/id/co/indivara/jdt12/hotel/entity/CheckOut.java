package id.co.indivara.jdt12.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "checkouts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CheckOut {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int idReservasi;//fk
    private boolean roomCheckOut;
    private String tglCheckOut;
}
