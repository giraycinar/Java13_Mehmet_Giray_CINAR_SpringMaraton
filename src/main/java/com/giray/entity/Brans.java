package com.giray.entity;

import com.giray.utility.enums.EBranslar;
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
@Table(name = "tbl_brans")
public class Brans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Enumerated
    EBranslar bransAdi;

    @ManyToOne
    Doktor doktor;

    @OneToMany(mappedBy = "brans")
    List<Doktor> doktorList;






}
