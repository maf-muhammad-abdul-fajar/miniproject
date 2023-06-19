package id.co.indivara.jdt12.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "customers")
//menunjukan bahwa menggunakan lombok
//buat getter setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//perintah agar id auto increment
    private Integer customerId;
    @Column(name = "name_customers")
    private String name;
    private int noHp;
    private String email;
    private int nik;
}
