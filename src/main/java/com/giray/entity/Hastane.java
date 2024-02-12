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
@Table(name = "tbl_hastane")
public class Hastane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @OneToMany(mappedBy = "hastane")
    List<Doktor> doktorList;

    @OneToMany(mappedBy = "hastane")
    List<RandevuTalepEden> randevuTalepEdenList;
}
