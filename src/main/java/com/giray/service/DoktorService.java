package com.giray.service;


import com.giray.dto.Request.DoktorAddRequestDto;
import com.giray.entity.Doktor;
import com.giray.entity.Randevu;
import com.giray.repository.DoktorRepository;
import com.giray.repository.RandevuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DoktorService {
    private final DoktorRepository doktorRepository;

//    public List<Doktor> findAll(){
//        return doktorRepository.findAll();
//    }
//

    public Doktor save(DoktorAddRequestDto dto){
        Doktor doktor = Doktor.builder()
                .ad(dto.getAd())
                .soyad(dto.getSoyad())
                .email(dto.getEmail())
                .adres(dto.getAdres())
                .yas(dto.getYas())
                .tel(dto.getTel())
                .build();
        return doktorRepository.save(doktor);
    }


    public List<Doktor> findAll(){
        List<Doktor> doktorList = doktorRepository.findAll();
        if(doktorList.isEmpty()){
            throw new NullPointerException("List is Empty");
        }
        return doktorList;
    }

    public Optional<Doktor> findById(Long aLong){
        Optional<Doktor> optionalProductList = doktorRepository.findById(aLong);
        if (optionalProductList.isEmpty()){
            throw new NullPointerException("List is Empty!!!");
        }
        return optionalProductList;
    }








}
