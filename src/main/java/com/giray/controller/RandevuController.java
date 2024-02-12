package com.giray.controller;

import com.giray.dto.Request.RandevuRequestDto;
import com.giray.entity.Doktor;
import com.giray.entity.Randevu;
import com.giray.entity.RandevuTalepEden;
import com.giray.repository.DoktorRepository;
import com.giray.repository.RandevuRepository;
import com.giray.repository.RandevuTalepEdenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.giray.constants.RestApiUrls.*;
@RestController
@RequestMapping(RANDEVU)
@RequiredArgsConstructor
public class RandevuController {

//    @Autowired
//    private RandevuTalepEdenRepository randevuTalepEdenRepository;
//    @Autowired
//    private DoktorRepository doktorRepository;
//    @Autowired
//    private RandevuRepository randevuRepository;
//
//    @PostMapping("/al")
//    public ResponseEntity<String> randevuAl(@RequestBody RandevuRequestDto requestDto) {
//        RandevuTalepEden hasta = new RandevuTalepEden();
//        hasta.setAd(requestDto.getHastaAdi());
//        hasta.setSoyad(requestDto.getHastaSoyadi());
//        hasta.setTel(requestDto.getHastaTelefon());
//        randevuTalepEdenRepository.save(hasta);
//
//
//        Doktor doktor = doktorRepository.findById(requestDto.getDoktorId())
//               .orElseThrow(() -> new RuntimeException("Doktor bulunamadi"));
//
//        Randevu randevu = new Randevu();
//        randevu.setHastaAdi(hasta.getAd());
//        randevu.setDoktorId(doktor.getId());
//        randevu.setRandevuTarihi(requestDto.getRandevuTarihi());
//        randevu.setRandevuSaati(requestDto.getRandevuSaati());
//        randevuRepository.save(randevu);
//
//        return ResponseEntity.ok("Randevu basariyla alindi.");
//    }
//
//    public ResponseEntity<List<Randevu>> doktorRandevulariniGetir(@PathVariable Long doktorId) {
//        Doktor doktor = doktorRepository.findById(doktorId)
//                .orElseThrow(() -> new RuntimeException("Doktor bulunamadi"));
//
//        List<Randevu> randevular = randevuRepository.findByDoktor(doktor);
//        return ResponseEntity.ok(randevular);
//    }
}
