package id.co.indivara.jdt12.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "room_availabities")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomAvailability {
}
