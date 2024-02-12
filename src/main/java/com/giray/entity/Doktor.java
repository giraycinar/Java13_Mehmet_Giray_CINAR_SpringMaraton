package com.giray.entity;

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
@Table(name = "tbl_doktor")
public class Doktor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "ad",nullable = false,length = 50)
    String ad;
    @Column(name = "soyad",nullable = false,length = 50)
    String soyad;
    @Column(name = "adres",nullable = false,length = 300)
    String adres;
    @Column(name = "telefon",nullable = false,length = 20)
    String tel;
    Integer yas;
    String email;

    @ManyToOne
    Hastane hastane;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doktor", fetch = FetchType.EAGER)
    List<Brans> bransList;

    @ManyToOne
    Brans brans;




}
