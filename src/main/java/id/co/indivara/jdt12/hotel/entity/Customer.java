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
    @Column(name = "customer_id")//Membuat kolom dengan nama customer id pada database
    @GeneratedValue(strategy = GenerationType.AUTO)//perintah agar id auto increment
    private Integer customerId;

    @Column(name = "customer_name")
    private String name;
    @Column(name = "noHp_customer")
    private String noHp;
    @Column(name = "customer_email")
    private String email;
    @Column(name = "customer_nik")
    private String nik;
    @Column(name = "address")
    private String address;
}
