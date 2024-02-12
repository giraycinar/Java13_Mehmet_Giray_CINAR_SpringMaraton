package com.giray.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_randevu")
public class Randevu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String hastaAdi;
    private String hastaSoyadi;
    private String hastaTelefon;
    private Long doktorId;
    private LocalDate randevuTarihi;
    private LocalTime randevuSaati;

    @ManyToOne
    RandevuTalepEden randevuTalepEden;
}
