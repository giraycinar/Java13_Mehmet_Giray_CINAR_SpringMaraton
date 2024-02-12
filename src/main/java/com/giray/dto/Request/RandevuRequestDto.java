package com.giray.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RandevuRequestDto {

    private String hastaAdi;
    private String hastaSoyadi;
    private String hastaTelefon;
    private Long doktorId;
    private LocalDate randevuTarihi;
    private LocalTime randevuSaati;

}
