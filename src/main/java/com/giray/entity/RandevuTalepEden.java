package com.giray.entity;

import com.giray.utility.enums.ECinsiyet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_randevutalepeden")
public class RandevuTalepEden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, length = 11)
    String kimlikNo;
    @Column(name = "ad",nullable = false,length = 50)
    String ad;
    @Column(name = "soyad",nullable = false,length = 50)
    String soyad;
    Integer yas;
    String email;
    @Column(name = "telefon",nullable = false,length = 20)

    String tel;
    @Enumerated
    ECinsiyet cinsiyet;
    @Column(name = "adres",nullable = false,length = 300)
    String adres;

    @ManyToOne
    Hastane hastane;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "randevuTalepEden", fetch = FetchType.EAGER)
    List<Randevu> randevuList;

}
